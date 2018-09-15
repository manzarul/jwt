package user.auth;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Manzarul
 *
 */
public class TestJWT {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("name", "Manzarul haque");
		map.put("email", "test@test.com");
		map.put("phone", "3455122222");
		map.put("identifier", "qwerrvnfddf1234");
        String token =  CreateJwt.createToken(map);
        System.out.println(token);
        System.out.println("is Token valid " + VerifyToken.isTokenValid(token));
	}

}
