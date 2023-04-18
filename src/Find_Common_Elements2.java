import java.util.Arrays;

public class Find_Common_Elements2 {

    //main method
    public static void main(String[] args) {


        //create Array 1
        String[] arr1 = {"Bhumi","Nirav","Hardik","raghu","Vruti","guddi"};
        //create Array 1
        String[] arr2 = {"pinal","raghu","Vruti","guddi","punam","shivu"};

        //Print  for Array 1
        System.out.println("Array 1: " + Arrays.toString(arr1));

        // print  for Array 2
        System.out.println("Array 2: " + Arrays.toString(arr2));

        System.out.println("Common Elements: ");

        //for loop syntax
        for (int i = 0; i < arr1.length; i++) {
            //nested for loop syntax
            for (int j = 0; j < arr2.length; j++) {
                //if condition
                if (arr1[i] == arr2[j]) {
                    //print for common elements
                    System.out.print(arr1[i] + ",");
                }

            }

        }


    }}
