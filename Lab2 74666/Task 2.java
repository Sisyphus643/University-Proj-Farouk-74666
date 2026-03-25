public class task2 {
    public static void main(String[] args) {

        int numberFarouk = (int)(Math.random() * 100) + 1;

        System.out.println("Generated random number: " + numberFarouk);

        if (numberFarouk % 2 == 0) {
            System.out.println("The number is even because it is divisible by 2.");
        } else {
            System.out.println("The number is odd because it is not divisible by 2.");
        }

    }
}
