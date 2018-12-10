/**
 * Used to flip the values of diagonals in an NxN matrix
 */
public class MatrixFlipper {

    /**
     * Flips the diagonals of an NxN matrix of integers
     * @param matrix a 2d array of equal degree (a square or NxN)
     * @return the matrix with the diagonals flipped in place
     */
    public int[][] flipDiagonals(int[][] matrix) {
        int[] firstRow = matrix[0];
        int matrixWidth = firstRow.length;

        for(int xCoordinate = 0; xCoordinate < matrixWidth; xCoordinate++){
            int leftDiagonal = matrix[xCoordinate][xCoordinate];
            int yCoordinate = matrixWidth - xCoordinate - 1;
            int rightDiagonal = matrix[xCoordinate][yCoordinate];

            matrix[xCoordinate][xCoordinate] = rightDiagonal;
            matrix[xCoordinate][yCoordinate] = leftDiagonal;
        }

        return matrix;
    }

}
