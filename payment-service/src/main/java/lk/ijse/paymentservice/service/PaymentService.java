package lk.ijse.paymentservice.service;

import lk.ijse.paymentservice.dtos.PaymentProcessRequest;
import lk.ijse.paymentservice.dtos.PaymentResponse;
import lk.ijse.paymentservice.dtos.ReceiptResponse;

import java.util.List;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/17/2026 12:32 PM
 * Project: SPMS
 * --------------------------------------------
 */

public interface PaymentService {

    PaymentResponse processPayment(PaymentProcessRequest request);

    PaymentResponse getPaymentById(Long id);

    PaymentResponse getPaymentByTransactionId(String transactionId);

    List<PaymentResponse> getAllPayments();

    List<PaymentResponse> getPaymentsByUserId(Long userId);

    ReceiptResponse getReceiptById(Long id);

    ReceiptResponse getReceiptByReceiptId(String receiptId);

    ReceiptResponse getReceiptByTransactionId(String transactionId);

    List<ReceiptResponse> getReceiptsByUserId(Long userId);
}