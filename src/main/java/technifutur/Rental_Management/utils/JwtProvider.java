package technifutur.Rental_Management.utils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.time.Instant;
/*
@Component
public class JwtProvider {

    private final UserDetailsService userDetailsService;

    public JwtProvider(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String createToken(Authentication auth){
        return JWT.create()
                .withSubject( auth.getName() )
                .withExpiresAt(Instant.now().plusMillis( 86_400_000 ))
                //.withClaim("role",ADMIN OR USER)
                .sign( Algorithm.HMAC512("N/BSqnj[09s2)kd%vdZXz,(.Cn}+><GK$j2bd@:{Nc@C`K4vu]TUeL&b~!:qZZg") );
    }

    public String extractToken(HttpServletRequest request){

        String authHeader = request.getHeader("authorization");

        if( authHeader == null )
            return null;

        return authHeader.replace("Bearer ", "");

    }

    public boolean validateToken(String token){

        try {
            DecodedJWT jwt = JWT.require( Algorithm.HMAC512("N/BSqnj[09s2)kd%vdZXz,(.Cn}+><GK$j2bd@:{Nc@C`K4vu]TUeL&b~!:qZZg") )
                    .acceptExpiresAt( 86_400_000 )
                    //.withClaim("role",ADMIN OR USER)
                    .build()
                    .verify(token);

//            return jwt.getSubject().length() > 550;
            return true;
        }
        catch (JWTVerificationException ex){
            return false;
        }
    }

    public Authentication createAuth(String token){

        DecodedJWT jwt = JWT.decode(token);
        String username = jwt.getSubject();
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        return new UsernamePasswordAuthenticationToken(userDetails.getUsername(), null, userDetails.getAuthorities());

    }
}

 */
