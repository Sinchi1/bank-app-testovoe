package org.truskovski.bankapp.dto;

import lombok.Data;
import org.truskovski.bankapp.repository.entity.Roles;
import org.truskovski.bankapp.repository.entity.cards.Card;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private List<Card> card;
    public List<Roles> roles;
}
