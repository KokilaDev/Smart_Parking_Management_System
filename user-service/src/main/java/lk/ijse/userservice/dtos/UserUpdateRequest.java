package lk.ijse.userservice.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lk.ijse.userservice.entity.Role;
import lombok.*;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 11:13 PM
 * Project: SPMS
 * --------------------------------------------
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserUpdateRequest {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    private String phoneNumber;

    @NotNull
    private Role role;

}