public class Transpose_Matrix {

    //main method
    public static void main(String[] args) {
        //declare the 2-Dimensional array
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //create variable n use array method
        int rows = matrix.length;
        int column = matrix[0].length;

        //create variable transpose n assigning the value of columns and row
        int[][] transpose = new int[column][rows];

        //Transpose logic using nested loop
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];

            }
        }
        //print the original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            //print got next line
            System.out.println();

        }
        //print the transposed matrix
        System.out.println("Transpose Matrix: ");
        for (int i = 0; i < column; i++)
        {
            for (int j =0;j < rows;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            //print for next line
            System.out.println();

        }

    }
}
