import java.util.Scanner;

public class SquareSide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        System.out.println("Side length = " + side);
    }
}