package lk.ijse.parkingservice.dtos;

import lk.ijse.parkingservice.entity.ParkingSpaceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:37 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingSpaceResponse {

    private Long id;
    private String spaceNumber;
    private String location;
    private String city;
    private String zone;
    private Long ownerId;
    private ParkingSpaceStatus status;
    private BigDecimal hourlyRate;
    private String spaceType;
    private String sensorId;
    private LocalDateTime lastSensorUpdate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}