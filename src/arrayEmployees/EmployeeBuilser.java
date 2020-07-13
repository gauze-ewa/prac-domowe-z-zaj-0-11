package arrayEmployees;

import java.util.Scanner;

public class EmployeeBuilser {
    private Scanner sc=new Scanner(System.in);
    private int b=2000;
    private Employee[]employees=new Employee[b];

    private Employee createEmployee(){
        System.out.println("podaj imie:");
        String firstName=sc.nextLine();
        System.out.println("podaj nazwisko:");
        String lastName=sc.nextLine();
        System.out.println("podaj wypłatę:");
        Double salary=sc.nextDouble();
        sc.nextLine();
        return new  Employee(firstName,lastName,salary);
    }
    public Employee[] createEmployeeArray(int a){
        for (int i = 0; i <a; i++) {
            System.out.println("Pracownik nr"+(i+1)+":");
           employees[i]=createEmployee();
        }
        return employees;
    }

    public void printEmployeeArray(int a){
        for (int i = 0; i <a ; i++) {

            System.out.println(employees[i].printInfo());
        }
    }

    public double sumSalary(int a){
        double sum=0;
        for (int i = 0; i <a ; i++) {
            sum+=employees[i].getSalary();
        }
        return sum;
    }


}
