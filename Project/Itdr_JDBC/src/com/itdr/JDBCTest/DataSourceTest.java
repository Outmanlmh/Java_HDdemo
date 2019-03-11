package com.itdr.JDBCTest;

import com.itdr.Utils.JDBCUtil02;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author LiMingHang
 * @date2019.02.19 14:36.
 */
public class DataSourceTest implements DataSource {

    //创建放连接的池子
    private  static List<Connection> li =new ArrayList<>();

    //往集合中放入提前创建好的连接

    public DataSourceTest(){
        for (int i = 0; i <5 ; i++) {
            Connection con = JDBCUtil02.getconn();
            li.add(con);
        }
    }
    //把不用的连接，重新放回到集合中
     public void backCon(Connection con){
         System.out.println("放回之前"+li.size());
        li.add(con);
         System.out.println("放回之后"+li.size());
     }

    @Override
    public Connection getConnection() throws SQLException {
        //如果集合中没有连接，就要创建几个再放进去
        if (li.size()<1){
            for (int i = 0; i <5 ; i++) {
                Connection cons= null;
                cons = JDBCUtil02.getconn();
                li.add(cons);
            }

        }
       //从集合中拿一个连接
        Connection con  = li.remove(0);
        return con;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
