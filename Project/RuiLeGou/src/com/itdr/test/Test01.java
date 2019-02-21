package com.itdr.test;

import com.itdr.utils.JDBCUtil02;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author LiMingHang
 * @date2019.02.18 20:03.
 */
public class Test01 {

    @Test
    public void test1() throws IOException {
        Properties properties = new Properties();
        //通过获取到项目文件的输入字节流，完成文件加载
        InputStream resourceAsStream = JDBCUtil02.class.getClassLoader().getResourceAsStream("jdbc.properties");


            //加载文件到properties对象
            properties.load(resourceAsStream);
            //调用properties对象的方法，通过键获取到对应的值
            String driver = properties.getProperty("driver");
        System.out.println(driver);

    }
}
