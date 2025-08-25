import java.util.Scanner;
public class LeapYearMultipleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " Leap Year");
                    } else {
                        System.out.println(year + " Not Leap Year");
                    }
                } else {
                    System.out.println(year + "Leap Year");
                }
            } else {
                System.out.println(year + " Not Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }
    }
}