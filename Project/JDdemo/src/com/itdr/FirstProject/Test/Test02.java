package com.itdr.FirstProject.Test;

/**
 * @author LiMingHang
 * @date2019.02.12 17:25.
 */
public class Test02 {
    public static void main(String[] args) {
        int []arr = {-10,2,3,246,-100,0,5};
        int sum = 0;
        int max= arr[0];
        int min = arr[0];
        double avg = 0;
        for(int i= 0 ; i<arr.length;i++){

            int temp;
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum += arr[i];

        }
        avg = 	sum/arr.length;
        System.out.print(avg+" " + max+ " "+ min);
    }
}
