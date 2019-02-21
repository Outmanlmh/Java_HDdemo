package com.itdr.Test;

import com.itdr.Utils.JDBCUtil01;
import org.junit.Test;

import java.sql.*;

/**
 * @author LiMingHang
 * @date2019.02.18 11:08.
 */
public class Test_JUnit {

    @Test
    public void test() {
        //
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            //建立连接
            String url = "jdbc:mysql://localhost:3306/dbrlg";
            String user = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, user, password);

            //创建对象
            st = conn.createStatement();

            //执行sql语句
            String sql = "select * from user";

            //
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(
                        "id:" + rs.getInt("id") + " " +
                                "username:" + rs.getString("username") + " " +
                                "password:" + rs.getString("password")
                );
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test2() throws Exception {
       Connection conn = JDBCUtil01.getCon();
       String sql = "insert into teacher values(1,'xiaoming')";
       PreparedStatement ps = conn.prepareStatement(sql);
        int i = ps.executeUpdate();
        System.out.println("影响了"+i+"行");
        JDBCUtil01.closeALL(conn,ps);
    }

    @Test
    public void test3(){

    }


}
