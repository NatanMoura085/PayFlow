package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.PaymentInputDTO;
import com.api.application.dtos.outputDTOS.PaymentOutputDTO;
import com.api.core.model.Payment;
import com.api.infrastructure.adapters.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payments")
    @PreAuthorize("hasRole('USER')")
    public String enviarMensagem(@AuthenticationPrincipal Jwt jwt, @RequestBody PaymentInputDTO paymentInputDTO) {
        String userId = jwt.getSubject();
        paymentService.makePayment(paymentInputDTO);
        paymentService.handlerProcessPayment(paymentInputDTO);
        return "Mensagen Enviadar";
    }
}
