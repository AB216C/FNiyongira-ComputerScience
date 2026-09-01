package aJavaBasics;
public class MultDimentionArray {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Access elements in 2 D array
        System.out.println("Matrix elements");

        for( int i = 0; i<matrix.length; i++) {

            for(int j=0; j<matrix[i].length; j++) {
                System.out.println(matrix[i][j] + "");
            }
        }
//        System.out.println();

        //Accessing a specific element

        int specificElement = matrix[1][2];

        System.out.println( "value at index 1= row value with index 2= column value, value equal : "+ specificElement);
        //value should be equal to 6

        int specificElements = matrix[0][1];
        System.out.println( "row 1, column2, value equal : "+ specificElements);


    }
}
