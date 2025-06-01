package com.example.SpringBootRedisDocker;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductDto(Long id, @NotBlank String name, @Positive BigDecimal price) {
}
