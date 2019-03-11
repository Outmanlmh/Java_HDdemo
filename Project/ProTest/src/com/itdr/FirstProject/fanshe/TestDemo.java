package com.itdr.FirstProject.fanshe;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Properties;

/**
 * @author LiMingHang
 * @date2019.02.23 16:25.
 */
public class TestDemo {
    @Test
    public void test1() throws Exception {
    //使用反射创建一个对象,并获取对象的私有方法  或 属性
        Class aClass  = Class.forName("com.itdr.FirstProject.fanshe.Users");
        Users  users= (Users) aClass.newInstance();

    //获取类的私有构造方法
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        System.out.println(declaredConstructors.length);//构造方法的个数

        for (int i = 0; i < declaredConstructors.length; i++) {
            Type[] genericParameterTypes =  declaredConstructors[i].getGenericParameterTypes();
            for (int i1 = 0; i1 < genericParameterTypes.length; i1++) {
                System.out.println(genericParameterTypes[i].toString());
            }
        }
    }

    @Test
    public void test2() throws Exception {
        Properties po = new Properties();
        InputStream in = new FileInputStream("test.properties");
        po.load(in);
        String  cname=  po.getProperty("classname");

        Class cl= Class.forName(cname);
        Object o = cl.newInstance();

        Field[] fields = cl.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getName().equals("name")){
                fields[i].setAccessible(true);
                fields[i].set(o,"xiaoming");
                Object o1 = fields[i].get(o);
                System.out.println(o1);
            }

        }


    }
}
