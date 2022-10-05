// Thomas Eddyson, IS109
// Assignment Verkoopprijs: Calculate the price of no tax, 6 percent tax and 21 percent tax
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double TAX_HIGH = 21  ;
        final double TAX_LOW = 6;

        double winstmarge = 15;
        double inKoopPrijs = 70.80;

        // Ask the user for input for the Buying Price
        System.out.print("Inkoopprijs: ");
        inKoopPrijs = Double.parseDouble(scanner.next());

        // Ask the user for input for the gain percentage
        System.out.print("Winstmarge (in %): ");
        winstmarge = Double.parseDouble(scanner.next());

        // Calculates the gain percentage of the given percentage by the user
        // Calculates the gain excluding tax from the gain percentage
        double percentWinstmarge = (winstmarge / 100) * inKoopPrijs;
        double sellPriceExclTax =  percentWinstmarge + inKoopPrijs;

        // Calculates the gain with low tax
        double percentTaxLow = (TAX_LOW / 100) * sellPriceExclTax;
        double sellPriceLowTax = sellPriceExclTax + percentTaxLow;

        // Calculates the gain with high tax
        double percentTaxHigh = (TAX_HIGH / 100) * sellPriceExclTax;
        double sellPriceHighTax = sellPriceExclTax + percentTaxHigh;

        System.out.println(
                "Verkoopprijs exclusief BTW: " + sellPriceExclTax + "\n" +
                "Verkoopprijs inclusief 6% BTW: " + sellPriceLowTax + "\n" +
                "Verkoopprijs incluseif 21% BTW: " + sellPriceHighTax
        );
    }
}