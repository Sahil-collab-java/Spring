package com.spring.Repo;

import com.spring.Pojo.User;
import com.spring.Service.UserDaoImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo implements UserDaoImpl {

    private JdbcTemplate jdbcTemplate;

    public UserRepo (JdbcTemplate jdbcTemplate){
        System.out.println("JDBC loading........");
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public boolean save(User user) {
        String sql = "INSERT INTO user (username, email) VALUES (?, ?)";
        int result = jdbcTemplate.update(sql, user.getUsername(), user.getEmail());
        return result > 0;
    }
}
