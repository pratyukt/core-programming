import java.util.Scanner;
public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " Not Leap Year");
        } else {
            System.out.println("Year must be >= 1582");
        }
    }
}