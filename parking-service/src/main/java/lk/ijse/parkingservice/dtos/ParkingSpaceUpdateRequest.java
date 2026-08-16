package lk.ijse.parkingservice.dtos;

import lk.ijse.parkingservice.entity.ParkingSpaceStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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
public class ParkingSpaceUpdateRequest {

    private String location;
    private String city;
    private String zone;
    private BigDecimal hourlyRate;
    private String spaceType;
    private ParkingSpaceStatus status;
    private String sensorId;
}