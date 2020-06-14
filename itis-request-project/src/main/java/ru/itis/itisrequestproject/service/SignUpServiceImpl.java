package ru.itis.itisrequestproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.itisrequestproject.dto.SignUpDto;
import ru.itis.itisrequestproject.models.Role;
import ru.itis.itisrequestproject.models.State;
import ru.itis.itisrequestproject.models.User;
import ru.itis.itisrequestproject.repositories.UsersRepository;

import java.time.LocalDateTime;

@Component
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpDto form) {
        User user = User.builder()
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .name(form.getName())
                .state(State.CONFIRMED)
                .role(Role.USER)
                .createdAt(LocalDateTime.now())
                .build();

        usersRepository.save(user);
    }
}
