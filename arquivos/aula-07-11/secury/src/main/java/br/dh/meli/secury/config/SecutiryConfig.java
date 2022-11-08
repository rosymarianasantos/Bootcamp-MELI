package br.dh.meli.secury.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecutiryConfig {
    @Bean //sera gerenciado pelo spring
    public InMemoryUserDetailsManager userDetailsConfig() {//sera armazenado em memoria, o tipo de usuario é UserDetails
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("user")
                .password(bCryptPasswordEncoder().encode("12345"))
                .roles("USER")
                .build());

        System.out.println("password: " + manager.loadUserByUsername("user").getPassword());

        return manager;
    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
