/**
 *  @author T.Eddyson
 *  Random number generator. Shows the result using dice rules. The eye is determined by the use
 *
 *
 * */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char charDiceEye;

        System.out.print("Which eye should be used? */#: ");
        String strDiceEye = scanner.next();

        charDiceEye = strDiceEye.charAt(0);


        //Keeps calculating a random number between 1 and 6 until 6 is calculated
        int min = 1;
        int max = 6;

        int diceResult = 0;

        do {
            diceResult = (int)Math.floor(Math.random() * (max - min+1)+min);

            switch (diceResult)
            {
                case 1:
                    System.out.println(
                            "   " + "   " + "   " + "\n" +
                            "   " + charDiceEye + "   " + "\n" +
                            "   " + "   " + "   " + "\n"
                    );
                    break;
                case 2:
                    System.out.println(
                            charDiceEye + "   " + "   " + "\n" +
                            "   " + "   " + "   " + "\n" +
                            "   " + "   " + charDiceEye + "\n"
                    );
                    break;
                case 3:
                    System.out.println(
                            charDiceEye + "   " + "   " + "\n" +
                            "   " + charDiceEye + "   " + "\n" +
                            "   " + "   " + charDiceEye + "\n"
                    );
                    break;
                case 4:
                    System.out.println(
                            charDiceEye + "   " + charDiceEye + "\n" +
                            "   " + "   " + "   " + "\n" +
                            charDiceEye + "   " + charDiceEye + "\n"
                    );
                    break;
                case 5:
                    System.out.println(
                            charDiceEye + "   " + charDiceEye + "\n" +
                            "  " + charDiceEye + "   " + "\n" +
                            charDiceEye + "   " + charDiceEye + "\n"
                    );
                    break;
                case 6:
                    System.out.println(
                            charDiceEye + "   " + charDiceEye + "\n" +
                            charDiceEye + "   " + charDiceEye + "\n" +
                            charDiceEye + "   " + charDiceEye + "\n"
                    );
                    break;
                default:
                    System.out.println("No output!");
            }
        } while (diceResult != 6);
    }
}