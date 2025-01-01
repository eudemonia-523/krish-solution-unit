package org.practice.krish_solution_unit.service.login;

import org.practice.krish_solution_unit.dao.LoginDao;
import org.practice.krish_solution_unit.dao.RegisterDao;
import org.practice.krish_solution_unit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public void registerNewUser(String userId, String password) {
        User user = new User(userId,password);
        registerDao.save(user);
    }
}
