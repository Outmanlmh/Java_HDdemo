package com.itdr.FirstProject.Java_IO;

import java.io.*;
import java.util.Arrays;


/**
 * @author LiMingHang
 * @date2019.01.29 8:37.
 */
public class Test03 {
    public static void main(String[] args) {
        //向文件中写入数据
        FileOutputStream fos = null;
        File f = new File("E:\\xiaoming.txt");
        try {
            fos = new FileOutputStream(f);
            fos.write("中国\r\n真棒".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //读取文件中的数据
        FileInputStream fis = null;
        //创建一个文件
        File f1 = new File("E:\\xiaoming.txt");

        try {
            fis = new FileInputStream(f1);
            byte[] bytes = new byte[1024];
            int result = 0;
            while (result != -1) {
                result = fis.read(bytes);
            }
            String str = Arrays.toString(bytes);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader("E:\\xiaoming.txt"));
            String s = "";
           StringBuffer stb = new StringBuffer();
           while (br.ready()){
               s = br.readLine();
               System.out.println("第一行"+s);
               stb.append(s);
           }
            System.out.println("第二行"+stb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
