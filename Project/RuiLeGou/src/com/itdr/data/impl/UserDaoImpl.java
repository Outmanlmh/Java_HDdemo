package com.itdr.data.impl;

import com.itdr.data.UserData;
import com.itdr.domain.User;
import com.itdr.utils.JDBCUtil02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author LiMingHang
 * @date2019.02.18 20:31.
 */
public class UserDaoImpl implements UserData {

    @Override
    public Boolean add(User u) {
        return null;
    }

    @Override
    public void deleteOne(String uname) {

    }

    @Override
    public void changeOne(String uanme) {

    }

    @Override
    public Boolean selectOne(String uanme) {
        return null;
    }

    @Override
    public void selectAll() {

    }

    @Override
    public User selectOneUser(String uname) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;

        try {
            con = JDBCUtil02.getconn();
            String sql = "select * from user where username = ?";
            ps = con.prepareStatement(sql);
            //给username赋值
            ps.setString(1, uname);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new User();
                u.setUname(rs.getString("username"));
                u.setUpassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
}
