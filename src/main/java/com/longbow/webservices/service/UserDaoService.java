package com.longbow.webservices.service;

import com.longbow.webservices.bean.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Eve", LocalDate.now().minusYears(28)));
        users.add(new User(3,"Jim", LocalDate.now().minusYears(32)));
    }

    public List<User> findAll(){
        return users;
    }
}
