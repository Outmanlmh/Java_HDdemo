package com.itdr.JDBCTest;

import com.itdr.Utils.JDBCUtil02;

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
        for (int i = 0; i <10 ; i++) {
            Connection con = JDBCUtil02.getconn();

        }
    }

    @Override
    public Connection getConnection() throws SQLException {

        return null;
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
