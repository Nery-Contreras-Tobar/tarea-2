
public class Multiplicacion {
   
    public class MultiplicacionMatrices {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int filMat1 = mat1.length;
        int colMat1 = mat1[0].length;
        int filMat2 = mat2.length;
        int colMat2 = mat2[0].length;
        int[][] matrizResultado = new int[filMat1][colMat2];
        if (colMat1 != filMat2) {
            System.out.println("No se pueden multiplicar las matrices");
            return;
        }
        for (int i = 0; i < filMat1; i++) {
            for (int j = 0; j < colMat2; j++) {
                for (int k = 0; k < colMat1; k++) {
                    matrizResultado[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("El resultado de la multiplicación de las matrices es:");
        for (int i = 0; i < filMat1; i++) {
            for (int j = 0; j < colMat2; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
}
