package org.practice.krish_solution_unit.dao;

import org.practice.krish_solution_unit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDao extends JpaRepository<User, Long> {

    <S extends User> S save(S user);

}
