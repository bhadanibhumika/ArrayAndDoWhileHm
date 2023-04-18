import java.util.Arrays;

public class CheckArraysEqual {
    // main method
    public static void main(String[] args) {

        //declare arrays and initialize  to compare
        int[] x = {45, 35, 25, 15, 5};
        int[] y = {45, 35, 25, 15, 5};

        // boolean condition (x==y)
        if (Arrays.equals(x,y)) {
            System.out.println("Arrays are equal.");
        }
        else
        {
            System.out.println("Arrays are not equal.");
        }

        }

    }