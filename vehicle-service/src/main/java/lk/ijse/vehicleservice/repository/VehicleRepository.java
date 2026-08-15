package lk.ijse.vehicleservice.repository;

import lk.ijse.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/15/2026 6:01 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
