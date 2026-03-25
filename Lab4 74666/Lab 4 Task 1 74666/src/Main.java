import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
        if (length == 0 || width == 0) {
            System.out.println("Debil");
        }
    }

    public void fieldDisplay() {
        System.out.println("Rectangle dimensions:");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();

        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}