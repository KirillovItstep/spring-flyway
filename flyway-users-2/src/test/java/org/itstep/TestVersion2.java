package org.itstep;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestVersion2 {
    @Autowired
    UserService userService;

    @Test
    public void testUser() {
        User user = userService.findById(1L).orElse(null);
        System.out.println(user);
        assertThat(user).isNotNull();
        assertThat(user.getId()).isEqualTo(1L);
        assertThat(user.getNickName()).isEqualTo("user1");
    }
}
