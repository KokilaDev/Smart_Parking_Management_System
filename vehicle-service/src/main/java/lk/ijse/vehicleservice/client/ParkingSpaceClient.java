package lk.ijse.vehicleservice.client;

import lk.ijse.vehicleservice.dtos.ParkingSpaceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:17 AM
 * Project: SPMS
 * --------------------------------------------
 */

@FeignClient(name = "parking-space-service")
public interface ParkingSpaceClient {

    @GetMapping("/api/parking-spaces/{id}")
    ParkingSpaceDto getParkingSpaceById(@PathVariable("id") Long id);

    @PostMapping("/api/parking-spaces/{id}/occupy")
    ParkingSpaceDto occupySpace(@PathVariable("id") Long id);

    @PostMapping("/api/parking-spaces/{id}/vacate")
    ParkingSpaceDto vacateSpace(@PathVariable("id") Long id);
}