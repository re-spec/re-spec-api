package org.respec.respecapi.infrastructure;

import org.respec.respecapi.domain.User;
import org.respec.respecapi.domain.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaUserRepository implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findById(String id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }
}
