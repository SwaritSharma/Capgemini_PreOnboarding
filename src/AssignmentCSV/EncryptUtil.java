package AssignmentCSV;

import java.util.Base64;

public class EncryptUtil {
    static String encrypt(String s) {
        return Base64.getEncoder().encodeToString(s.getBytes());
    }
    static String decrypt(String s) {
        return new String(Base64.getDecoder().decode(s));
    }
}
