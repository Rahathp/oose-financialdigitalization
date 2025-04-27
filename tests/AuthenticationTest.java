import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AuthenticationTest {

    @Test
    void testLogin() {
        Authentication authentication = new Authentication();
        // Similar to Account, since login is not implemented, assert that it throws an exception.
        assertThrows(UnsupportedOperationException.class, authentication::login, "login method not implemented");
    }
}
