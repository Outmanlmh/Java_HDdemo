package com.itdr.FirstProject.Java_IO;



import java.io.*;

/**
 * @author LiMingHang
 * @date2019.03.05 19:32.
 */
public class test_fuxi {
    public static void main(String[] args) {
        /*     *//*
         * 字节流 输入
         * 那个文件
         * 在java中用byte数组接收
         * 查看接收内容
         * 关闭流*//*

        File file = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            is.read(b);
            System.out.println(new String(b));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //字节输出流  向文件中写入数据
        File file1 = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(file1, true);//true表示向文件中追加数据，不覆盖原有数据
            String str = "java";
            os.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //字符输入流
        File file2 = new File("C:\\Users\\QQ\\Desktop\\test.txt");

        try {
            Reader reader = new FileReader(file2);
            char[] chars = new char[1024];
            reader.read(chars);
            System.out.println(new String(chars));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //字符输出流
        File file3 = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(file3, true);
            writer.write("very good!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //缓冲流 读
        File file4 = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file4);
            BufferedReader br = new BufferedReader(reader);
            String s = br.readLine();//读取文件中的一行
            //循环读取文件中的数据
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //缓冲流 写入
        File file5 = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        BufferedWriter writer2 = null;
        try {
            Writer writer1 = new FileWriter(file5);
            writer2 = new BufferedWriter(writer1);
            //换行写入数据
            writer2.write("sadsad");
            writer2.newLine();
            writer2.write("sadsad");
            writer2.newLine();
            writer2.write("sadsad");
            writer2.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file6 = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        Writer w = null;
        PrintWriter printWriter = null;
        try {
            w = new FileWriter(file6);
            printWriter = new PrintWriter(w);
            for (int i = 0; i<=5; i++){
                printWriter.println("sdlkajsl;kdj;laksjdf;l ksjd "+i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            printWriter.close();
        }*/
    /*    File file = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        try {
            InputStream is = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader re = new BufferedReader(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
    //
   /*     File file = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        ObjectOutputStream oos = null;
        try {
            Student student = new Student();
            student.setName("sda sda");

            OutputStream os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
             File file = new File("C:\\Users\\QQ\\Desktop\\test.txt");
        InputStream in = null;
        try {
            in = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(in);
            Student student = (Student)ois.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


