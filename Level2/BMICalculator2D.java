import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[5][2]; // [height, weight]
        double[] bmi = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            data[i][1] = sc.nextDouble();
            bmi[i] = data[i][1] / (data[i][0] * data[i][0]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i+1) + " BMI: " + bmi[i]);
        }
        sc.close();
    }
}
