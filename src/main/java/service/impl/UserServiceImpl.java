package service.impl;

import dao.IUserDao;
import model.User;
import org.springframework.stereotype.Service;
import service.IUserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    public User selectUser(Integer userId){
        return this.userDao.selectUser(1);
    }

}
