package org.truskovski.bankapp.repository.entity.cards;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.truskovski.bankapp.repository.entity.actors.UserEnt;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String cardNumber;

    @Column(nullable = false, updatable = false)
    private BigDecimal balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEnt userEnt;

}
