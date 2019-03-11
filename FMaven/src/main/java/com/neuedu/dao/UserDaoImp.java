package com.neuedu.dao;

import com.neuedu.pojo.User;
import com.neuedu.utils.JDBCUtil;
import com.neuedu.utils.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.05 12:32.
 */
public class UserDaoImp implements  IUserDao{
    @Override
    public List<User> getUsers() {
        return JDBCUtil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setId(rs.getInt("id"));
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setTele(rs.getString("tele"));
                    user.setSex(rs.getInt("sex"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, null);
    }

    @Override
    public List<User> getUsers(String keyword) {
        return JDBCUtil.executeQuery("select * from user where uname like concat('%',?,'%')", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setTele(rs.getString("tele"));
                    user.setId(rs.getInt("id"));
                    user.setSex(rs.getInt("sex"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, keyword);
    }

    @Override
    public List<User> getUsers(int pageNum, int pageSize) {
        return JDBCUtil.executeQuery("select * from user limit?,?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                return null;
            }
        }, pageNum-1, pageSize);
    }

    @Override
    public int getCount() {
        return JDBCUtil.queryCount("select count(id) from user");
    }
    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate( "insert into user (uname,password,tele,sex)values(?,?,?,?)",user.getUname(),user.getPassword(),user.getTele(),user.getSex());
    }

    @Override
    public int delete(int id) {
        return JDBCUtil.executeUpdate("delete from user where id = ?",id);
    }

    @Override
    public int update(User user) {
        return JDBCUtil.executeUpdate("update user set uname =?,password = ?,tele=? ,sex=? where id=?",user.getUname(),user.getPassword(),user.getTele(),user.getSex(),user.getId());
    }

    @Override
    public User getUserById(int id) {
        return JDBCUtil.QueryOne("select * from user where id=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setTele(rs.getString("tele"));
                    user.setId(rs.getInt("id"));
                    user.setSex(rs.getInt("sex"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, id);
    }

    @Override
    public User getUserByUname(String uname,String pwd) {
        return JDBCUtil.QueryOne("select * from user where uname=?", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User user = new User();
                try {
                    user.setUname(rs.getString("uname"));
                    user.setPassword(rs.getString("password"));
                    user.setTele(rs.getString("tele"));
                    user.setId(rs.getInt("id"));
                    user.setSex(rs.getInt("sex"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                return user;
            }
        }, uname);
    }

    @Override
    public int getUser(String uname) {
        return JDBCUtil.queryCount("select count(id) from user where uname =?",uname);
    }
}
