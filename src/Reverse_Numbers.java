import java.util.Scanner;

public class Reverse_Numbers {

    //main method
    public static void main(String[] args) {
        //create scanner class object
        Scanner scanner = new Scanner(System.in);

        //declare the integer array size of 5
        int[] array = new int[5];

        // take the user input
        System.out.println("Enter a 5- digit number: ");

        //declare variable num use the scanner object
        int num =scanner.nextInt();

        //print of user input
        System.out.println("Original number of Array: "+"\n"+num);

        //use for loop
        for (int i = 0; i < array.length ; i++) {
            array[i] = num%10;
            num=num/10;

        }
        //print for reverse number
        System.out.println("Reversed number: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }

    }



    }



