package lk.ijse.paymentservice.controller;

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
 * Created: 8/17/2026 12:38 PM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
public class PaymentRootController {

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> root() {
        return ResponseEntity.ok(Map.of(
                "service", "payment-service",
                "status", "UP",
                "port", 8084,
                "timestamp", LocalDateTime.now().toString(),
                "endpoints", List.of(
                        "POST /api/payments/process",
                        "GET /api/payments/{id}",
                        "GET /api/payments/transaction/{transactionId}",
                        "GET /api/payments",
                        "GET /api/payments/user/{userId}",
                        "GET /api/payments/receipts/{id}",
                        "GET /api/payments/receipts/user/{userId}"
                )
        ));
    }
}