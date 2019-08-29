package org.respec.respecapi.domain;

public interface UserRepository {
    public User findById (String userId);

    public void save(User user);
}
