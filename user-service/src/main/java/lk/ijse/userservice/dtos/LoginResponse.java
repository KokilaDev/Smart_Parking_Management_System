package lk.ijse.userservice.dtos;

import lombok.*;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 11:08 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {

    private String token;
    private UserResponse user;

}
