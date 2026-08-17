package lk.ijse.paymentservice.dtos;

import lk.ijse.paymentservice.entity.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:13 PM
 * Project: SPMS
 * --------------------------------------------
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReceiptResponse {

    private Long id;
    private String receiptId;
    private String transactionId;
    private Long userId;
    private Long vehicleId;
    private Long parkingSpaceId;
    private BigDecimal amount;
    private PaymentStatus status;
    private LocalDateTime timestamp;
    private String digitalSignature;
}