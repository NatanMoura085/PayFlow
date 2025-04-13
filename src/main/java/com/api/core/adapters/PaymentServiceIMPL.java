package com.api.core.adapters;

import com.api.core.model.Payment;
import com.api.core.ports.interfaces.PaymentServicePort;

public class PaymentServiceIMPL implements PaymentServicePort {
    private PaymentServicePort paymentServicePort;

    public PaymentServiceIMPL(PaymentServicePort paymentServicePort) {
        this.paymentServicePort = paymentServicePort;
    }

    @Override
    public Payment handlerProcessPayment(Payment payment) {
        if (payment.getStatus().getStatus().equals("APPROVED")) {
        return null;

        }

        return null;
    }

    @Override
    public Payment getPaymentByOrderId(Long id) {
        return null;
    }

    @Override
    public Payment updatePaymentStatus(Long paymentId, String status) {
        return null;
    }
}
