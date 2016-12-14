package com.dominika.controller;

import com.dominika.model.User;
import com.dominika.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.GeneratedValue;
import java.util.List;

/**
 * Created by Dominika on 2016-12-14.
 */
@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    private ResponseEntity getAll() {
        List<User> listaUsert = userRepository.findAll();
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }


}
