package me.shinsunyoung.musthavespringboot.service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.musthavespringboot.domain.RefreshToken;
import me.shinsunyoung.musthavespringboot.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpected token"));
    }
}

