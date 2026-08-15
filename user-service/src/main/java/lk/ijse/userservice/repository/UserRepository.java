package lk.ijse.userservice.repository;

import lk.ijse.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 1:00 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

}
