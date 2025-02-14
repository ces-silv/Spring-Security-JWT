package org.cash.SpringSecurityWithJWT.project.services;

import org.cash.SpringSecurityWithJWT.project.models.CreateUserEntity;
import org.cash.SpringSecurityWithJWT.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPassEncoder;

    public boolean saveUser(CreateUserEntity user) {
        String encodedPassword = bCryptPassEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        CreateUserEntity savedUser = userRepository.save(user);
        return savedUser.getId() != null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CreateUserEntity userEntity = userRepository.findByUsername(username);
        return new User(userEntity.getUsername(), userEntity.getPassword(),
                userEntity.getRoles().stream()
                        .map(role -> new SimpleGrantedAuthority(role))
                        .collect(Collectors.toList()));
    }
}
