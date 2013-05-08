import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AccountNumberTest {

   @Test
   public void shouldCalculateEasyChecksum() {
      AccountNumber accountNumber = new AccountNumber("000000000");
      assertEquals(0, accountNumber.getChecksum());
   }

   @Test
   public void shouldCalculateMediumChecksum() {
      assertEquals(1, new AccountNumber("000000001").getChecksum());
   }

   @Test
   public void shouldCalculateHardChecksum() {
      assertEquals(5, new AccountNumber("000000021").getChecksum());
   }
}
