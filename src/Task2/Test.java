package Task2;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-3,6,7,879
                ,-45,34,-7,-53,0,1,-8);
        Predicate<Integer> myPred = num -> num >= 0;

        nums.stream()
                .filter(myPred)
                .forEach(System.out::println);
    }
}

