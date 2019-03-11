package com.neuedu.dao;

import com.neuedu.pojo.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.04 18:10.
 */
public class Test {
    //声明常量
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/rlgdb?useUnicode=true&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PWD = "root";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获取连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PWD);
            Statement statement = conn.createStatement();
            String sql = "select * from user";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("uname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //增加
    public static int add() {
        int result = 0;
        try {
            Connection conn = getConnection();
            String sql = "insert into user (uname,password) values(?,?)";
            PreparedStatement preps = conn.prepareStatement(sql);
            preps.setString(1, "xiaoming");
            preps.setString(2, "666666");
            result = preps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //删除
    public static int delete() {
        int result = 0;
        Connection conn = getConnection();
        try {
            String sql = "delete from  user where id = ?";
            PreparedStatement preps = conn.prepareStatement(sql);
            preps.setInt(1, 9);
            result = preps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static int executeUpdate(String sql, Object... objs) {
        int result = 0;
        Connection conn = getConnection();
        PreparedStatement preps = null;
        try {

            preps = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    preps.setObject(i + 1, objs[i]);
                }
            }
            result = preps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Close(null,preps,conn);
        }
        return result;
    }

    public static <T>List<T> executeQuery(String sql,RowMap<T> rowMap, Object... objs) {
        List<T> lists= new ArrayList<>();
        Connection conn = getConnection();
        PreparedStatement preps = null;
        ResultSet rs = null;
        try {
            preps = conn.prepareStatement(sql);
            if (objs != null) {
                for (int i = 0; i < objs.length; i++) {
                    preps.setObject(i + 1, objs[i]);
                }
            }
            rs = preps.executeQuery();
            while (rs.next()){
                T t = rowMap.RowMapping(rs);
                lists.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Close(rs,preps,conn);
        }
        return lists;
    }

    public  static  void Close(ResultSet rs, PreparedStatement prep, Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if (prep!=null){
                    try {
                        prep.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }finally {
                        if (conn!= null){
                            try {
                                conn.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        List<Category> categories =executeQuery("select * from user", new RowMap<Category>() {
            @Override
            public Category RowMapping(ResultSet rs) {
                Category category = new Category();
                try {
                   category.setId(rs.getInt("id"));
                   category.setName(rs.getString("name"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }, null);
        for (Category cate:categories
             ) {


        }
    }
}
