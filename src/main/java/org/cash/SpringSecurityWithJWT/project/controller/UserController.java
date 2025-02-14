package org.cash.SpringSecurityWithJWT.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> userDashboard() {
        return ResponseEntity.ok("User Dashboard - Available for Users and Admins");
    }

    @GetMapping("/profile")
    public ResponseEntity<String> userProfile() {
        return ResponseEntity.ok("User Profile - Available for Users and Admins.");
    }

    @GetMapping("/tasks")
    public ResponseEntity<String> userTasks() {
        return ResponseEntity.ok("Tasks listed - Available for Users and Admins/");
    }
}
