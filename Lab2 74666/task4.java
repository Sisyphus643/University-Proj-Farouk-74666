import java.math.BigDecimal;

public class task4 {

    public static void main(String[] args) {

        double netPrice = 9.99;
        double vat = 0.23;

        double grossPrice = netPrice * (1 + vat);
        double totalGross = grossPrice * 10000;
        double totalNet = totalGross / (1 + vat);

        System.out.println("Using double:");
        System.out.println("Gross price of one product: " + grossPrice);
        System.out.println("Total gross for 10000 products: " + totalGross);
        System.out.println("Total net calculated from gross: " + totalNet);


        BigDecimal netPriceBD = new BigDecimal("9.99");
        BigDecimal vatBD = new BigDecimal("0.23");
        BigDecimal one = new BigDecimal("1");
        BigDecimal quantity = new BigDecimal("10000");

        BigDecimal grossPriceBD = netPriceBD.multiply(one.add(vatBD));
        BigDecimal totalGrossBD = grossPriceBD.multiply(quantity);
        BigDecimal totalNetBD = totalGrossBD.divide(one.add(vatBD));

        System.out.println("\nUsing BigDecimal:");
        System.out.println("Gross price of one product: " + grossPriceBD);
        System.out.println("Total gross for 10000 products: " + totalGrossBD);
        System.out.println("Total net calculated from gross: " + totalNetBD);

        System.out.println("\nConclusion: BigDecimal gives more precise financial calculations than double.");

    }
}