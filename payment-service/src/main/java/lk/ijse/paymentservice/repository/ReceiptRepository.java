package lk.ijse.paymentservice.repository;

import lk.ijse.paymentservice.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:21 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

    Optional<Receipt> findByReceiptId(String receiptId);

    Optional<Receipt> findByTransactionId(String transactionId);

    List<Receipt> findByUserIdOrderByTimestampDesc(Long userId);

    List<Receipt> findByVehicleIdOrderByTimestampDesc(Long vehicleId);
}