package ru.sber.edu.yetanotherchat.service;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.sber.edu.yetanotherchat.entity.User;
import ru.sber.edu.yetanotherchat.repository.UserRepository;

@Service
@Slf4j
public class UserDetailsService implements ReactiveUserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserRepository userRepository;
    @Override
    public Mono<UserDetails> findByUsername(String username) {
        User user =userRepository.findByLogin(username);

        log.info(user.getLogin());
        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getLogin())
                .password(passwordEncoder.encode("aspirinE")).roles("USER").build();
        log.info(userDetails.getUsername());
        return Mono.just(userDetails);
    }


}
