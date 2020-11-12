package assignment;

import java.util.Scanner;

public class App {

	public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String operation = input.nextLine();

        System.out.println("Please enter the first number");
        int firstNum = input.nextInt();
        input.nextLine();

        System.out.println("Please enter the second number");
        int secondNum = input.nextInt();
        input.nextLine();

        System.out.println(firstNum + " + " + secondNum + " =");
        
        System.out.println(calculate(operation, firstNum, secondNum));
    }

    public static float calculate(String operation, int numOne, int numTwo){

        switch (operation){
            case "add":
                return numOne + numTwo;
            case "subtract":
                return numOne - numTwo;
            case "multiply":
                return numOne * numTwo;
            case "divide":
                return numOne / numTwo;
            default:
                return 0;

        }

    }

}

