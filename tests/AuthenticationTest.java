import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AuthenticationTest {

    @Test
    void testLogin() {
        Authentication authentication = new Authentication();
        assertThrows(UnsupportedOperationException.class, authentication::login, "login method not implemented");
    }
}
