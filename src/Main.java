import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double productCost = 9.99;
        double vatRate = 0.05;
        double vatPerUnit = productCost * vatRate;

        double totalNet = 0.0;
        double totalVat = 0.0;
        double totalGross = 0.0;

        for (int i = 0; i < 10_000; i++) {
            totalNet += productCost;
            totalVat += vatPerUnit;
            totalGross += productCost + vatPerUnit;
        }

        System.out.printf(Locale.US, "VAT per unit: %.4f%n", vatPerUnit);
        System.out.printf(Locale.US, "Total net sales: %.2f%n", totalNet);
        System.out.printf(Locale.US, "Total VAT: %.4f%n", totalVat);
        System.out.printf(Locale.US, "Total gross sales: %.4f%n", totalGross);
    }
}
