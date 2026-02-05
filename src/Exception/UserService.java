package Exception;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private Set<String> users = new HashSet<>();

    public void registerUser(String username) throws UserAlreadyExistsException {
        if (users.contains(username)) {
            throw new UserAlreadyExistsException("User already exists: " + username);
        }
        users.add(username);
        System.out.println("User registered: " + username);
    }

    public void checkUserExistence(String username) throws UserNotFoundException {
        if (!users.contains(username)) {
            throw new UserNotFoundException("User not found: " + username);
        }
        System.out.println("User exists: " + username);
    }
}

