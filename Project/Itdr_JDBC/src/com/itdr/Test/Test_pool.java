package com.itdr.Test;

import com.itdr.JDBCTest.DataSourceTest;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author LiMingHang
 * @date2019.02.25 19:36.
 */
public class Test_pool {

    @Test
    public void test() throws SQLException {
        DataSourceTest ds = new DataSourceTest();
        Connection con = ds.getConnection();
        Statement sta=  con.createStatement();
        ResultSet resultSet = sta.executeQuery("select  * from  user");
        while (resultSet.next()){
            System.out.println(resultSet.getString(2));
        }

    }
}
