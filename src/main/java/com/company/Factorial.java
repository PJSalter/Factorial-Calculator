package com.company;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Factorial {

    private Scanner scanner;
    private PrintStream printStream;
    private int num;


    public Factorial(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public int isInputNumberValid()  {
        /*
		- Update this method to accept a number from the user and store the value in an instance variable `num`.
			- Use an instance variable `scanner` to accept the input from the user.

		- If the input value is valid, return the number input by the user (NOT the factorial of the number).

		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
		*/
        // 1. The method starts by accepting user input using the Scanner instance variable scanner.
        // 2. Read input from user.
        String input = this.scanner.nextLine();
        // 3. try-catch block to catch any NumberFormatException that might be
        // thrown when trying to parse the user's input into an integer.
        try {
            // 4. Parse the input as an integer.
            int num = Integer.parseInt(input);

            // 5. Check if the input is between 1 and 10 (inclusive).
            if(num >= 1 && num <= 10) {
                // 6. Store the input in instance variable 'num' and return it.
                this.num = num;
                // System.out.print(num);
                return num;
            } else {
                // 7. Invalid input - print error message and return -1.
                this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
                return -1;
            }
            // 8. If the conversion fails or the input value is not between 1 and 10, inclusive,
            // the method catches the NumberFormatException and prints the message.
        } catch (NumberFormatException e) {
            // "Invalid Entry. Please enter an integer between 1 and 10, inclusive." to the console using the PrintStream instance variable printStream.
            // 9. Invalid input - print error message and return -1
            //System.out.print("What will this be hehe \n");
            //System.out.print(-1);
            this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
            return -1;
        }
    }


    private void calculateFactorial(int num) {

          /*
		 calculate the factorial of the number input by the user.
		*/

        int result = 1;
        // 1. Initializing a 'for' loop with a counter variable 'i' initialized to 1,
        //    and loop until 'i' is less than or equal to 'num'.
        //    increment by 1 'i++'
        for(int i = 1; i <= num; i++) {
            // System.out.print("Number is: " + num + "\n" + i);
            // 2. Inside the loop, update the value of 'result' by multiplying it with 'i'.
            //    This step is done to calculate the factorial of the input number.
            result *= i;
            // 3. After the loop finishes, the value of 'result' will be equal to the factorial of 'num'.
        }
        //System.out.print("The Factorial is: " + result + "\n");
        // All tests pass, all code sections of my logic.
        this.printStream.print("The Factorial is: " + result);

    }

    public void calculateFactorial() {

        int input = this.isInputNumberValid();
        if(input != -1) {
            calculateFactorial(input);
        }

    }

    public static void main(String[] args) {
       // System.out.println("Hello world!");
        Factorial fact = new Factorial(System.in,System.out);
        System.out.println("Enter an integer between 1 and 10, inclusive");
        fact.calculateFactorial();
    }
}