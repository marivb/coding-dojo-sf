import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AccountTest {
   @Test
   public void shouldReadZero() {
      String number = " _ \n" +
            "| |\n" +
            "|_|\n";
      Account account = new Account(number);
      assertEquals(new AccountNumber("0"), account.getNumber());
   }

   @Test
   public void shouldReadZeroZero() {
      String number = " _  _ \n" +
                      "| || |\n" +
                      "|_||_|\n";
      Account account = new Account(number);
      assertEquals(new AccountNumber("00"), account.getNumber());
   }

   @Test
   public void shouldReadZeroZeroZero() {
      String number = " _  _  _ \n" +
                      "| || || |\n" +
                      "|_||_||_|\n";
      Account account = new Account(number);
      assertEquals(new AccountNumber("000"), account.getNumber());
   }

   @Test
   public void shouldReadAllDigits() {
      String number = "    _  _     _  _  _  _  _ \n" +
                      "  | _| _||_||_ |_   ||_||_|\n" +
                      "  ||_  _|  | _||_|  ||_| _|\n";
      Account account = new Account(number);
      assertEquals(new AccountNumber("123456789"), account.getNumber());
   }








}
