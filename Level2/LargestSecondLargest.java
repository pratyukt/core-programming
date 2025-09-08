import java.util.Scanner;
public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int count = 0;
        while (num > 0) {
            digits[count++] = num % 10;
            num /= 10;
        }
        int largest = digits[0], second = -1;
        for (int i = 1; i < count; i++) {
            if (digits[i] > largest) {
                second = largest;
                largest = digits[i];
            } else if (digits[i] > second && digits[i] != largest) {
                second = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + second);
        sc.close();
    }
}
