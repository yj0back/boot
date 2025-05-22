package co.kr.boot.jpa.user.controller;

import co.kr.boot.jpa.user.User;
import co.kr.boot.jpa.user.repository.UserRepository;
import co.kr.boot.jpa.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        Optional<User> user = userService.findByUsername(username);
        if(user.isPresent()) {
            return user.get();
        } else {
            System.out.println("user not found");
            return null;
        }
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @PostMapping("/username")
    public void deleteUser(@RequestBody User user) {
        userService.removeUser(user);
    }
}
