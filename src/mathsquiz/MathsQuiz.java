package mathsquiz;

import java.util.Scanner;

public class MathsQuiz {
   private int sumPoints=0;
   private boolean result=true;
   private Scanner sc=new Scanner(System.in);

    public void question1(){
        System.out.println("Podaj wynik mnożenia 3*5:");
        int solution=sc.nextInt();
        sc.nextLine();
        double resultQuestion1=15;
        if(solution==resultQuestion1){
            sumPoints++;
            result=true;
            System.out.println(result+" Gratuję twoja odpoweidz jest poprawna!");
        }else
        {
            result=false;
        System.out.println(result+" Twoja odpowiedź nie jest poprawna! opdrawna odpowiedź to: "+resultQuestion1);
        }
    }

    public void question2(){
        System.out.println("Podaj pole kwadratu o boku 12:");
        double solution=sc.nextDouble();
        sc.nextLine();
        double powQuestion2=Math.pow(12,2);
        if(solution==powQuestion2){
            sumPoints++;
            result=true;
            System.out.println(result+" Gratuję twoja odpoweidz jest poprawna!");
        }else {
            result = false;
            System.out.println(result + " Twoja odpowiedź nie jest poprawna! opdrawna odpowiedź to: " + powQuestion2);
        }
    }

    public void question3(){
        System.out.println("Podaj pierwistek kwadratowy z 15129:");
        double solution=sc.nextDouble();
        double sqrQuestion3=Math.sqrt(15129);
        sc.nextLine();
        if(solution==sqrQuestion3){
            sumPoints++;
            result=true;
            System.out.println(result+" Gratuję twoja odpoweidz jest poprawna!");
        }else {
            result = false;
            System.out.println(result + " Twoja odpowiedź nie jest poprawna! opdrawna odpowiedź to: " + solution);
        }
    }

    public void printResult(){
        System.out.println("Wynik: "+sumPoints+"/3.");
    }

}
