package lk.ijse.parkingservice.dtos;

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
 * Created: 8/17/2026 12:40 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReserveSpaceRequest {

    @NotNull(message = "User ID is required")
    private Long userId;

    private Long vehicleId;

    private LocalDateTime startTime;

    private LocalDateTime endTime;
}