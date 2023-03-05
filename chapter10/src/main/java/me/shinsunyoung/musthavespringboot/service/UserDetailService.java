package me.shinsunyoung.musthavespringboot.service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.musthavespringboot.domain.User;
import me.shinsunyoung.musthavespringboot.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                 .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
