package user.auth;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.interfaces.DecodedJWT;
/**
 * 
 * @author Manzarul
 *
 */
public class VerifyToken {

	public static boolean isTokenValid(String token) {
		JWTVerifier verifier = JWT.require(JwtUtil.getAlgorithm()).withIssuer(CreateJwt.ISSUES_ID).build();
		DecodedJWT decodedJWT = verifier.verify(token);
		System.out.println("Token value==" + decodedJWT.getClaims());
		if(decodedJWT.getExpiresAt().before(new Date())) {
			return false;
		}
		return true;
	}

}
