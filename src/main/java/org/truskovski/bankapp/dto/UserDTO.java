package org.truskovski.bankapp.dto;

import lombok.Data;
import org.truskovski.bankapp.repository.entity.Roles;
import org.truskovski.bankapp.repository.entity.cards.Card;

import java.util.List;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private List<Card> card;
    public Set<Roles> roles;
}
