package lk.ijse.vehicleservice.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lk.ijse.vehicleservice.entity.VehicleType;
import lombok.*;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 8:23 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleRegisterRequest {

    @NotBlank(message = "Registration number is required")
    private String registrationNumber;

    @NotNull(message = "Vehicle type is required (CAR, MOTORCYCLE, SUV, TRUCK, EV)")
    private VehicleType vehicleType;

    @NotNull(message = "User ID is required")
    private Long userId;

    private String make;

    private String model;

    private String color;
}