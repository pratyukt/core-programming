import java.util.*;
public class Divisibleby5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if (num % 5 == 0) {
                System.out.println("Yes " + num + " is divisible by 5");
            } else {
                System.out.println("NO " + num + " is not divisible by 5");
            }
        }
}


