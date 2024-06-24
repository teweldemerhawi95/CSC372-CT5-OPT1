import java.util.Scanner;

public class RecursiveProduct {
    
    static Scanner input = new Scanner(System.in);

    // multiply method recursivelly calls itself and multiplies the numbers.
    public static double multiply(int index) {
        if (index >= 5) {
            return 1;
        } else {
            System.out.print("Please input number " + (index + 1) + ": ");
            double number = input.nextDouble();
            return number * multiply(index + 1);
        }
    }

    // Calls multiply to get the recusrion going
    public static void main(String[] args) {
        System.out.println("Lets multiply 5 numbers using recursion.");
        double result = multiply(0);
        System.out.println("The product is: " + result);
    }
}