package org.cash.SpringSecurityWithJWT.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public ResponseEntity<String> adminDashboard() {
        return ResponseEntity.ok("Administrator Dashboard Page.");
    }

    @GetMapping("/users")
    public ResponseEntity<String> listUsers() {
        return ResponseEntity.ok("Users listed for administration.).");
    }

    @GetMapping("/settings")
    public ResponseEntity<String> adminSettings() {
        return ResponseEntity.ok("Settings listed for administration.");
    }
}
