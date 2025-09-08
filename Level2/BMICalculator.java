import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[5];
        double[] weight = new double[5];
        double[] bmi = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter height (m) of person " + (i+1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            weight[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Person " + (i+1) + " BMI: " + bmi[i]);
        }
        sc.close();
    }
}
