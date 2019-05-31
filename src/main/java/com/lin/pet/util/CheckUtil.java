package com.lin.pet.util;

import java.util.regex.Pattern;

/**
 * @author linjunqin
 *
 */

public class CheckUtil {

    private static Pattern mobilePattern = Pattern.compile("^0?(13[0-9]|15[012356789]|17[013678]|18[0-9]|14[57])[0-9]{8}$");
    private static Pattern emailPattern = Pattern.compile("^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

    /**
     *
     * @param mobile
     * @return  手机号码格式是否正确
     */
    public static boolean isMobile(String mobile) {
        return mobilePattern.matcher(mobile).matches();
    }

    /**
     *
     * @param email
     * @return 是否为邮箱
     */
    public static boolean isEmail(String email) {
        return emailPattern.matcher(email).matches();
    }


}
