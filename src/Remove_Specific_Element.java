import java.util.Arrays;

public class Remove_Specific_Element {
    //main method

    public static void main(String[] args) {
        //declare the array
        int[] array ={23,45,35,46,78,78,3,267,80};
        //print for array
        System.out.println("Original Array: "+ Arrays.toString(array));

        //Remove the second element(index - 1,value-45) of the array
        int removeIndex =1;
        //for loop condition
        for (int i = removeIndex; i < array.length-1; i++)
        {
            array[i] = array[i + 1];
        }
        //we cannot alter the size of an array, after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: "+Arrays.toString(array));

    }
}
