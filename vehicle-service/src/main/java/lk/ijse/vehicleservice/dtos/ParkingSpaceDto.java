package lk.ijse.vehicleservice.dtos;

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
 * Created: 8/16/2026 11:54 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingSpaceDto {

    private Long id;
    private String spaceNumber;
    private String location;
    private String city;
    private String zone;
    private Long ownerId;
    private String status;
    private BigDecimal hourlyRate;
    private String spaceType;
}