package com.itdr.FirstProject.Java_xiancheng;

/**
 * @author LiMingHang
 * @date2019.01.29 15:05.
 */
public class Test1Demo extends Thread {
    private static int ticket = 100;

    public void run() {
        while (true) {
            if (ticket > 0) {
                ticket--;
                System.out.println(getName() + "正在出售第" + ticket + "张票");
            }
        }
    }

}
