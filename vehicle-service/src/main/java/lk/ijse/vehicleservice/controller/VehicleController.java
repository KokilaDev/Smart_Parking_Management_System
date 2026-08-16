package lk.ijse.vehicleservice.controller;

import lk.ijse.vehicleservice.dtos.VehicleCreateRequest;
import lk.ijse.vehicleservice.dtos.VehicleResponse;
import lk.ijse.vehicleservice.dtos.VehicleUpdateRequest;
import lk.ijse.vehicleservice.entity.Vehicle;
import lk.ijse.vehicleservice.service.VehicleService;
import lk.ijse.vehicleservice.util.APIResponse;
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
    public ResponseEntity<APIResponse<VehicleResponse>> saveVehicle(@RequestBody VehicleCreateRequest vehicle) {

        VehicleResponse vehicleResponse = vehicleService.saveVehicle(vehicle);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new APIResponse<>(
                        true,
                        "Vehicle saved!",
                        vehicleResponse
                ));
    }

    @PutMapping("/{id}")
    public ResponseEntity<APIResponse<VehicleResponse>> updateVehicle(
            @PathVariable Long id,
            @RequestBody VehicleUpdateRequest vehicle) {

        return ResponseEntity.ok(
                new APIResponse<>(
                        true,
                        "Vehicle updated!",
                        vehicleService.updateVehicle(id, vehicle)
                )
        );
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<VehicleResponse>>> getAllVehicles() {
        return ResponseEntity.ok(
                new APIResponse<>(
                        true,
                        "Vehicle retrieved!",
                        vehicleService.getAllVehicles()
                )
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<VehicleResponse>> getVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(
                new APIResponse<>(
                        true,
                        "Vehicle found!",
                        vehicleService.getVehicle(id)
                )
        );
    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<APIResponse<List<VehicleResponse>>> getVehicleByOwner(@PathVariable Long ownerId) {
        return ResponseEntity.ok(
                new APIResponse<>(
                        true,
                        "Vehicles found!",
                        vehicleService.getVehiclesByOwner(ownerId)
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<Void>> deleteVehicleById(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok(
                new APIResponse<>(
                        true,
                        "Vehicle deleted!",
                        null
                )
        );
    }
}
