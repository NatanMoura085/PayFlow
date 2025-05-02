package com.api.infrastructure.adapters;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
import com.api.application.dtos.outputDTOS.PaymentOutputDTO;
import com.api.core.ports.interfaces.PaymentServicePort;
import com.api.core.ports.repositories.PaymentRepositoryPort;
import com.api.infrastructure.config.RabbitMQConfig;
import com.api.infrastructure.entities.PaymentEntity;
import com.api.infrastructure.repository.SpringRepositoryPayment;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService implements PaymentRepositoryPort {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private SpringRepositoryPayment springRepositoryPayment;

    @Override
    public PaymentOutputDTO makePayment(PaymentInputDTO paymentInputDTO) {
        PaymentEntity paymentEntity = new PaymentEntity(paymentInputDTO);
        springRepositoryPayment.save(paymentEntity);
        return null;
    }

    @Override
    public PaymentOutputDTO handlerProcessPayment(PaymentInputDTO paymentInputDTO) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, paymentInputDTO);
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
