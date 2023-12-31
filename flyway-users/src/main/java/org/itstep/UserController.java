package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public User findById(@PathVariable Long id) {

        System.out.println(id);
    return userService.findById(id).orElse(null);
    }
}
