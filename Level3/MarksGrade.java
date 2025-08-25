import java.util.Scanner;
public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Physics: ");
        int physics = sc.nextInt();
        System.out.print("Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Maths: ");
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        System.out.println("Average Marks: " + percentage);

        if (percentage >= 80) {
            System.out.println("A");
        }
        else if (percentage >= 70 && percentage <=79) {
            System.out.println("B");
        }
        else if (percentage >= 60 && percentage <=69) {
            System.out.println("C");
        }
        else if (percentage >= 50 && percentage <=59) {
            System.out.println("D");

        }
        else if (percentage >= 40 && percentage <=49) {
            System.out.println("E");
        }
        else {
            System.out.println("R");
        }
    }
}