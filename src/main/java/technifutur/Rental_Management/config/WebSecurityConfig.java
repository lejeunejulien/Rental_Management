package technifutur.Rental_Management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;


/*
@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthFilter filter) throws Exception {

        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore( filter, UsernamePasswordAuthenticationFilter.class);


        http.authorizeHttpRequests( registry -> {
            registry
                    .requestMatchers(HttpMethod.GET, "/vehicle_properties/get/**").permitAll()
                    .requestMatchers(HttpMethod.POST, "/booking/**").authenticated()
                    .requestMatchers(HttpMethod.PATCH, "/booking/{id:[0-9]+}/*").hasRole("ADMIN")
                    .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                    .anyRequest().permitAll();
        });

        return http.build();
    }

    ///////////////////////////////////////////////////////////

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

    //////////////////////////////////////////////////////////

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

}


 */