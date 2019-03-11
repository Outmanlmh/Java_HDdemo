package main.service;

import main.dao.UserDao;
import main.dao.UserDaoImp;
import pojo.User;

/**
 * @author LiMingHang
 * @date2019.03.11 9:27.
 */
public class IUserServiceImp  implements IUserService{
    UserDao userDao = new UserDaoImp();
    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}
