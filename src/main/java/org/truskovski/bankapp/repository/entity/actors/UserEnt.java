package org.truskovski.bankapp.repository.entity.actors;

import jakarta.persistence.*;
import lombok.*;
import org.truskovski.bankapp.repository.entity.cards.Card;
import org.truskovski.bankapp.repository.entity.Roles;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class UserEnt {

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
    @Column(name = "roles")
    public Set<String> roles = new HashSet<>();
}
