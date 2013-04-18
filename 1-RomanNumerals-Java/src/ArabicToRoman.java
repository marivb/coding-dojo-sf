import java.util.HashMap;
import java.util.Map;

public class ArabicToRoman {



    public static String convert(int arabic) {
        Map<Integer, String> conversions = new HashMap<Integer, String>();
        conversions.put(100, "C");
        conversions.put(10, "X");
        conversions.put(9, "IX");
        conversions.put(5, "V");
        conversions.put(4, "IV");
        conversions.put(1, "I");

        StringBuilder roman = new StringBuilder();

        if (arabic >= 100) {
            roman.append(conversions.get(100));
            arabic -= 100;
        }

        if (arabic >= 10) {
            roman.append(conversions.get(10));
            arabic -= 10;
        }

        if (arabic >= 9) {
            roman.append(conversions.get(9));
            arabic -= 9;
        }

        if (arabic >= 5) {
            roman.append(conversions.get(5));
            arabic -= 5;
        }

        if (arabic >= 4) {
            roman.append(conversions.get(4));
            arabic -= 4;
        }

        while (arabic >= 1) {
            roman.append(conversions.get(1));
            arabic -= 1;
        }
        return roman.toString();
    }

}
