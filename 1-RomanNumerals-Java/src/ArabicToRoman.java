import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArabicToRoman {



    public static String convert(int arabic) {
        SortedMap<Integer, String> conversions = new TreeMap<Integer, String>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        conversions.put(100, "C");
        conversions.put(50, "L");
        conversions.put(40, "XL");
        conversions.put(10, "X");
        conversions.put(9, "IX");
        conversions.put(5, "V");
        conversions.put(4, "IV");
        conversions.put(1, "I");

        StringBuilder roman = new StringBuilder();

        for (Integer number : conversions.keySet()) {
            while (arabic >= number) {
                roman.append(conversions.get(number));
                arabic -= number;
            }
        }

        return roman.toString();
    }

}
