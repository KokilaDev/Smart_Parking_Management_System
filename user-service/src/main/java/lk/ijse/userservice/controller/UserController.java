package lk.ijse.userservice.controller;

import jakarta.validation.Valid;
import lk.ijse.userservice.dtos.*;
import lk.ijse.userservice.entity.User;
import lk.ijse.userservice.service.UserService;
import lk.ijse.userservice.util.APIResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 1:11 PM
 * Project: SPMS
 * --------------------------------------------
 */

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<APIResponse<UserResponse>> saveUser(@Valid @RequestBody UserCreateRequest user) {

        UserResponse userResponse = userService.saveUser(user);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new APIResponse<>(
                        201,
                        "User saved!",
                        userResponse
                ));
    }

    @GetMapping
    public ResponseEntity<APIResponse<List<UserResponse>>> getAllUsers() {
        return ResponseEntity.ok(
                new APIResponse<>(
                        200,
                        "User retrieved",
                        userService.getAllUsers()
                )
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<UserResponse>> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(
                new APIResponse<>(
                        200,
                        "User found!",
                        userService.getUserById(id)
                )
        );
    }

    @PutMapping
    public ResponseEntity<APIResponse<UserResponse>> updateUser(
            @PathVariable Long id,
            @Valid @RequestBody UserUpdateRequest user) {

        return ResponseEntity.ok(
                new APIResponse<>(
                        200,
                        "User updated!",
                        userService.updateUser(id, user)
                )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<Void>> deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return ResponseEntity.ok(
                new APIResponse<>(
                        200,
                        "User deleted!",
                        null
                )
        );
    }

    @PostMapping("login")
    public ResponseEntity<APIResponse<LoginResponse>> loginUser(@RequestBody LoginRequest loginRequest) {

        return ResponseEntity.ok(
                new APIResponse<>(
                        200,
                        "Login success!",
                        userService.loginUser(loginRequest)
                )
        );
    }

}
