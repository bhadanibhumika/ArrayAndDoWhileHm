import java.util.Scanner;

public class Armstrong_Number {
    // main method
    public static void main(String[] args) {
        //create scanner class object
        Scanner scanner = new Scanner(System.in);

        // declare variables
        int number,originalnumber,reminder, result = 0,n = 0;

        // Take user input
        System.out.println("Enter any number: ");
        number = scanner.nextInt();
        originalnumber = number;

        //calculates the number of digits in the input number using do while loop
        do {
            n++;
            number/=10;
        }
        while (number != 0);
        number = originalnumber;
        //calculates the result by raising each digit to the power of digits and adding them up

        do
        {
            reminder = number%10;
            result +=Math.pow(reminder,n); // using in build method for result
            number/=10;
        }
        // while syntax
        while (number != 0);

        // if condition
        if (result == originalnumber )
        {
            System.out.println(originalnumber + " is an Armstrong number.");
        }
        else
        {
            System.out.println(originalnumber + " is not an Armstrong number.");
        }
    }
}
