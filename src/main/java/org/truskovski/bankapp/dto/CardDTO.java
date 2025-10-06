package org.truskovski.bankapp.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CardDTO {
    private Long id;
    private String cardNumber;
    private BigDecimal balance;
}
