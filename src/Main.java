import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        BigDecimal vatPerUnit = productCost.multiply(vatRate);

        BigDecimal totalNet = BigDecimal.ZERO;
        BigDecimal totalVat = BigDecimal.ZERO;
        BigDecimal totalGross = BigDecimal.ZERO;

        for (int i = 0; i < 10000; i++) {
            totalNet = totalNet.add(productCost);
            totalVat = totalVat.add(vatPerUnit);
            totalGross = totalGross.add(productCost.add(vatPerUnit));
        }

        System.out.println("VAT per unit: " + vatPerUnit);
        System.out.println("Total net sales: " + totalNet);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);
    }
}
