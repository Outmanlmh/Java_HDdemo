package com.neuedu.utils;

import java.util.Random;

/**
 * @author LiMingHang
 * @date2019.03.05 15:55.
 */
public class TestMain {
    public static void main(String[] args) {
     int count = 0;
     int num = 0;
     for (int i =0 ; i<=100;i++){
         num = num+i;
          count++;
     }
        System.out.println(num*count);
    }
}
