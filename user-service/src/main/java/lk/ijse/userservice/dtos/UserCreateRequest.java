package lk.ijse.userservice.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lk.ijse.userservice.entity.Role;
import lombok.*;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 11:12 PM
 * Project: SPMS
 * --------------------------------------------
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserCreateRequest {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank
    @Size(min = 4,message = "password must contain at least 4 characters")
    private String password;

    private String phoneNumber;

    @NotNull(message = "role is required")
    private Role role;
}
