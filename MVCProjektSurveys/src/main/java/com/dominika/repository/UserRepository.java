package com.dominika.repository;

import com.dominika.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Dominika on 2016-12-14.
 */
@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User person) {
        entityManager.persist(person);
    }

    public List<User> findAll(){
        TypedQuery query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Transactional
    public void removeOne(long id) {
        User u = entityManager.find(User.class, id);
        entityManager.remove(u);
    }
}
