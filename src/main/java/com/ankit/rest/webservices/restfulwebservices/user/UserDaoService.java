package com.ankit.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static final List<User> userList = new ArrayList();
    private static int userCount = 0;

    static {
        userList.add(new User(++userCount, "Ankit", LocalDate.now().minusYears(30)));
        userList.add(new User(++userCount, "Ravi", LocalDate.now().minusYears(25)));
        userList.add(new User(++userCount, "Teja", LocalDate.now().minusYears(20)));
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User getUser(int id) {
        return userList.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
    }

    public User addUser(User user) {
        user.setId(++userCount);
        userList.add(user);
        return user;
    }
}
