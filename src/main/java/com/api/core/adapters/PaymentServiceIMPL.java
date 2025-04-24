package com.api.core.adapters;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
import com.api.application.dtos.outputDTOS.PaymentOutputDTO;
import com.api.core.model.Payment;
import com.api.core.ports.interfaces.PaymentServicePort;

public class PaymentServiceIMPL implements PaymentServicePort {
    private PaymentServicePort paymentServicePort;

    public PaymentServiceIMPL(PaymentServicePort paymentServicePort) {
        this.paymentServicePort = paymentServicePort;
    }

    @Override
    public PaymentOutputDTO makePayment(PaymentInputDTO paymentInputDTO) {
        return null;
    }

    @Override
    public PaymentOutputDTO handlerProcessPayment(PaymentInputDTO paymentInputDTO) {
        if (paymentInputDTO.status().getStatus().equals("APPROVED")) {
        return null;

        }

        return null;
    }

    @Override
    public PaymentOutputDTO getPaymentByOrderId(Long id) {
        return null;
    }

    @Override
    public PaymentOutputDTO updatePaymentStatus(Long paymentId, String status) {
        return null;
    }
}
