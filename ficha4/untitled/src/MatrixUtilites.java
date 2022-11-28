public class MatrixUtilites {
    public static void show(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int e = 0; e < mat[i].length; e++) {
                System.out.print(mat[e][i] + " ");
            }
            System.out.println("");

        }
    }

    public static boolean isMatrix(int mat[][]) {
        int size = mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length!=size){
                return false;
            }

        }
        return true;
    }

    public static boolean isIdenty(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int e = 0; e < mat[i].length; e++) {
                if (i == e && mat[i][e] != 1) {
                    return false;
                } else if (i != e && mat[i][e] != 0) {
                    return false;

                }
            }
        }
        return true;
    }
    public static int[][] multiplyBy(int[][] mat, int multiplier) {
        int [][] result= new int [mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int e = 0; e < mat[i].length; e++) {
                    result[i][e] = mat[i][e] * multiplier;
                }
            }
        return result;
    }

    public static boolean areCompatibleForSum(int[][] mat, int[][] mat1) {
        if (mat.length != mat1.length)
            return false;
        else
            for (int i = 0; i <mat.length; i++){
                if (mat[i].length != mat1[i].length)
                    return false;
            }
            return true;
    }

    public static int[][] sumOf(int[][] mat, int[][] mat1) {
        if (areCompatibleForSum(mat,mat1)){
            int [][] result= new int [mat.length][mat[0].length];
            for (int i = 0; i < mat.length; i++){
                for (int j = 0; j < mat[i].length; j++){
                    result[i][j] = mat[i][j] + mat1[i][j];
                }
            }
            return result;
        }
        else
            return null;
    }
}