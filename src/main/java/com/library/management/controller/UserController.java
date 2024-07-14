package com.library.management.controller;

import com.library.management.model.Book;
import com.library.management.model.User;
import com.library.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService  userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
   @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
       return userService.getUserById(id);
   }

   @PostMapping
    public User saveUser(@PathVariable User user){
        return userService.saveUser(user);
   }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable int id) {
        userService.deleteUser(id);
    }

    @PutMapping(path="/user")
    public void updateUsers(@RequestBody User user){
        userService.upadteUsers(user);
    }

}
