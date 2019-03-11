package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.05 12:31.
 */
public interface IUserDao {
    public List<User> getUsers();

    public List<User> getUsers(String keyword);

    public List<User>getUsers(int pageNum,int pageSize);

    public int getCount();

    public int insert(User user);

    public int delete(int id);

    public int update(User user);

    public User getUserById(int id);

    public User getUserByUname(String uname,String pwd);

    public int getUser(String uname);



}
