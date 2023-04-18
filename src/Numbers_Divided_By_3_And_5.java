public class Numbers_Divided_By_3_And_5 {

    //main method
    public static void main(String[] args) {
        //Declare an array to store numbers from 1 to 100
        int[] numbers = new int[100];

        //Initialize the index variable to 0
        int index = 0;

        //use for loop syntax to Add number from 1 to 100 in the array
        for (int i = 1; i <=100 ; i++) {
            numbers[index] = i;
            index++;

        }
        //print for numbers divided by 3
        System.out.println(" The Numbers between 1 to 100 can divided by 3: ");
        //reset the index variable  to 0
        index = 0;
        //do syntax
        do {
            //if condition
            if (numbers[index] % 3 == 0)
            {
                // for print the numbers
                System.out.print(numbers[index]+" ");
            }
            //for stop the loop to 100 number
            index++;
        }
        //while loop syntax
        while ( index < 100);


        // print the number divided by 5
        System.out.println("\n The Numbers between 1 to 100 can divided by 5");
        //reset the index variable  to 0
        index=0;
        // do syntax
        do
        {
            //if condition
            if (numbers[index] % 5 == 0)
            {
                //for print the numbers which divided by 5
                System.out.print(numbers[index]+" ");
            }
            //for stop the loop to 100 number
            index++;
        }
        //while loop syntax
        while (index<100);


    }
}
