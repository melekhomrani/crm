package tn.esprit.crm.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.crm.Services.UserServices;
import tn.esprit.crm.models.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping("")
    public List<User> list() {
        return userServices.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
        return userServices.findById(id);
    }

    @PostMapping("/login")
    public String login(@RequestBody String email, @RequestBody String password) {
        Optional<User> user = userServices.findByEmailAndPassword(email, password);
        return user.isPresent() ? "Login Success" : "Login Failed";
    }
}
