import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //BMI Calculator
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to BMI Calculator.");

        System.out.println("Your weight: (in kg)");
        double weightKot = myObj.nextDouble();
        System.out.println("Your height: (in cm)");
        double heightKot = myObj.nextDouble();

        double bmiKot = weightKot / Math.pow(heightKot/100, 2);

        String bmiCategoryKot = null;

        if (bmiKot < 16.00)
        {
            bmiCategoryKot = "Underweight (Severe thinness)";
        }
        if (bmiKot >= 16.00 && bmiKot <= 16.99)
        {
            bmiCategoryKot = "Underweight (Moderate thinness)";
        }
        if (bmiKot >= 17.00 && bmiKot <= 18.49)
        {
            bmiCategoryKot = "Underweight (Mild thinness)";
        }
        if (bmiKot >= 18.50 && bmiKot <= 22.99)
        {
            bmiCategoryKot = "Normal range (lower half)";
        }
        if (bmiKot >= 23.00 && bmiKot <= 24.99)
        {
            bmiCategoryKot = "Normal range (upper half)";
        }
        if (bmiKot >= 25.00 && bmiKot <= 27.49)
        {
            bmiCategoryKot = "Overweight (lower half)";
        }
        if (bmiKot >= 27.50 && bmiKot <= 29.99)
        {
            bmiCategoryKot = "Overweight (upper half)";
        }
        if (bmiKot >= 30.00 && bmiKot <= 34.99)
        {
            bmiCategoryKot = "Obese (Class I)";
        }
        if (bmiKot >= 35.00 && bmiKot <= 39.99)
        {
            bmiCategoryKot = "Obese (Class II)";
        }
        if (bmiKot >= 40)
        {
            bmiCategoryKot = "Obese (Class III)";
        }

        System.out.println("Your BMI is " + bmiKot + " and you are in " + bmiCategoryKot + " category.");
    }
}
