package lk.ijse.parkingservice.repository;

import lk.ijse.parkingservice.entity.ReservationStatus;
import lk.ijse.parkingservice.entity.SpaceReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:48 AM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface SpaceReservationRepository extends JpaRepository<SpaceReservation, Long> {

    List<SpaceReservation> findByUserIdOrderByCreatedAtDesc(Long userId);

    List<SpaceReservation> findByParkingSpaceIdOrderByCreatedAtDesc(Long parkingSpaceId);

    Optional<SpaceReservation> findFirstByParkingSpaceIdAndStatusOrderByCreatedAtDesc(
            Long parkingSpaceId, ReservationStatus status);

    Optional<SpaceReservation> findFirstByParkingSpaceIdAndUserIdAndStatusOrderByCreatedAtDesc(
            Long parkingSpaceId, Long userId, ReservationStatus status);
}