import java.util.HashMap;
import java.util.Map;

public class Account {

   private static Map<String,String> digits = new HashMap<String, String>();
   private final static String ZERO = " _ \n" +
                 "| |\n" +
                 "|_|\n";
   private static final String ONE = "   \n" +
                                     "  |\n" +
                                     "  |\n";
   private static final String TWO = " _ \n" +
                                     " _|\n" +
                                     "|_ \n";
   private static final String THREE = " _ \n" +
                                     " _|\n" +
                                     " _|\n";
   private static final String FOUR = "   \n" +
                                     "|_|\n" +
                                     "  |\n";
   private static final String FIVE = " _ \n" +
                                     "|_ \n" +
                                     " _|\n";
   private static final String SIX= " _ \n" +
                                     "|_ \n" +
                                     "|_|\n";
   private static final String SEVEN = " _ \n" +
                                       "  |\n" +
                                       "  |\n";
   private static final String EIGHT = " _ \n" +
                                       "|_|\n" +
                                       "|_|\n";
   private static final String NINE = " _ \n" +
                                      "|_|\n" +
                                      " _|\n";
   private String[] lines;
   private int checksum;

   public Account(String input) {
      lines = input.split("\n");
      digits.put(ZERO, "0");
      digits.put(ONE, "1");
      digits.put(TWO, "2");
      digits.put(THREE, "3");
      digits.put(FOUR, "4");
      digits.put(FIVE, "5");
      digits.put(SIX, "6");
      digits.put(SEVEN, "7");
      digits.put(EIGHT, "8");
      digits.put(NINE, "9");
   }



   public AccountNumber getNumber() {
      StringBuilder convertedNumber = new StringBuilder();

      for(int characterIndex = 0; characterIndex < getNumberOfCharacters(); characterIndex++) {
         convertedNumber.append(digits.get(fetchCharacterAt(characterIndex)));
      }

      return new AccountNumber(convertedNumber.toString());
   }

   private int getNumberOfCharacters() {
      return lines[0].length() / 3;
   }

   private String fetchCharacterAt(int index) {
      StringBuilder character1 = new StringBuilder();
      for (String line : lines) {
         int lowerBound = index * 3;
         int upperBound = lowerBound + 3;
         character1.append(line.substring(lowerBound, upperBound))
               .append("\n");
      }
      return character1.toString();
   }

   public int getChecksum() {
      return checksum;
   }


}
