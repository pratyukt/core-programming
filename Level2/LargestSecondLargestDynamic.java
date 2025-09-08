import java.util.Scanner;
import java.util.ArrayList;
public class LargestSecondLargestDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        int largest = digits.get(0), second = -1;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
        sc.close();
    }
}
