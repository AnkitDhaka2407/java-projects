package com.ankit.rest.webservices.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return userDaoService.getAllUsers();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = userDaoService.getUser(id);
        if (user==null){
            throw new UserNotFoundException(String.format("User with id: %s not found",id));
        }
        return user;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<Object> getAllUsers(@RequestBody User user) {
        User addedUser = userDaoService.addUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(addedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userDaoService.deleteUser(id);
    }

}

