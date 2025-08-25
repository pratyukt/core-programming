import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight: ");
        double weight = sc.nextDouble();
        System.out.print("height: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9 && bmi >=18.5) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 39.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}