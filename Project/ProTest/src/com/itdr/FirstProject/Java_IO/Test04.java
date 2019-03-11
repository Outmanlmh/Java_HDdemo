package com.itdr.FirstProject.Java_IO;

import java.io.*;
import java.util.Arrays;

/**
 * @author LiMingHang
 * @date2019.01.30 9:22.
 */
public class Test04 extends Thread {
    @Override
    public void run() {
        //创建一个文件
        File f = new File("E:\\xiaoming.txt");
        BufferedReader br = null;
        FileOutputStream fos =null;
        //创建文件输入流
        try {
            new FileOutputStream(f);
            fos.write("再不写日志的同学，就把Java所有的格式抄十遍".getBytes());
            System.out.println(getName() + "成功了");
            br = new BufferedReader(new FileReader("E:\\xiaoming.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}