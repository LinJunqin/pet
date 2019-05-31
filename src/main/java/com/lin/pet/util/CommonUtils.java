package com.lin.pet.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * Created by yonah on 15-11-13.
 */
public class CommonUtils {
    
    static Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    /**
     * 生成token
     * @return 生成一个UUID并返回
     */

    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    private static char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };

    public static String byteArrayToHex(byte[] byteArray) {

        // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））

        char[] resultCharArray = new char[byteArray.length * 2];


        // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        // 字符数组组合成字符串返回
        return new String(resultCharArray);
    }

        /**
         * 进行md5加密
         * @return 返回经过md5加密后的字符串
         */
    public static String md5(String password) {
        try {
            MessageDigest MD5 = MessageDigest.getInstance("MD5");
            MD5.update(password.getBytes());
            return byteArrayToHex(MD5.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return password;
    }
    /**
     * 进行md5加密
     * @return 返回经过md5加密后的字符串
     */
    public static String md5(byte[] bytes) throws NoSuchAlgorithmException {
        MessageDigest MD5 = MessageDigest.getInstance("MD5");
        MD5.update(bytes);
        return byteArrayToHex(MD5.digest());
    }

    /**     * 验证Email
     * * @param email email地址，格式：zhang@gmail.com，zhang@xxx.com.cn，xxx代表邮件服务商
     * 允许为""
     * * @return 验证成功返回true，验证失败返回false
     * */
    public static boolean checkEmail(String email) {
        if(email.equals(""))
            return true;
        else {
            String regex = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
            return Pattern.matches(regex, email);
        }
    }
    /**
     * 验证用户名
     * @return 用户名合法则返回true,否则返回false
     */
    public static boolean checkName(String name){
        String regex="^[0-9a-zA-Z_]{6,10}$";
        return Pattern.matches(regex, name);
    }
    /**
     * 验证密码
     * @return 密码合法则返回true,否则返回false
     */
    public static boolean checkPassword(String password){
        String regex="^[0-9a-zA-Z]{6,10}$";
        return Pattern.matches(regex, password);
    }
    /**
     * 验证手机号码
     * 允许为""
     */
    public static boolean checkPhone(String phone){
        if(phone.equals(""))
            return true;
        else {
            String regex = "^1\\d{10}$";
            return Pattern.matches(regex, phone);
        }
    }
    /**
     * 验证性别
     */
    public static boolean checkSex(int sex){
        return !(sex != 1 && sex != 0);
    }
    /**
     * 验证昵称
     */
    public static boolean checkNick(String nick){
        String regex="^[a-zA-Z0-9\\u4e00-\\u9fa5]{1,11}$";
        return Pattern.matches(regex,nick);
    }
    /**
     * 验证个性签名
     */
    public static boolean checkSignInfo(String signInfo){
        if("".equals(signInfo)){
            return true;
        }
        else {
            String regex = "^[a-zA-Z0-9,.?!，。？！\\u4e00-\\u9fa5]{1,140}$";
            return Pattern.matches(regex, signInfo);
        }
    }

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static String formatToString(Date date){
        return dateFormat.format(date);
    }

    public static Date formatToDate(String date){
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String getWxSign(SortedMap<String, String> map, String key){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()){
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        sb.append("key=");
        sb.append(key);
        logger.debug(sb.toString());
        return CommonUtils.md5(sb.toString()).toUpperCase();
    }
}

