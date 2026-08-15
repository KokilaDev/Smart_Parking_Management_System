package lk.ijse.userservice.service;

import lk.ijse.userservice.dtos.*;
import lk.ijse.userservice.entity.User;

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
    UserResponse saveUser(UserCreateRequest request);
    List<UserResponse> getAllUsers();
    UserResponse getUserById(Long id);
    UserResponse updateUser(Long id, UserUpdateRequest request);
    void deleteUser(Long id);
    LoginResponse loginUser(LoginRequest request);
}
