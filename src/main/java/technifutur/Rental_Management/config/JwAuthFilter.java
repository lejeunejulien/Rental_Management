package technifutur.Rental_Management.config;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/*
@Component
public class JwtAuthFilter extends OncePerRequestFilter {


    private final JwtProvider jwtProvider;

    public JwtAuthFilter(JwtProvider jwtProvider) {
        this.jwtProvider = jwtProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        // 1) sortir le token de la requete
        String token = jwtProvider.extractToken(request);
        // 2) valider le token
        if( token != null && jwtProvider.validateToken(token) ){
            // 3) si il est valide créer l'Authentication
            Authentication auth = jwtProvider.createAuth(token);
            // 4) mettre l'Authentication dans le SecurityContext
            SecurityContextHolder.getContext().setAuthentication(auth);
        }
        // passe au prochain filtre
        filterChain.doFilter(request, response);
    }

}

 */