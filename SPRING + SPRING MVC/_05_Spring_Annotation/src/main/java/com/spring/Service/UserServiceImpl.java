package com.spring.Service;

import com.spring.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{


    @Autowired
    private UserDaoImpl userDao;

    @Autowired
    public UserServiceImpl(UserDaoImpl userDAO) {
        System.out.println("loading .........");
        this.userDao = userDAO;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);

    }
}
