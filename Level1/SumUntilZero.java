import java.util.*;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("enter a number (0 to stop) ");
            double val = sc.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println(total);
    }
}