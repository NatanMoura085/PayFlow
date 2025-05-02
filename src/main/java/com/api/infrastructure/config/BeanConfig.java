package com.api.infrastructure.config;

import com.api.core.adapters.PaymentServiceIMPL;
import com.api.core.ports.interfaces.PaymentServicePort;
import com.api.core.ports.repositories.PaymentRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    PaymentServicePort paymentServicebean(PaymentRepositoryPort paymentRepositoryPort) {
        return new PaymentServiceIMPL(paymentRepositoryPort);
    }
}
