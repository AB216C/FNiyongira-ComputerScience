package chapter19Generic6GenericMatrixIntegerMatrixAndRationalMatrix;

public abstract class GenericMatrix<E extends Number> {
	
	/**Abstract method for adding two elements of the matrices*/
	
	protected abstract E add(E o1, E o2);
	
	/*Abstract method for multiplying two elements of the matrices*/
	protected abstract E multiply(E o1, E o2);
	
	/**Abstract for defining zero for the matrix element*/
	
	protected abstract E zero();
	
	/**Add two matrices*/
	// Method to add two matrices
	public E[][] addMatrix(E[][] matrix1, E[][] matrix2)
	{
	    // Make sure both matrices have the same number of rows and columns.
	    // If not, they cannot be added.
	    if ((matrix1.length != matrix2.length) ||
	        (matrix1[0].length != matrix2[0].length))
	    {
	        throw new RuntimeException(
	            "The matrices do not have the same sizes");
	    }

	    // Create a new matrix to store the addition result.
	    // It has the same size as matrix1 and matrix2.
	    E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];

	    // Go through every row.
	    for (int i = 0; i < result.length; i++)
	    {
	        // Go through every column.
	        for (int j = 0; j < result[0].length; j++)
	        {
	            // Add the two corresponding elements
	            // and store the answer in the result matrix.
	            result[i][j] = add(matrix1[i][j], matrix2[i][j]);
	        }
	    }

	    // Return the completed matrix.
	    return result;
	}
	
	
	// Method to multiply two matrices
	public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2)
	{
	    // Matrix multiplication is only possible when:
	    // Number of columns in matrix1 ==
	    // Number of rows in matrix2.
	    if (matrix1[0].length != matrix2.length)
	    {
	        throw new RuntimeException(
	            "The matrices do not have compatible sizes");
	    }

	    // Create the result matrix.
	    // Result rows = matrix1 rows
	    // Result columns = matrix2 columns
	    E[][] result =
	        (E[][]) new Number[matrix1.length][matrix2[0].length];

	    // Go through every row of the result matrix.
	    for (int i = 0; i < result.length; i++)
	    {
	        // Go through every column of the result matrix.
	        for (int j = 0; j < result[0].length; j++)
	        {
	            // Start with zero because we will keep adding
	            // products to calculate one cell.
	            result[i][j] = zero();

	            // Calculate one element of the result matrix.
	            // Multiply matching elements from:
	            // - row i of matrix1
	            // - column j of matrix2
	            for (int k = 0; k < matrix1[0].length; k++)
	            {
	                // Formula:
	                // result[i][j] += matrix1[i][k] * matrix2[k][j]
	                result[i][j] = add(
	                    result[i][j],
	                    multiply(matrix1[i][k], matrix2[k][j])
	                );
	            }
	        }
	    }

	    // Return the completed matrix.
	    return result;
	}
	
	
	/**Print matrices, the operator, and their operation result*/
	
	public static void printResult(Number[][]m1, Number[][]m2, Number[][]m3, char op) 
	{
		for (int i=0; i<m1.length; i++) {
			
			//Print first matrix
			for (int j=0; j<m1[0].length; j++)
				System.out.printf("%7s",m1[i][j]);
			
			
			//Print operator
			if(i == m1.length/2)
				System.out.printf(" " + op + " ");
			
			else
				System.out.print("   ");
			
			//Print second matrix
			for (int j=0; j< m2[0].length; j++) 
				System.out.printf("%7s", m2[i][j]);
			
			

			//print equal sign
			if(i == m1.length/2)
				System.out.print(" = ");
			
			else
				System.out.print("   ");
			
			//Print result matrix
			for (int j=0; j<m3[0].length; j++)
				System.out.printf( "%18s", m3[i][j]);
			
			System.out.println();
			
		}
	}
	
	
	

}
