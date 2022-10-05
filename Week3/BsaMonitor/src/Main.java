/**
 *  @author T.Eddyson
 *  Programm for a BSA monitor
 *
 *  Source for curiculum points: https://studiegids.hva.nl/po/hbo-ict-se-vt/100000026
 * */

// TODO: Make the points variables finals.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gradePrjctFYS = 0;
        double gradePrgrmmng = 0;
        double gradeDtbs = 0;
        double gradePrsnlPrjctSklls = 0;
        double gradeInfrstrctr = 0;
        double gradeNtwrkEngnrng = 0;

        int pointsPrjctFYS = 12;
        int pointsPrgrmmng = 3;
        int pointsDtbs = 3;
        int pointsPrsnlPrjctSklls = 4;
        int pointsInfrstrctr = 3;
        int pointsNtwrkEngnrng = 3;

        int resultPoints = 0;
        int maxPoints = 0;

        maxPoints = pointsPrjctFYS + pointsPrgrmmng + pointsDtbs +
                    pointsPrsnlPrjctSklls + pointsInfrstrctr + pointsNtwrkEngnrng;

        System.out.println("Voer behaalde cijfers in:");

        System.out.print("Fasten Your SeatBelt: ");
        gradePrjctFYS = Double.parseDouble(scanner.next());

        if (gradePrjctFYS >= 5.5) {
            resultPoints = resultPoints + pointsPrjctFYS;
        } else {
            pointsPrjctFYS = 0;
        }

        System.out.print("Programming: ");
        gradePrgrmmng = Double.parseDouble(scanner.next());

        if (gradePrgrmmng >= 5.5) {
            resultPoints = resultPoints + pointsPrgrmmng;
        } else {
            pointsPrgrmmng = 0;
        }

        System.out.print("Databases: ");
        gradeDtbs = Double.parseDouble(scanner.next());

        if (gradeDtbs >= 5.5) {
            resultPoints = resultPoints + pointsDtbs;
        } else {
            pointsDtbs  = 0;
        }

        System.out.print("Personal & Project Skills: ");
        gradePrsnlPrjctSklls = Double.parseDouble(scanner.next());

        if (gradePrsnlPrjctSklls >= 5.5) {
            resultPoints = resultPoints + pointsPrsnlPrjctSklls;
        } else {
            pointsPrsnlPrjctSklls = 0;
        }

        System.out.print("Infrastructure: ");
        gradeInfrstrctr = Double.parseDouble(scanner.next());

        if (gradeInfrstrctr >= 5.5) {
            resultPoints = resultPoints + pointsInfrstrctr;
        } else {
            pointsInfrstrctr = 0;
        }

        System.out.print("Network Enginneering: ");
        gradeNtwrkEngnrng = Double.parseDouble(scanner.next());

        if (gradeNtwrkEngnrng >= 5.5) {
            resultPoints = resultPoints + pointsNtwrkEngnrng;
        } else {
            pointsNtwrkEngnrng = 0;
        }

        System.out.println(
                        "Vak/Project: Fasten Your Seatbelts" + "\t\t\t\t" +
                        "Cijfer: " + gradePrjctFYS + " Behaalde punten: " + pointsPrjctFYS + "\n" +
                        "Vak/Project: Programming" + "\t\t\t\t\t\t" +
                        "Cijfer: " + gradePrgrmmng + " Behaalde punten: " + pointsPrgrmmng + "\n" +
                        "Vak/Project: Database" + "\t\t\t\t\t\t\t" +
                        "Cijfer: " + gradeDtbs + " Behaalde punten: " + pointsPrgrmmng + "\n" +
                        "Vak/Project: Personal & Project Skills" + "\t\t\t" +
                        "Cijfer: " + gradePrsnlPrjctSklls + " Behaalde punten: " + pointsPrsnlPrjctSklls + "\n" +
                        "Vak/Project: Infrastructure" + "\t\t\t\t\t\t" +
                        "Cijfer: " + gradeInfrstrctr + " Behaalde punten: " + pointsInfrstrctr + "\n" +
                        "Vak/Project: Network Engineering" + "\t\t\t\t" +
                        "Cijfer: " + gradeNtwrkEngnrng + " Behaalde punten: " + pointsNtwrkEngnrng);

        System.out.println("Totaal behaalde studiepunten: " + resultPoints + "/" + maxPoints);

        boolean bsaWarning = false;

        int pointsWarning = maxPoints / 6 * 5;

        if (resultPoints < pointsWarning) {
            bsaWarning = true;
        }

        String warningNegatief = "PAS OP: je ligt op schema voor een negatief BSA!";
        String warningPositief = "Je ligt op schema voor een positief BSA!";

        if (!bsaWarning) {
            System.out.println(warningPositief);
        } else {
            System.out.println(warningNegatief);
        }
    }
}