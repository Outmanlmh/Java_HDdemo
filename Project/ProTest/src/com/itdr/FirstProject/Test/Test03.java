package com.itdr.FirstProject.Test;

import org.junit.Test;

/**
 * @author LiMingHang
 * @date2019.02.18 9:02.
 */
public class Test03 {

    @Test
    public void test(){
        //冒泡排序
        int[] arr = {22, 178, 93, 18, 23, 96, 92};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j= 0; j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("经过冒泡排序之后的数组：");
        for (int arrs : arr) {
            System.out.print( " "+arrs);
        }
    }


}
