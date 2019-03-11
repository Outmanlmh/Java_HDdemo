package com.neuedu.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.09 14:55.
 */
public class JDBCUtil2 {
    private static final String URL = "jdbc:mysql://localhost/dbrlg?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    //创建连接
    public static Connection getConn() {
        Connection conn = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //数据库操作
    public static int executeUpdate(String sql, Object... objs) {
        //获取连接
        Connection conn = getConn();
        PreparedStatement pst = null;
        int result = 0;
        try {
            //创建对象
            pst = conn.prepareStatement(sql);
            //向sql语句中加入参数
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    pst.setObject(i + 1, objs[i]);
                }
            }
            //执行sql语句
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, null);
        }
        return result;
    }

    public static <T> List<T> executeQuery(String sql, RowMap<T> rowMap, Object... objs) {
        List<T> lists = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        conn = getConn();
        try {
            pst = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    pst.setObject(i + 1, objs[i]);
                }
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                T t = rowMap.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, pst, rs);
        }
        return lists;
    }

    public static <T> T execteQuery(String sql,RowMap<T> rowMap,Object... objs) {
        Connection conn= null;
        PreparedStatement pst = null;
        ResultSet rs=null;
        T t=null;
        conn = getConn();
        try {
            pst = conn.prepareStatement(sql);
            for (int i=0;i<objs.length;i++){
                pst.setObject(i+1,objs[i]);
            }
            rs=pst.executeQuery();
            while (rs.next()){
                 t = rowMap.RowMapping(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeAll(conn,pst,rs);
        }
        return t;
    }



    //关闭连接
    public static void closeAll(Connection connn, PreparedStatement pst, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (pst != null) {
                    try {
                        pst.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } finally {
                        if (connn != null) {
                            try {
                                connn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

    }

}
