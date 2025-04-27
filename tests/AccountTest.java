import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testLinkAccount() {
        Accounts account = new Accounts();
        // Since linkAccount is not implemented, we assert that it throws an exception.
        assertThrows(UnsupportedOperationException.class, account::linkAccount, "linkAccount method not implemented");
    }
}
