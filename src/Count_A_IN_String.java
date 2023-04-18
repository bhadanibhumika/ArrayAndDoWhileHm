import java.util.Scanner;

public class Count_A_IN_String {

    //main method
    public static void main(String[] args) {

        //Take input from the user
        Scanner scanner = new Scanner(System.in);
        //declare the variable and assigning the value
        int count =0;
        int i=0;
        char ch ='a';
        // print for user
        System.out.println("Please Enter a String to count 'a' Character = ");
        //declare the str variable using scanner object
        String str = scanner.nextLine();

        //while loop syntax
        while (i<str.length())
        {
            // if condition
            if (str.charAt(i) == 'a')
            {
                //this condition is used to avoid counting space
                count++;
            }
            i++;//while syntax
        }
        // print the total number of characters in the given string
        System.out.println("The Total NUmber of 'a' Characters = "+ count);
    }

}
