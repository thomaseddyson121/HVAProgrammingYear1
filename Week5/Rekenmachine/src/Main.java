/**
 *  @author T.Eddyson
 *  Calculator
 *
 *
 * */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char charOperator = '!';
        String stringOperator;

        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Operator (S == stoppen): ");
            stringOperator = scanner.next();

            charOperator = stringOperator.charAt(0);

            if (charOperator == 's' || charOperator == 'S') {
                isRunning = false;
            }

            while (!isGeldigeOperator(charOperator)) {
                System.out.println("Operator is ongeldig");
            }

            if (isRunning) {
                double getal1 = 0;
                double getal2 = 0;

                System.out.print("Eerste getal: ");
                getal1 = Double.parseDouble(scanner.next());

                System.out.print("Tweede getal: ");
                getal2 = Double.parseDouble(scanner.next());

                printBerekening(charOperator, getal1, getal2);
            }

        }
    }

    static boolean isGeldigeOperator(char karakter) {

        boolean isChar = true;

        if (karakter == '+' && karakter != '-' && karakter != '*' && karakter != '/' && karakter != '%')
        {
            isChar = false;
        }

        return isChar;
    }

    static void printBerekening(char operator, double getal1, double getal2) {

        double result = 0;
        char charOperator = ' ';

        switch (operator) {
            case '+':
                result = getal1 + getal2;
                charOperator = '+';
                break;

            case '-':
                result = getal1 - getal2;
                charOperator = '-';
                break;

            case '*':
                result = getal1 * getal2;
                charOperator = '*';
                break;

            case '/':
                result = getal1 / getal2;
                charOperator = '/';
                break;

            case '%':
                result = getal1 % getal2;
                charOperator = '%';
                break;
        }

        System.out.println(getal1 + charOperator + getal2 + "=" + result);
    }
}