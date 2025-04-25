package com.api.application.dtos.inputDTOS;

import java.time.LocalDateTime;

public record OrderInputDTO( Long id ,String status, LocalDateTime createAt, Long userId
                            ) {
}
