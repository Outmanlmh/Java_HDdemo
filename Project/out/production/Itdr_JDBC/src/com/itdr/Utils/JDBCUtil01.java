package com.itdr.Utils;

import java.sql.*;

/**
 * @author LiMingHang
 * @date2019.02.18 13:52.
 */
public class JDBCUtil01 {





    public static Connection getcon() throws ClassNotFoundException {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/rlgdb";
        String user = "root";
        String password = "root";
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        try {
            //创建连接
            con = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeAll(Connection con, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (con != null)
                        con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void closeAll(Connection con, PreparedStatement ps) {

        try {
            if (ps != null)
                ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeALL(Connection conn, Statement st, ResultSet rs) {

    }
}