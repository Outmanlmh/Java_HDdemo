package com.itdr.FirstProject.fanshe.tests;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author LiMingHang
 * @date2019.02.25 16:30.
 */
public class Test01  {
    @Test
    public void test1() throws Exception {
        Properties po = new Properties();
        InputStream in = new FileInputStream("user.properties");
        po.load(in);
        String classname=po.getProperty("classname");
        UserInit user = (UserInit) Class.forName(classname).newInstance();
        user.login();

    }
}
