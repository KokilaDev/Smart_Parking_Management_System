package lk.ijse.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 11:03 PM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
public class GatewayRootController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        return ResponseEntity.ok(Map.of(
                "application", "Smart Parking Management System (SPMS)",
                "component", "API Gateway",
                "status", "ONLINE",
                "timestamp", LocalDateTime.now().toString(),
                "routes", Map.of(
                        "users", "/api/users/** (Port 8081)",
                        "vehicles", "/api/vehicles/** (Port 8082)",
                        "parking_spaces", "/api/parking-spaces/** (Port 8083)",
                        "payments", "/api/payments/** (Port 8084)"
                ),
                "eureka_dashboard", "http://localhost:8761",
                "config_server", "http://localhost:8888"
        ));
    }
}