package org.respec.respecapi.application;

import lombok.RequiredArgsConstructor;
import org.respec.respecapi.domain.User;
import org.respec.respecapi.infrastructure.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUser(Long idx) {
        User user = userRepository.getOne(idx);
        return user;
    }
}

