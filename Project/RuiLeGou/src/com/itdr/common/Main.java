package com.itdr.common;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.02.20 19:35.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int f = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        for (int i = 1; i < 15; i++) {
            int sum = (i - 5) * 10 + x * i;
            if (sum <100 ) {
                System.out.println(i);
            }
        }
    }


}
