package com.itdr.FirstProject.Test;

import java.util.Scanner;

/**
 * @author LiMingHang
 * @date2019.01.14 9:22.
 */
public class Test_java {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //判断平年，闰年=======
//        System.out.println("请输入要判断的年份：");
//
//        int year = sc.nextInt();
//        if((year%4==0&&year%100!=0)|(year%400==0)){
//            System.out.println("是闰年");
//        }else{
//            System.out.println("不是闰年");
//        }


//        //判断第一个整数是否是第二个整数的倍数======
//        System.out.println("请输入两个整数：");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if(x%y==0){
//            System.out.println("是倍数");
//        }else{ System.out.println("不是倍数");}

//        //判断输入的年份和月份各有多少天=======
//        System.out.println("请输入要判断的年份：");
//        System.out.println("请输入要判断的月份：");
//        int year = sc.nextInt();
//        int month = sc.nextInt();
//        if((year%4==0&&year%100!=0)|(year%400==0)){
//            System.out.println("是闰年，有366天");
//
//            switch (month){
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12: System.out.println("本月有31天");break;
//                case 2:  System.out.println("本月有29天");break;
//                case 4:
//                case 6:
//                case 9:
//                case 11: System.out.println("本月有30天");break;
//            }
//        }else{
//            System.out.println("不是闰年,有365天");
//            switch (month){
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12: System.out.println("本月有31天");break;
//                case 2:  System.out.println("本月有28天");break;
//                case 4:
//                case 6:
//                case 9:
//                case 11: System.out.println("本月有30天");break;
//            }
//
//        }

//        //第四题=======================================
//        System.out.println("请输入学生的成绩：");
//        int score = sc.nextInt();
//        switch (score/10){
//            case 10:
//            case 9:System.out.println("AAA");break;//90<=score<=100
//            case 8:System.out.println("BBB");break;//80<=score<90
//            case 7:System.out.println("CCC");break;//70<=score<80
//            case 6:System.out.println("DDD");break;//60<=score<70
//            case 5:
//            case 4:
//            case 3:
//            case 2:
//            case 1:
//            case 0:System.out.println("EEE");break;//score<60
//        }


//        //第五题==========用while循环求1~100以内所有奇数的和==================
//        int x=1;
//        int sum = 0;
//        while (x<100){
//            sum = sum + x;
//            x = x+2;
//            System.out.println(sum);
//        }
//        //第六题        使用while循环求式子2+22+222+2222+22222的和
//         int p=0 ;
//         int sum = 0;
//         while (p!=22222){
//             p=p*10+2;
//            sum += p;
//            System.out.println(sum);
//         }


////       7. 请编程验证一下“角谷猜想”
//        System.out.println("请输入任意自然数");
//        int number = sc.nextInt();
//        while(number!=1){
//            if(number%2==0){
//                number = number/2;
//                System.out.println(number);
//            }else{
//             number = number*3+1;
//                System.out.println(number);
//            }
//        }
//        System.out.println(number);


//        //8、判断并输出500以内既能够被3整除又能够被6整除的整数。
//        int sum = 0;
//        for(int x=0;x<=500;x++){
//            if(x%3==0&&x%6==0){
//                System.out.println(x);
//            }
//        }
        //9.用for循环输出三角形
//        System.out.println("请输入您要打印的直角三角形的行数（只能为整数）");
//        int n = sc.nextInt();
//        for(int x = 1; x<=n;x++){
//             for(int y = 1; y<=(x*2-1);y++){
//                 System.out.print("*");
//             }
//             System.out.println();
//        }
//        System.out.println("请输入您要打印的等腰三角形的行数（只能为整数）");
//        int n = sc.nextInt();
//        for(int x=1; x<=n; x++ ) {
//            for (int z = n - x; z >= 0; z--) {
//                System.out.print(" ");  //每行的空格数
//            }
//            for (int y = 1; y <= (x * 2 - 1); y++) {
//                System.out.print("*");//每行的星星数
//            }
//            System.out.println();
//        }

////        10.搬砖问题
//        for(int man=0;man<=9;man++){
//            for (int woman=0;woman<=12;woman++){
//                for (int kid=0;kid<=36-woman-man;kid++){
//                    if(man*4+woman*3+kid/2==36&&man+woman+kid==36){
//                        System.out.println("男人："+man+"女人"+woman+"小孩："+kid);
//                    }
//
//                }
//            }
//        }

//    //11.输入两个正整数m和n，求其最大公约数和最小公倍数。
//            System.out.println("请输入两个正整数");
//            int m= sc.nextInt();
//            int n= sc.nextInt();
//            int min = m>n? n:m;
//         int x1= 0 ;
//           for(int i=1;i<=min;i++){
//               int temp = 0;
//                if(m%i==0&n%i==0){
//                    x1=i;
//                 if(i>x1){
//                       temp=i;
//                       i=x1;
//                       x1=temp;
//                    }
//                }
//           }
//               System.out.println("最大公约数为："+x1);
//               System.out.println("最小公倍数为："+m*n/x1);

////         12.求1000以内的完数
//           for (int x=1;x<=1000;x++ ) {
//               int sum = 0;
//               for (int i = 1; i < x; i++) {
//                   if (x % i == 0) {
//                       sum = sum+i;
//                   }
//               }
//                   if(sum==x){
//                       System.out.println(x);
//                   }
//           }
//         13.输入三个数字从小到大排序
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int temp= 0;
//
//        if(num1>num2){
//            temp = num1;num1=num2;num2=temp;
//        } else  if(num2>num3){
//           temp =num2;num2=num3;num3=temp;
//        }
//        if( num1> num3){
//          temp=num1;num1=num2;num2=temp;
//        }
//        System.out.println(num1+"<"+num2+"<"+num3);


////        14题
//        System.out.println("请输入要判断的月份：");
//        int month = sc.nextInt();
//            switch (month){
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12: System.out.println("本月有31天");break;
//                case 2:  System.out.println("本月有28天");break;
//                case 4:
//                case 6:
//                case 9:
//                case 11: System.out.println("本月有30天");break;
//        }
////          15.判断整数和负数
//        System.out.println("请输入要判断的数字");
//            float num;
//            int count2 = 0, count1 = 0;
//            do{
//                num =sc.nextFloat();
//                if (num % 1 == 0) {
//                    count1++;
//                    System.out.println("整数有：" + count1);
//                }  if (num <0) {
//                    count2++;
//                    System.out.println("负数有" + count2);
//                }
//            }while ( num!=0);

//        16 计算面积
//        System.out.print("请输入所要求的图形类型（1.三角形2.正方形3.圆）");
//        int type = sc.nextInt();
//        switch (type){
//            case 1: System.out.print("请输入三角形的底");
//                        float di = sc.nextFloat();
//                    System.out.print("请输入三角形的高");
//                        float gao = sc.nextFloat();
//                        System.out.println("三角形的面积是："+0.5*di*gao);break;
//            case 2:System.out.print("请输入正方形的边长");
//                        float a = sc.nextFloat();
//                  System.out.println("正方形的面积是："+a*a);break;
//            case 3:System.out.print("请输入圆的半径");
//                        float r = sc.nextFloat();
//                 System.out.println("圆的面积是："+3.14*r*r);break;
//        }

//        int count = 0;
//        while (count < 3){
//            System.out.println("请输入用户名");
//            String name = sc.next();
//            System.out.println("请输入密码");
//            String pwd = sc.next();
//            if (name.equals("admin") && pwd.equals("111")) {
//                System.out.println("登陆成功");break;
//            } else {
//                System.out.println("用户名或密码不正确，请重新输入!");
//            }
//            count++;
//        }

//        18
//        for ( int n=1;n<=9;n++)
//        { for (int m=1;m<=n;m++)
//        {
//            System.out.print(m+ "*" + n + "=" + (n*m) + "\t");      //"\t"为制表符 ,print 为 输出不换行
//        }
//            System.out.println();     //换行   println为 输出换行
//        }

