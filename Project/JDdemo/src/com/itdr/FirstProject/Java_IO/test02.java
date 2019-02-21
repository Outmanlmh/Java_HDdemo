package com.itdr.FirstProject.Java_IO;

import java.util.Arrays;

/**
 * @author LiMingHang
 * @date2019.01.28 21:15.
 */
public class test02 {
    public static void main(String[] args) {
         String s= "我爱你中国";
         byte[] bys = s.getBytes();
         System.out.println(Arrays.toString(bys));
    }
}
