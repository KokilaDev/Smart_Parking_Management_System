package lk.ijse.userservice.service;

import lk.ijse.userservice.dtos.*;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 1:05 PM
 * Project: SPMS
 * --------------------------------------------
 */
public interface UserService {

    UserResponse register(UserRegisterRequest request);

    UserResponse login(UserLoginRequest request);

    UserResponse getUserById(Long id);

    UserResponse getUserByEmail(String email);

    UserResponse updateUser(Long id, UserUpdateRequest request);

    List<UserResponse> getAllUsers();

    List<UserActivityLogResponse> getUserHistory(Long id);

    void logActivity(Long userId, String activityType, String description);
}
