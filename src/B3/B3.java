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

        System.out.println("a+b = "+MathOperations.add(a,b));
        System.out.println("a-b = "+MathOperations.subtract(a,b));
        System.out.println("a*b = "+MathOperations.multiply(a,b));
        System.out.println("a/b = "+MathOperations.divide(a,b));

    }

}
