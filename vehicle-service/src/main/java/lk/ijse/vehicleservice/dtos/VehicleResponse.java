package lk.ijse.vehicleservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 8:23 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VehicleResponse {

    private Long id;
    private String vehicleNumber;
    private String vehicleType;
    private String brand;
    private String model;
    private String color;
    private Long ownerId;
}
