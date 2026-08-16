package lk.ijse.vehicleservice.util;

import lombok.*;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 9:19 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class APIResponse<T> {

    private boolean success;
    private String message;
    private T data;
}
