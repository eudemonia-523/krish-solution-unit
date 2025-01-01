package org.practice.krish_solution_unit.service.login;

import org.practice.krish_solution_unit.dao.LoginDao;
import org.practice.krish_solution_unit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public boolean validateUser(String userId, String password) {
        User user = loginDao.findByUserIdAndPassword(userId, password);
        return user != null; // Return true if user exists
    }

}
