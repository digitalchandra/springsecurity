package speringsecutiry.login.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity

public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                //login end point
                .formLogin(form->form
                        .loginPage("/login")
                        .permitAll())
                .authorizeHttpRequests(auth->auth
                        // give all required access to the resource file
                        .requestMatchers("/images/**").permitAll()
                        // give all required access for authentication
                        .anyRequest().authenticated())

                .build();

    }
}
