import java.util.Scanner;

class QuadraticEquation {    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c;
        double x1 = 0, x2 = 0, delta;

        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
            return;
        }

        delta = b * b - 4 * a * c;

    int numberOfRoots = 0;
        if (delta > 0)
            numberOfRoots = 2;
        else if (delta == 0)
            numberOfRoots = 1;
        else

        System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", a, b, c);

        switch (numberOfRoots) {
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Two real roots:");
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);
                break;

            case 1:
                x1 = -b / (2 * a);
                System.out.println("One real root:");
                System.out.printf("x1 = x2 = %.2f%n", x1);
                break;

            case 0:
                System.out.println("No real roots.");
                break;
        }

        input.close();
    }
}