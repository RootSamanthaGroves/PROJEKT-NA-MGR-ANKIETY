package com.example.repository;

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Dominika on 2016-12-14.
 */
@Repository
public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;
    private  UserRepository userRepository;

    @Autowired


    @Transactional
    public void save(User u) {

        entityManager.persist(u);
    }



    public List<User> findAll() {
        TypedQuery query = entityManager.createQuery("select u from User u", User.class);
        System.out.println(query.getResultList());
        return query.getResultList();
    }

    @javax.transaction.Transactional
    public void removeOne(long id) {
        User u = entityManager.find(User.class, id);
        entityManager.remove(u);
    }


//    @PostMapping("/add")
//    public ResponseEntity<?> savePerson(@RequestBody User user){
//        userRepository.save(user);
//        System.out.println(user.getFirstName());
//       // if(user.getId()!=null){
//            return ResponseEntity.ok(user);
//       // }
//        return new ResponseEntity<User>(HttpStatus.ACCEPTED.BAD_REQUEST);
//    }




	public UserController(UserRepository userRepository){

            this.userRepository;


        }

        @RequestMapping(method= requestMethod.GET)
        public List<User> fingAllUser()
        {
            return userRepository.findAll();

        }

        @RequestMapping (method=RequestMethod.POST)
        public void addUser(@ReqquestBody AddUserRequest addUserrequest){


        }
    }


}