package lk.ijse.paymentservice.repository;

import lk.ijse.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:20 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findByTransactionId(String transactionId);

    List<Payment> findByUserIdOrderByCreatedAtDesc(Long userId);

    List<Payment> findByVehicleIdOrderByCreatedAtDesc(Long vehicleId);

    List<Payment> findByParkingSpaceIdOrderByCreatedAtDesc(Long parkingSpaceId);
}