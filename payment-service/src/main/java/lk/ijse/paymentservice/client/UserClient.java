package lk.ijse.paymentservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:22 PM
 * Project: SPMS
 * --------------------------------------------
 */

@FeignClient(name = "user-service")
public interface UserClient {

    @PostMapping("/api/users/{id}/logs")
    void logUserActivity(
            @PathVariable("id") Long id,
            @RequestParam("activityType") String activityType,
            @RequestParam("description") String description);
}