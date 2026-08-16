package lk.ijse.vehicleservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:19 AM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
public class VehicleRootController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        return ResponseEntity.ok(Map.of(
                "service", "vehicle-service",
                "status", "UP",
                "port", 8082,
                "timestamp", LocalDateTime.now().toString(),
                "endpoints", List.of(
                        "POST /api/vehicles",
                        "GET /api/vehicles/{id}",
                        "GET /api/vehicles/registration/{registrationNumber}",
                        "GET /api/vehicles/user/{userId}",
                        "GET /api/vehicles",
                        "PUT /api/vehicles/{id}",
                        "DELETE /api/vehicles/{id}",
                        "POST /api/vehicles/entry",
                        "POST /api/vehicles/exit",
                        "GET /api/vehicles/{id}/logs",
                        "GET /api/vehicles/logs"
                )
        ));
    }
}