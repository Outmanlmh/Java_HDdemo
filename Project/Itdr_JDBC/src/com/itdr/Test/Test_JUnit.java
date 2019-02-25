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
       Connection conn = JDBCUtil01.getcon();
       String sql = "insert into user values(null ,'xiaohang','777')";
       PreparedStatement ps = conn.prepareStatement(sql);
        int i = ps.executeUpdate();
        System.out.println("影响了"+i+"行");
        JDBCUtil01.closeAll(conn,ps);
    }

    @Test
    public void test3() throws Exception {

        Connection con  = JDBCUtil01.getcon();
        //sql语句
        String sql = "insert into user values(null,'小霞','123465')";
        //创建对象
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        int i = preparedStatement.executeUpdate();
        JDBCUtil01.closeAll(con,preparedStatement);
    }


}
