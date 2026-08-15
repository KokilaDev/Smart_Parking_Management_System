package lk.ijse.userservice.service;

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
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByEmail(String email);
    void deleteUser(Long id);
}
