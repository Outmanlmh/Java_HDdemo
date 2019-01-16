package com.itdr.FirstProject.DGame;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.01.14 9:24.
 */
public class DWeapoon {
    public String name;
    public int length;
    public int weight;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.进入选择武器界面
        DWeapoon.select();
        //2.进入武器列表
        DWeapoon[] dWeapoon = weapoon();
        bianl(dWeapoon);
        //3.选择武器
        System.out.println("请输入武器编号：");
        int x = sc.nextInt();
        System.out.println("选择的武器是:" + dWeapoon[x].length + "米" + dWeapoon[x].weight + "吨重的" + dWeapoon[x].name);
    }

    //武器旁白
    public static void select() {
        System.out.println("请选择英雄使用的武器");
    }

    //获取武器的数组
    public static DWeapoon[] weapoon() {
        DWeapoon[] dWeapoons = new DWeapoon[3];
        DWeapoon DW = new DWeapoon();
        DW.name = "青龙偃月刀";
        DW.length = 22;
        DW.weight = 22;
        DWeapoon DW1 = new DWeapoon();
        DW1.name = "杀人书";
        DW1.length = 33;
        DW1.weight = 33;
        DWeapoon DW2 = new DWeapoon();
        DW2.name = "寒冰箭";
        DW2.length = 44;
        DW2.weight = 44;
        dWeapoons[0] = DW;
        dWeapoons[1] = DW1;
        dWeapoons[2] = DW2;
        return dWeapoons;
    }

    public static void bianl(DWeapoon[] dWeapoons) {
        for (int i = 0; i < dWeapoons.length; i++) {
            System.out.println(dWeapoons[i].length + "米" + dWeapoons[i].weight + "吨重的" + dWeapoons[i].name);
        }
    }

}
