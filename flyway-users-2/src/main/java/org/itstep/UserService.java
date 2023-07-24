package org.itstep;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final JdbcTemplate jdbcTemplate;

    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        var sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public Optional<User> findById(Long id) {
        var sql = "SELECT id, coalesce(nick_name, name) as nick_name FROM users where id=?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class), id).stream().findFirst();
    }


}
