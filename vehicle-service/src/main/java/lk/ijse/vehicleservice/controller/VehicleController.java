package lk.ijse.vehicleservice.controller;

import lk.ijse.vehicleservice.entity.Vehicle;
import lk.ijse.vehicleservice.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 6:06 PM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
@RequestMapping("/api/v1/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping
    public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle) {
        return new ResponseEntity<>(
                vehicleService.saveVehicle(vehicle),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return ResponseEntity.ok(
                vehicleService.getAllVehicles()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(
                vehicleService.getVehicleById(id)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteVehicleById(@PathVariable Long id) {
        vehicleService.deleteVehicleById(id);
        return ResponseEntity.ok("Deleted vehicle with id " + id);
    }
}
