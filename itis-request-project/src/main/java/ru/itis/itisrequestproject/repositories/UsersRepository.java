package ru.itis.itisrequestproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.itisrequestproject.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
}
