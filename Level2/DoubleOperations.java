import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three doubles: ");
        double da = sc.nextDouble();
        double db = sc.nextDouble();
        double dc = sc.nextDouble();
        double dop1 = da + db * dc;
        double dop2 = da * db + dc;
        double dop3 = dc + da / db;
        double dop4 = da % db + dc;
        System.out.println("Results: " + dop1 + ", " + dop2 + ", " + dop3 + ", " + dop4);
    }
}