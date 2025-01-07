import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        Account account = new Account (500);
        account.deposit(200);
        assertEquals(700, account.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Account account = new Account (500);
        account.deposit(200);
        assertEquals(300, account.checkBalance());
    }

    @org.junit.jupiter.api.Test
    void checkBalance() {
        assertEquals(500, new Account (500).checkBalance());
    }


    @org.junit.jupiter.api.Test
    void transfer() {
            Account account1 = new Account(500);
            Account account2 = new Account(300);

            account1.transfer(200, account2);
            assertAll(
                    () -> assertEquals(300, account1.checkBalance()),
                    () -> assertEquals(500, account2.checkBalance())
            );
        }
}
