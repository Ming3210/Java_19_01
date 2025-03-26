package B3;

import java.util.Scanner;
import java.util.function.BinaryOperator;


public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();


        BinaryOperator<Integer> addition = MathOperations::add;
        BinaryOperator<Integer> subtraction = MathOperations::subtract;
        BinaryOperator<Integer> multiplication = MathOperations::multiply;
        BinaryOperator<Integer> division = MathOperations::divide;

        System.out.println("Addition: " + addition.apply(a, b));
        System.out.println("Subtraction: " + subtraction.apply(a, b));
        System.out.println("Multiplication: " + multiplication.apply(a, b));
        System.out.println("Division: " + division.apply(a, b));

    }

}
