package lk.ijse.parkingservice.dtos;

import jakarta.validation.constraints.NotNull;
import lk.ijse.parkingservice.entity.ParkingSpaceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:40 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatusUpdateRequest {

    @NotNull(message = "Status is required (AVAILABLE, RESERVED, OCCUPIED)")
    private ParkingSpaceStatus status;

    private Long userId;
    private Long vehicleId;
    private String reason;
}