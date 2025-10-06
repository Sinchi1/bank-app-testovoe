package org.truskovski.bankapp.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.truskovski.bankapp.repository.entity.actors.UserEnt;

@Repository
public interface UserRepository extends JpaRepository<UserEnt, Long> {
}
