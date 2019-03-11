package com.neuedu.service;

import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImp;
import com.neuedu.pojo.User;
import com.neuedu.utils.JDBCUtil;
import com.neuedu.utils.ResultData;

import java.util.List;

/**
 * @author LiMingHang
 * @date2019.03.05 12:36.
 */
public class IUserServiceImp implements  IUserService {
    IUserDao iUserDao = new UserDaoImp();
    @Override
    public List<User> getUsers() {
        return iUserDao.getUsers();
    }

    @Override
    public List<User> getUsers(String keyword) {
        return iUserDao.getUsers(keyword);
    }

    @Override
    public ResultData getUsers(int pageNum, int pageSize) {
        return new ResultData(pageNum,pageSize,iUserDao.getCount(),iUserDao.getUsers(pageNum,pageSize));
    }

    @Override
    public int insert(User user) {
        return iUserDao.insert(user);
    }

    @Override
    public int delete(int id) {
      return   iUserDao.delete(id);
    }

    @Override
    public int update(User user) {
        return iUserDao.update(user);
    }

    @Override
    public User getUserById(int id) {
        return iUserDao.getUserById(id);
    }

    @Override
    public User getUserByUname(String uname,String pwd) {
        User u = null;
       User user= iUserDao.getUserByUname(uname,pwd);

        if (user!=null){
            if (user.getPassword().equals(pwd)){
                u = user;
            }
        }
        return u;
    }



}
