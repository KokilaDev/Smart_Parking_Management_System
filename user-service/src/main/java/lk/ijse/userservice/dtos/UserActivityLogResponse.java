package lk.ijse.userservice.dtos;

import lombok.*;

import java.time.LocalDateTime;

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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserActivityLogResponse {

    private Long id;
    private Long userId;
    private String activityType;
    private String description;
    private LocalDateTime timestamp;
}