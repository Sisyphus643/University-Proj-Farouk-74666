public class Task1Mars {

    static float earthWeightfarouk = 72f;
    static float marsGravityfarouk = 0.38f;
    static float marsWeightfarouk;

    static double marsWeightDoublefarouk;
    static int marsWeightIntFarouk;
    static char marsWeightCharFarouk;
    static int resultFarouk;

    public static void main(String[] args) {

        marsWeightfarouk = earthWeightfarouk * marsGravityfarouk;
        System.out.println("My weight on Mars (float): " + marsWeightfarouk);

        marsWeightDoublefarouk = marsWeightfarouk;
        System.out.printf("Weight as double (4 decimals): %.4f\n", marsWeightDoublefarouk);

        marsWeightIntFarouk = (int) marsWeightDoublefarouk;
        System.out.println("Converted to int: " + marsWeightIntFarouk);

        marsWeightCharFarouk = (char) marsWeightIntFarouk;
        System.out.println("Converted to char: " + marsWeightCharFarouk);

        resultFarouk = marsWeightCharFarouk + 2;
        System.out.println("Result after adding 2 to char value: " + resultFarouk);
    }
}