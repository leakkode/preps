package LeekCode.Medium;


// bad copy
public class SpiralMatrix {
        public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
            final int[][] matrix = new int[R*C][2];
            final int MAX_PIECES = R*C;
            int visitedPieces = 0;
            int rightMoves = 1;
            int leftMoves = 1;
            int downMoves = 1;
            int upMoves = 1;
            int r = r0;
            int c = c0;
            while (visitedPieces < MAX_PIECES) {

                while (rightMoves>0 && c < C-1) {
                    matrix[visitedPieces] = new int[]{r, c};
                    c++;
                    rightMoves--;
                    visitedPieces++;
                }
                if (c >= C) {
                    leftMoves++;
                }

                while (downMoves>0 && r < R-1) {
                    matrix[visitedPieces] = new int[]{r, c};
                    r++;
                    downMoves--;
                    visitedPieces++;
                }
                if (r >= R) {
                    upMoves++;
                }

                while (leftMoves>0 && c >= 0) {
                    matrix[visitedPieces] = new int[]{r, c};
                    c--;
                    leftMoves--;
                    visitedPieces++;
                }

                while (upMoves>0 && r >= 0) {
                    matrix[visitedPieces] = new int[]{r, c};
                    r--;
                    upMoves--;
                    visitedPieces++;
                }
            }
            return matrix;
        }
}
