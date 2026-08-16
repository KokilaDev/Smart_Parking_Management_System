package lk.ijse.vehicleservice.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 9:12 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleExitRequest {

    @NotNull(message = "Vehicle ID is required")
    private Long vehicleId;

    private Long parkingSpaceId;

    private LocalDateTime exitTime;
}