package lk.ijse.parkingservice.dtos;

import jakarta.validation.constraints.NotBlank;
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
 * Created: 8/17/2026 12:34 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IoTSensorUpdateRequest {

    @NotBlank(message = "Sensor ID is required")
    private String sensorId;

    private Long parkingSpaceId;

    @NotNull(message = "Status is required (AVAILABLE, OCCUPIED)")
    private ParkingSpaceStatus status;

    private String remarks;
}