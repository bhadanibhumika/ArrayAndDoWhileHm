import java.util.Scanner;

public class MultiplicationTable {

    //main method
    public static void main(String[] args) {

        // create scanner class obj
        Scanner scanner = new Scanner(System.in);

        // for take the user input
        System.out.println("Please Enter the any number: ");

        // declare variable using scanner object
        int a = scanner.nextInt();

        //initialization
        int i = 1;

        //do while loop syntax
        do
        {
            System.out.println(a+" x "+i+" = "+(a*i));
            i++;
        }
        //boolean condition
        while (i<=12);
}
}
