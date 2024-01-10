package com.supertiendaKaren.backend.infrastructure.rest;

import com.supertiendaKaren.backend.application.UserService;
import com.supertiendaKaren.backend.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//httpp://localhost:8085
@RequestMapping("/api/v1/users")
//http://localhost:8085/api/v1/users
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user){
        return new ResponseEntity<>(userService.save(user),HttpStatus.CREATED);
    }
    //http://localhost:8085/api/v1/users/1
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        return ResponseEntity.ok(userService.findById(id));
    }
}
