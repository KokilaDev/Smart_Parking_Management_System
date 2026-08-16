package lk.ijse.parkingservice.controller;

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
 * Created: 8/17/2026 12:55 AM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
public class ParkingSpaceRootController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        return ResponseEntity.ok(Map.of(
                "service", "parking-space-service",
                "status", "UP",
                "port", 8083,
                "timestamp", LocalDateTime.now().toString(),
                "endpoints", List.of(
                        "POST /api/parking-spaces",
                        "GET /api/parking-spaces/{id}",
                        "GET /api/parking-spaces",
                        "GET /api/parking-spaces/search",
                        "PUT /api/parking-spaces/{id}",
                        "DELETE /api/parking-spaces/{id}",
                        "POST /api/parking-spaces/{id}/reserve",
                        "POST /api/parking-spaces/{id}/release",
                        "POST /api/parking-spaces/{id}/occupy",
                        "POST /api/parking-spaces/{id}/vacate",
                        "PATCH /api/parking-spaces/{id}/status",
                        "POST /api/parking-spaces/iot-sensor-update"
                )
        ));
    }
}