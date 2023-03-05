package me.shinsunyoung.musthavespringboot.service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.musthavespringboot.domain.User;
import me.shinsunyoung.musthavespringboot.dto.AddUserRequest;
import me.shinsunyoung.musthavespringboot.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .auth(dto.getAuth())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
