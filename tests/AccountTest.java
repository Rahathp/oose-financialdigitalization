import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testLinkAccount() {
        Accounts account = new Accounts();
        assertThrows(UnsupportedOperationException.class, account::linkAccount, "linkAccount method not implemented");
    }
}
