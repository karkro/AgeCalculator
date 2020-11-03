package pl.karkro;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Year of birth: ");
        int year = sc.nextInt();
        System.out.print("Month of birth: ");
        int month = sc.nextInt();
        System.out.print("Day of birth: ");
        int day = sc.nextInt();

        LocalDate today  = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        int years = Period.between(birthday, today).getYears();
        System.out.println("You are " + years + " years old");
    }
}
