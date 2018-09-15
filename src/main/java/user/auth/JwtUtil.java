package user.auth;

import com.auth0.jwt.algorithms.Algorithm;
/**
 * 
 * @author Manzarul
 *
 */
public class JwtUtil {
	private static final String SECRET = "someSecretVal";

	public static Algorithm getAlgorithm() {
		Algorithm al = Algorithm.HMAC512(SECRET);
		return al;
	}

}
