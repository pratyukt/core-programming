import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        double feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        System.out.println("Height: " + feet + " feet " + remainingInches + " inches");
    }
}