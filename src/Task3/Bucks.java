package Task3;

import java.util.function.Function;

public class Bucks {
    public static void main(String[] args) {
        String s = "364.8 BYN";
        Function<String, String> convertToUSD = str -> {
            String[] parts = str.split(" ");
            double byn = Double.parseDouble(parts[0]);
            double bucks = byn / 3.2;
            StringBuilder sb = new StringBuilder();
            sb.append(bucks).append(" $");
            return sb.toString();
        };
        String result = convertToUSD.apply(s);
        System.out.println(result);
    }
}
