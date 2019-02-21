package com.itdr.FirstProject.Java_IO;

import java.io.*;

/**
 * @author LiMingHang
 * @date2019.01.28 21:15.
 */
public class test01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis =null;
        BufferedReader bis =null;
        try {
            //向文件中写入内容
            fos = new FileOutputStream("E:\\outman.txt");
            String s = "你好\r\n小明";
            byte[] by = s.getBytes();
            fos.write(by);

         /*   //读取文件中的内容，存入到数组中
            byte [] bytes = new byte[1024];
            //准备读取数据
             fis = new FileInputStream("E:\\outman.txt");
            //这是判断是否有数据的变量
            int result = 0;
            while (result != -1){
                result = fis.read(bytes);
            }
            //把数组转换成字符串
            String su=  Arrays.toString(bytes);

            //输出看结果
            System.out.println(su);*/

//            bis =  new BufferedReader(
//                 new InputStreamReader(new FileInputStream("E:\\outman.txt")));
            bis =  new BufferedReader(
                    new FileReader("E:\\outman.txt"));
            // int result = 0;
            String s1 ="";
            StringBuffer stb = new StringBuffer();
            while (bis.ready()){
                s1 = bis.readLine();
                System.out.println("第一行"+s1);
                stb.append(s1);
            }

            System.out.println("第二行"+stb);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
//              fis.close();
                fos.close();
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
