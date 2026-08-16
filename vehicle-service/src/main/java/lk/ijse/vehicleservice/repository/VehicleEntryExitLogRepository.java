package lk.ijse.vehicleservice.repository;

import lk.ijse.vehicleservice.entity.VehicleEntryExitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:12 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface VehicleEntryExitLogRepository extends JpaRepository<VehicleEntryExitLog, Long> {

    List<VehicleEntryExitLog> findByVehicleIdOrderByCreatedAtDesc(Long vehicleId);

    List<VehicleEntryExitLog> findByUserIdOrderByCreatedAtDesc(Long userId);

    Optional<VehicleEntryExitLog> findFirstByVehicleIdAndStatusOrderByCreatedAtDesc(
            Long vehicleId, String status);
}