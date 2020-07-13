package arrayEmployees;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Witaj! Ilu pracowników jest w firmie?");
        int num=sc.nextInt();
        sc.nextLine();
        EmployeeBuilser builser=new EmployeeBuilser();
        builser.createEmployeeArray(num);
        builser.printEmployeeArray(num);
        System.out.println("Suma wypłat w firmie to: "+builser.sumSalary(num)+".");
    }
}
