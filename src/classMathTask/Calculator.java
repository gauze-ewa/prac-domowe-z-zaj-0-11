package classMathTask;

import java.beans.PropertyEditorSupport;

public class Calculator {
    void isEven(int a) {
        boolean result = true;
        if (a % 2 == 0) {
            result = true;
        } else
            result = false;
        System.out.println("Czy liczba " + a + " jest parzysta? " + result);
    }

    void isOdd(int a) {
        boolean result = true;
        if (a % 2 != 0) {
            result = true;
        } else
            result = false;
        System.out.println("Czy liczba " + a + " jest nieparzysta? " + result);
    }

    void circleField(double r) {
        double result = Math.PI * r * r;
        System.out.printf("Pole koła o promieniu %.2f wynosi %.2f.\n", r, result);
    }

    void power(int a) {
        System.out.println("Kwadrat liczby " + a + " wynosi " + (a * a) + ".");
    }
}
