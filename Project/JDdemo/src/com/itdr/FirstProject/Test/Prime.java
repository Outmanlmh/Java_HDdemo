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
    //计算一个正整数的质因数
      /*     Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = sc.nextInt();
        //int num = 90;
        int k = 2;
        System.out.print(num + "=");//输出第一步格式
        while (num > k) {//初值k为2,num为输入的数字,在程序执行的过程中k渐渐变大(k++),n渐渐变小(num/k)
            if (num % k == 0) {
                System.out.print(k + "×");//如果num <> k，但n能被k整除，则应打印出k的值
                num = num / k;//num除以k的商,作为新的正整数你num
            }else if (num % k != 0) {
                k++;
            }
        }
        System.out.println(k);*/

}
