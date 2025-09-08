import java.util.Scanner;
public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] salary = new int[10];
        int[] bonus = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextInt();
            bonus[i] = (salary[i] * 10) / 100;
        }
        System.out.println("Employee bonuses:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": " + bonus[i]);
        }
        sc.close();
    }
}
