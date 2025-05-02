package com.api.core.adapters;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
import com.api.application.dtos.outputDTOS.PaymentOutputDTO;
import com.api.core.ports.interfaces.PaymentServicePort;
import com.api.core.ports.repositories.PaymentRepositoryPort;

public class PaymentServiceIMPL implements PaymentServicePort {
    private final PaymentRepositoryPort paymentRepositoryPort;
    public PaymentServiceIMPL(PaymentRepositoryPort paymentRepositoryPort) {
        this.paymentRepositoryPort = paymentRepositoryPort;
    }

    @Override
    public PaymentOutputDTO makePayment(PaymentInputDTO paymentInputDTO) {
        return paymentRepositoryPort.makePayment(paymentInputDTO);
    }

    @Override
    public PaymentOutputDTO handlerProcessPayment(PaymentInputDTO paymentInputDTO) {
        return paymentRepositoryPort.handlerProcessPayment(paymentInputDTO);
    }

    @Override
    public PaymentOutputDTO getPaymentByOrderId(Long id) {
        return paymentRepositoryPort.getPaymentByOrderId(id);
    }

    @Override
    public PaymentOutputDTO updatePaymentStatus(Long paymentId, String status) {
        return paymentRepositoryPort.updatePaymentStatus(paymentId, status);
    }
}
