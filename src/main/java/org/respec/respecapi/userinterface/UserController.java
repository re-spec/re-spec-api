package org.respec.respecapi.userinterface;

import lombok.AllArgsConstructor;
import org.respec.respecapi.application.UserService;
import org.respec.respecapi.domain.User;
import org.respec.respecapi.infrastructure.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping("/user/{idx}")
    public User getUser(@PathVariable Long idx) {
        return userService.findUser(idx);
    }
}
