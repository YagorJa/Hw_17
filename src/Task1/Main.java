package Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату своего рожднения: ");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        LocalDate bDay = LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MM yyyy"));
        LocalDate oneHundred =bDay.plusYears(100);
        System.out.println("100тка будет: " + oneHundred);
    }

}