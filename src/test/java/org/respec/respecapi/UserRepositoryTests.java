package org.respec.respecapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.respec.respecapi.domain.User;
import org.respec.respecapi.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    UserRepository userRepository;

    @Test
    public void loadUser() {
        //given
        userRepository.save(User.builder()
                .idx(1)
                .age(25)
                .nickname("닉네임")
                .salary(10000)
                .build());

        //when
        List<User> userList = userRepository.findAll();

        //then
        User user = userList.get(0);
        assertThat(user.getAge(), is(25));
        assertThat(user.getNickname(), is("닉네임"));
    }
}
