package org.truskovski.bankapp.repository.actors;

import jakarta.persistence.*;
import lombok.*;
import org.truskovski.bankapp.repository.cards.Card;
import org.truskovski.bankapp.repository.Roles;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User {

    @Id
    @Column(name = "user_id",nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> card;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id")
    )
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    public List<Roles> roles;
}
