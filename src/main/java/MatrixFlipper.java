/**
 * Used to flip the values of diagonals in an NxN matrix
 */
public class MatrixFlipper {

    /**
     * Flips the diagonals of an NxN matrix of integers
     * @param matrix a 2d array of equal degree (a square)
     * @return the matrix with the diagonals flipped in place
     */
    public int[][] flipDiagonals(int[][] matrix) {
        for(int x = 0; x < matrix[0].length; x++){
            int leftDiagonal = matrix[x][x];
            int rightDiagonal = matrix[x][matrix[0].length - x - 1];
            matrix[x][x] = rightDiagonal;
            matrix[x][matrix[0].length - x - 1] = leftDiagonal;
        }
        return matrix;
    }

}
