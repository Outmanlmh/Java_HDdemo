package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.01.17 10:30.
 */
public class Test01 {

    public static void main(String[] args) {
        String str = "ZhangXin0w0@163.com";
        int isupper = 0;
        int islower = 0;
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                isupper++;
                System.out.println(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                islower++;
            } else if (Character.isDigit(chars[i])) {
                count++;
            }
        }
        System.out.println(isupper);
        System.out.println(islower);
        System.out.println(count);
    }
}
