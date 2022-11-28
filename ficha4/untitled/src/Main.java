public class Main {
    public static void main(String[] args) {
        int [][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int [][] mat1 = {
                {3,0,0},
                {0,1,0},
                {0,0,1}
        };
        int multiplier = 2;
        MatrixUtilites.show(mat);
        boolean ismatrix = MatrixUtilites.isMatrix(mat);
        System.out.println(ismatrix);
        boolean isidenty = MatrixUtilites.isIdenty(mat);
        System.out.println(isidenty);
        int [][] multiplicador = MatrixUtilites.multiplyBy(mat,multiplier);
        MatrixUtilites.show(multiplicador);
        boolean areCompatibleForSum = MatrixUtilites.areCompatibleForSum(mat,mat1);
        System.out.println(areCompatibleForSum);
        int [][] sumOf = MatrixUtilites.sumOf(mat,mat1);
        MatrixUtilites.show(sumOf);
        //CharacterDrawingUtilities.drawElement('+');
        //CharacterDrawingUtilities.drawNewLine();
        //CharacterDrawingUtilities.drawHorizontalSegmentWith('+',10);
        //CharacterDrawingUtilities.drawFilledRectangleWith('*', 10, 5);
        CharacterDrawingUtilities.drawEmptyRectangleWith('+',5,5);
        //CharacterDrawingUtilities.drawEmptyRectangleWith1('+',5,5);
    }

}