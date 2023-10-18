# 🧪 Factorial Calculator 📟
## Problem Statement
For this programming challenge, I was tasked to implement a Java program that calculates and prints the factorial of a number input by the user.

The factorial of a positive integer num is the product of all numbers in the range from 1 to num.

## Example:

```agsl
Factorial(4) = 1 * 2 * 3 * 4, which gives the result of 24.
```
## Input Format
The user can input a value to be used in the calculation.

## Output Format
The program will output a single value showing the factorial of the number input by the user.

## Constraints
The input value must be:

- An integer
- Positive
- Between 1 and 10, inclusive

## Instructions
- I updated my existing `Factorial.java` class to calculate the proper functionality.
- For the prompts and other output to the console, I used `this.printStream.print()` and NOT `System.out.println()`.

## Tasks
1.  Update `isInputNumberValid` Method:

- Update my `isInputNumberValid` method to accept a number from the user and store the value in an instance variable `num`.
- Use the instance variable `scanner` to accept input from the user.
- If the input value is valid, return the number input by the user (NOT the factorial of the number).
- In case of invalid input, print the following message to the console:

```agsl
Invalid entry. Please enter an integer between 1 and 10, inclusive.
return -1
```

2. Updating `calculateFactorial` Method:

- Updating my `calculateFactorial` method so that it calculates and outputs the factorial of the number input by the user.

3. Running the Program
- To run the program, execute the `main` method in the `Factorial.java class`. The program will prompt the user to enter an integer between 1 and 10, inclusive.

## Test Cases
- 🧪Test cases are implemented using `JUnit 5` to ensure the correctness of my `Factorial class`.

## Created by: 🧑‍🎨[Peter Salter](https://github.com/PJSalter)

## 🚀Happy Coding ✨