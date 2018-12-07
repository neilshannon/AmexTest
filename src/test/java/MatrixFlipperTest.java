import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixFlipperTest {


    @Test
    public void testFlipDiagonals(){
        MatrixFlipper flipper = new MatrixFlipper();
        int[][] flipped = flipper.flipDiagonals(matrixFixture);
        assertArrayEquals(flippedFixture, flipped);
    }

    private int[][] matrixFixture = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
    };

    private int[][] flippedFixture = {
            {5, 2, 3, 4, 1},
            {1, 4, 3, 2, 5},
            {1, 2, 3, 4, 5},
            {1, 4, 3, 2, 5},
            {5, 2, 3, 4, 1}
    };


}
