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
        return ResponseEntity.ok("Bienvenido, Administrador. Este es el panel de administración.");
    }

    @GetMapping("/users")
    public ResponseEntity<String> listUsers() {
        return ResponseEntity.ok("Listado de todos los usuarios (solo para administradores).");
    }

    @GetMapping("/settings")
    public ResponseEntity<String> adminSettings() {
        return ResponseEntity.ok("Configuración del sistema (solo para administradores).");
    }
}
