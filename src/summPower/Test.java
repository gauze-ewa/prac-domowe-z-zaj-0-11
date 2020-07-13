package summPower;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double sum=0;
        System.out.println("Podaj rozmiar tablicy:");
        int size=sc.nextInt();
        sc.nextLine();
        double[]tab=new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Podaj liczbę:");
            tab[i]=sc.nextDouble();
        }
        for (double elements:
             tab) {
            sum+=Math.pow(elements,2);
        }
        System.out.println("Suma kwadratów tablicy: "+sum);

    }
}
