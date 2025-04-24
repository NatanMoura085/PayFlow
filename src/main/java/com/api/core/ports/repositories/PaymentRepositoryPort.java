package com.api.core.ports.repositories;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
import com.api.application.dtos.outputDTOS.PaymentOutputDTO;

public interface PaymentRepositoryPort {
    PaymentOutputDTO makePayment(PaymentInputDTO paymentInputDTO);
    PaymentOutputDTO handlerProcessPayment(PaymentInputDTO paymentInputDTO);

    PaymentOutputDTO getPaymentByOrderId(Long id);

    PaymentOutputDTO updatePaymentStatus(Long paymentId, String status);
}
