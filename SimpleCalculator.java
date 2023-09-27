package Day7;

import java.util.Scanner;

public class git {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
 

        System.out.print("Operation? (+, -, *, /): ");
        String operation = sc.next();
        int result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
//new comment
    }
 
    public static int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
            	int a = firstNumber + secondNumber;
            	System.out.println(a);
                //implement addition
                break;
            case "-":
            	int b = firstNumber - secondNumber;
            	System.out.println(b);
                //implement subtraction
                break;
            case "*":
            	int c = firstNumber * secondNumber;
            	System.out.println(c);
                //implement multiplication
                break;
            case "/":
            	int d = firstNumber / secondNumber;
            	System.out.println(d);
                //implement division
                break;
            default:
                System.out.println("Invalid operation");
                break;
                
        }
        return result;
    }
}