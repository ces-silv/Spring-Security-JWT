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
        return ResponseEntity.ok("Bienvenido, Usuario. Este es tu panel de usuario.");
    }

    @GetMapping("/profile")
    public ResponseEntity<String> userProfile() {
        return ResponseEntity.ok("Perfil del usuario (accesible para USER y ADMIN).");
    }

    @GetMapping("/tasks")
    public ResponseEntity<String> userTasks() {
        return ResponseEntity.ok("Listado de tareas del usuario (accesible para USER y ADMIN).");
    }
}
