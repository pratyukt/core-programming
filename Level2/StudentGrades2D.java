import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i+1) + " in Physics, Chemistry, Maths: ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            percent[i] = sum / 3.0;
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
