import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        int a, b, sum, product, difference, quotient;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        sum = a + b;
        product = a * b;
        difference = a - b;
        quotient = a / b;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The difference is: " + difference);
        System.out.println("The quotient is: " + quotient);
    }


}
