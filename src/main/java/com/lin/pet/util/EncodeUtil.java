package com.lin.pet.util;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Base64;

/**
 *
 * @author linjunqin
 *
 */

public class EncodeUtil {

    /**
     * MD5加密
     *
     * @param string
     * @return 32位16进制编码
     */
    public static String encodeMD5(String string) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] hex = md5.digest(string.getBytes("UTF-8"));
            String hexString = "";
            for (byte b : hex) {
                int temp = b & 255;
                if (temp < 16 && temp >= 0) {
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }
            return hexString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     *
     * @param s
     * @return base64 编码字符串
     */
    public static String encodeBase64(String s){
        if (s==null || "".equals(s)) {
            return "";
        }
        try {
            return Base64.getEncoder().encodeToString(s.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     *
     * @param s
     * @return base64 解码后的字符串
     */
    public static String decodeBase64(String s){
        if (s==null || "".equals(s)) {
            return "";
        }
        try {
            return new String(Base64.getDecoder().decode(s),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
