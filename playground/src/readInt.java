import java.util.Scanner;

public class readInt {
    public static void main(String[] args) {
        System.out.println("This program add two integers");

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the first number ");
        int number1= scanner.nextInt();

        System.out.print("Please enter the second number ");
        int number2 = scanner.nextInt();


        System.out.println(number1 + " + " + number2 + " is " + (number1+ number2));

    }

}
