package com.itdr.FirstProject.Test;
/*
* 求101-200之间的质数*/
public class Prime {
    public static void main(String[] args) {
        int m = 101;
        int n = 200;
        int count = 0;
        for (int i = m; i < n; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();

    }

    private static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 1)
            flag = false;
        else {
            for (int i = 2; i < n; i++) {
                if ((n % i == 0) || n == 1) {
                    flag = false;
                    break;
                } else
                    flag = true;
            }
        }
        return flag;
    }

}
