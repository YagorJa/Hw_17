package Task4;

import java.util.function.Consumer;

public class DollaConsuem {
    public static void main(String[] args) {
        String s = "364.8 BYN";
        Consumer<String> convert = str -> {
            String[] parts = str.split(" ");
            double byn = Double.parseDouble(parts[0]);
            double usd = byn / 3.2;
            System.out.println(usd + "$");
        };

        convert.accept(s);
    }
}

