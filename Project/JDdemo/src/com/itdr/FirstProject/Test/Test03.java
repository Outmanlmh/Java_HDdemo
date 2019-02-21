package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.02.18 9:02.
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {7, 88, 66, 99, 100};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
