package org.practice.krish_solution_unit.dao;

import org.practice.krish_solution_unit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<User, Long> {
    // Custom query to find user by userId and password
    User findByUserIdAndPassword(String userId, String password);

}
