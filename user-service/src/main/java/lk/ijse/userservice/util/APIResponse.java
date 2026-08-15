package lk.ijse.userservice.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 11:23 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {

    private int code;
    private String message;
    private T data;

}
