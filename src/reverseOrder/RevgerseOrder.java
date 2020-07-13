package reverseOrder;

import java.util.Scanner;

public class RevgerseOrder {
    private String[] names = new String[5];
    Scanner sc = new Scanner(System.in);
    String[] reverseName = new String[5];

    public String[] reverseArray() {
        System.out.println("Podaj 5 imion:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            reverseName[i] = names[names.length - 1 - i];
        }
        return reverseName;
    }

    public void printInfofo() {
        for (int i = 0; i < reverseName.length; i++) {
            System.out.println("Cześć " + reverseName[i]);
        }
    }

}
