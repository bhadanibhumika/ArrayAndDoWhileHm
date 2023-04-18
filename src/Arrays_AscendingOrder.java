import java.util.Arrays;

public class Arrays_AscendingOrder {

    // main method
    public static void main(String[] args) {
        //create array n declare the value
        int[] array = new int[]{20,45,12,21,24,67,10,2,-3};
        // using array  in build sort method
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");

        //for loop syntax for printing array

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+",");
        }


    }
}
