package com.neuedu.service;

import com.neuedu.pojo.User;
import com.neuedu.utils.ResultData;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();
    public List<User> getUsers(String keyword);
    public ResultData getUsers(int pageNum, int pageSize);
    public  int insert(User user);
    public  int delete(int id);
    public int  update(User user);
    public User getUserById(int id);
    public User getUserByUname(String uname,String pwd);

}
