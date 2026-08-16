package lk.ijse.parkingservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:35 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OccupySpaceRequest {
    private Long vehicleId;
    private Long userId;
}