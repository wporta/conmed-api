package org.wporta.conmed_api.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UtilityController {

    @GetMapping("/api")
    public ResponseEntity<Map<String, String>> root() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of(
                        "status", "up",
                        "message", "Welcome to Conmed API"
                )
        );
    }

    @GetMapping("/api/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(Map.of("status", "healthy"));
    }
}
