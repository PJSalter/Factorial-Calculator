package com.company;

import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Factorial Calculator")
class FactorialTest {

    private Factorial fact;
    private int num;
    private ByteArrayInputStream inputStream = null;
    private ByteArrayOutputStream byteArrayOutputStream = null;

    @BeforeEach
    public void doInit() {
		/*
		inputStream = new ByteArrayInputStream("-6".getBytes());
	    byteArrayOutputStream = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(byteArrayOutputStream);
	    fact = new Factorial(inputStream, ps);
	    */
    }

    /*@Test
	@DisplayName("Check the Input")
	public void testGetTheInputNumber() {

		 num = fact.isInputNumberValid();

	}*/

    @Test
    @DisplayName("Calculate the Factorial of 1")
    public void testCalculateFactorialOfOne() {

        inputStream = new ByteArrayInputStream("1".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);

        //testGetTheInputNumber();
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        String key = "The Factorial is:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        //Assertions.assertEquals("720",output);
        Assertions.assertEquals("1",output);

    }

    @Test
    @DisplayName("Calculate the Factorial of 2")
    public void testCalculateFactorialOfTwo() {

        inputStream = new ByteArrayInputStream("2".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);

        //testGetTheInputNumber();
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        String key = "The Factorial is:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        //Assertions.assertEquals("720",output);
        Assertions.assertEquals("2",output);

    }

    @Test
    @DisplayName("Calculate the Factorial of 5")
    public void testCalculateFactorialOfFive() {

        inputStream = new ByteArrayInputStream("5".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);

        //testGetTheInputNumber();
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        String key = "The Factorial is:";
        String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
        //System.out.println("hehe:"+output);
        //Assertions.assertEquals("720",output);
        Assertions.assertEquals("120",output);

    }

    @Test
    @DisplayName("Calculate the Factorial of -5")
    public void testCalculateFactorialOfNegative() {

        inputStream = new ByteArrayInputStream("-5".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);

        //testGetTheInputNumber();
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        String key = "Please Enter valid Input as number between 1 and 10 only, both inclusive";
        String output = outputText.substring(outputText.indexOf(key));
        //Assertions.assertEquals("720",output);
        Assertions.assertEquals("Please Enter valid Input as number between 1 and 10 only, both inclusive",output);

    }

    @Test
    @DisplayName("Calculate the Factorial of 11")
    public void testCalculateFactorialOfEleven() {

        inputStream = new ByteArrayInputStream("11".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);

        //testGetTheInputNumber();
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        String key = "Please Enter valid Input as number between 1 and 10 only, both inclusive";
        String output = outputText.substring(outputText.indexOf(key));
        //Assertions.assertEquals("720",output);
        Assertions.assertEquals("Please Enter valid Input as number between 1 and 10 only, both inclusive",output);

    }

    @Test
    @DisplayName("Validation of Input")
    void isInputNumberValid() {

        inputStream = new ByteArrayInputStream("abc".getBytes());
        byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        fact = new Factorial(inputStream, ps);
        fact.calculateFactorial();
        String outputText = byteArrayOutputStream.toString();
        //System.out.println("outputtext: " + outputText);
        String key = "Please Enter valid Input as number between 1 and 10 only, both inclusive";
        String output = outputText.substring(outputText.indexOf(key));
        //System.out.println("output: " + output);
        Assertions.assertEquals("Please Enter valid Input as number between 1 and 10 only, both inclusive",output);

    }

    @AfterEach
    public void doTearDown() {
        inputStream = null;
        byteArrayOutputStream = null;
        fact = null;
    }

}