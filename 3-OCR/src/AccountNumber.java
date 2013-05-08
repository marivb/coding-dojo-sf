public class AccountNumber {

   private String accountNumber;

   public AccountNumber(String accountNumber) {

      this.accountNumber = accountNumber;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }

      AccountNumber that = (AccountNumber) o;

      if (!accountNumber.equals(that.accountNumber)) {
         return false;
      }

      return true;
   }

   @Override
   public int hashCode() {
      return accountNumber.hashCode();
   }

   public int getChecksum() {
      int sum = 0;
      for(char digit : accountNumber.toCharArray()) {
         sum += Integer.parseInt(String.valueOf(digit));
      }

      return sum;
   }
}