        // 19
//            int count =0;
//        for (int j = 2; j <= 100; j++) {
//            if(PrimeNum(j) == 1) {
//                count=count+1;
//                if(count%6==0){
//                    System.out.println();}
//                else
//                    System.out.print(j+" ");
//            }
//        }
//    }
//    static int PrimeNum(int num) {
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                return 0;
//            }
//        }
//        return 1;

//        System.out.print("输入距离：");
//        int longth = sc.nextInt();
//        System.out.print("输入时间（只输入小时）：");
//        int time = sc.nextInt();
//        double jutiprice = 0;
//        int price = 0;
//        int ranyou = 1;
//        sc.close();
//        if (time > 8 && time < 21) {
//            int start = 6;
//            if (longth <= 2) {
//                price = start;
//            } else {
//                jutiprice = (start + (longth - 2) * 1.5);
//                if (jutiprice - (int) jutiprice >= 0.5) {
//                    price = (int) jutiprice + 1;
//                } else {
//                    price = (int) jutiprice;
//                }
//            }
//        } else {
//            int start = 7;
//            if (longth <= 2) {
//                price = start;
//            } else {
//                jutiprice = (start + (longth - 2) * 1.5);
//                if (jutiprice - (int) jutiprice >= 0.5) {
//                    price = (int) jutiprice + 1;
//                } else {
//                    price = (int) jutiprice;
//                }
//            }
//        }
//        System.out.println(price + ranyou);
        int[]arr={8,9,6,10,5};
        int max= arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
