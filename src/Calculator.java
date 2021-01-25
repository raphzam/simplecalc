import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float inputOne;
        char operator;
        float inputTwo;
        float result = 0;

        System.out.println("First value:");
        inputOne = input.nextFloat();

        System.out.println("Operation");
        operator = input.next().charAt(0);

        System.out.println("Second value:");
        inputTwo = input.nextFloat();

        switch (operator) {
            case ('+'):
                result = inputOne + inputTwo;
                break;
            case ('-'):
                result = inputOne - inputTwo;
                break;
            case ('/'):
                result = inputOne / inputTwo;
                break;
            case ('*'):
                result = inputOne * inputTwo;
                break;
            default:
                break;
        }

        System.out.println(result);


    }
}
