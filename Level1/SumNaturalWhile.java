import java.util.*;
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n >= 1) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }
            System.out.println("Formula = " + sumFormula + ", Loop = " + sumLoop);
        }
    }
}