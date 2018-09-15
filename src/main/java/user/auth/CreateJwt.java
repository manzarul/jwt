package user.auth;

import java.util.Date;
import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
/**
 * 
 * @author Manzarul
 *
 */
public class CreateJwt {
	public static final long EXPIRY_TIME_MILLIS = 3600000;
	public static final String ISSUES_ID = "issuerDetails";

	public static String createToken(Map<String, String> map) {
		Builder builder = JWT.create();
		if (map == null) {
			throw new RuntimeException("Can't create token !");
		}
		for (Map.Entry<String, String> entry : map.entrySet()) {
			builder.withClaim(entry.getKey(), entry.getValue());
		}
		builder.withIssuedAt(new Date());
		builder.withExpiresAt(new Date(System.currentTimeMillis() + EXPIRY_TIME_MILLIS));
		builder.withIssuer(ISSUES_ID);
		return builder.sign(JwtUtil.getAlgorithm());
	}

}
