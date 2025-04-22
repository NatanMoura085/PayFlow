package com.api.infrastructure.adapters;

import com.api.core.model.Payment;
import com.api.core.ports.interfaces.PaymentServicePort;
import com.api.infrastructure.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService implements PaymentServicePort {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public Payment handlerProcessPayment(Payment payment) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, payment);
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
