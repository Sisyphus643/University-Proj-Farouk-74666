class MinMaxWhile {
    public static void main(String[] args) {

        int count = 0;
        int number;

        number = (int)(Math.random() * 100) + 1;
        int min = number;
        int max = number;

        System.out.println("Generated numbers:");
        System.out.println(number);

        count = 1;

        while (count < 10) {
            number = (int)(Math.random() * 100) + 1;
            System.out.println(number);

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }

            count++;
        }

        System.out.println("\nSmallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}