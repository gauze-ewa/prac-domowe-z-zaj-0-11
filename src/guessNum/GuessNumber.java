package guessNum;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę z przedziału 100-200, podzielną przez 3");
        int number;
        do{
            System.out.println("Podaj liczbę;");
            number = sc.nextInt();
            sc.nextLine();
            if (number >= 100 && number <= 200 && number % 3 == 0) {
                System.out.println("Twoja liczba jest ok");
            }
            else if (number >= 100 && number <= 200 && number % 3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3");
            } else if (number < 100) {
                System.out.println("Twoja liczba za mała");
            } else
                System.out.println("Twoja liczba jest za duża");
        }while (number < 100 || number > 200 || number % 3 != 0);

    }
}
