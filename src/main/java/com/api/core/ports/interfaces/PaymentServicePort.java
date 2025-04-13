package com.api.core.ports.interfaces;

import com.api.core.model.Payment;

public interface PaymentServicePort {

    Payment handlerProcessPayment(Payment payment);

    Payment getPaymentByOrderId(Long id);

    Payment updatePaymentStatus(Long paymentId, String status);


}
