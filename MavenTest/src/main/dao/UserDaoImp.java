package main.dao;

import pojo.User;
import utils.JDBCUtil;

/**
 * @author LiMingHang
 * @date2019.03.11 9:32.
 */
public class UserDaoImp implements UserDao {
    @Override
    public int insert(User user) {
        return JDBCUtil.executeUpdate("insert into user (uname,sex,password,tele)values(?,?,?,?)",user.getUname(),user.getSex(),user.getPassword(),user.getTele());
    }
}
