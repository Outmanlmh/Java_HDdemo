package com.itdr.FirstProject.Test;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.02.25 9:17.
 */
public class Test_erfen {

    public static void main(String[] args) {
        int arr[] = {22, 178, 93, 18, 23, 96, 92};

        System.out.println(Test(arr,18));
    }

    public  static int Test( int arr[],int key) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int middle = (low + high) / 2;
            if (key == arr[middle]) {
                return middle;
                // System.out.println("数组中的第" + middle + "个元素" + arr[middle]);
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else if (key < arr[middle]) {
                high = middle - 1;
            }
            System.out.println(arr[middle]);
        }
        return -1;
    }
}
