package com.agribzar.userservice;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("/auth")
public class AppController {

    @Autowired
    private JWTManager jwtManager;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> generateToken(@RequestBody Map<String, String> payload) {
        String username = payload.get("username");
        if (username == null || username.isEmpty()) {
            return ResponseEntity.badRequest().body(Map.of("error", "Username is required!"));
        }
        String token = jwtManager.generateToken(username);
        return ResponseEntity.ok(Map.of("token", token)); // Returning JSON response
    }

    @GetMapping("/validate")
    public ResponseEntity<Map<String, String>> validateToken(@RequestParam("token") String token) {
        try {
            Map<String, String> validationResponse = jwtManager.validateToken(token);
            return ResponseEntity.ok(validationResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", "Invalid token"));
        }
    }
}