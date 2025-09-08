import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] total = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i+1) + " in Physics, Chemistry, Maths: ");
            int phy = sc.nextInt();
            int chem = sc.nextInt();
            int math = sc.nextInt();
            total[i] = phy + chem + math;
            percent[i] = total[i] / 3.0;
            if (percent[i] >= 90) grade[i] = 'A';
            else if (percent[i] >= 75) grade[i] = 'B';
            else if (percent[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " Percentage: " + percent[i] + " Grade: " + grade[i]);
        }
        sc.close();
    }
}
