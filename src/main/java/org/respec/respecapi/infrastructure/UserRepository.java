package org.respec.respecapi.infrastructure;

import org.respec.respecapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
