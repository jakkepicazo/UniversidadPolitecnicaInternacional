package tarea1;

/**
 *
 * @author Jakke
 */
public class Tarea1 {

    public static void main(String[] args) {
        
        
        int[][] nums = new int[3][3];
        int cont = 1, sum = 0;

        for (int i = 0; i < 3; i++) { // filas
            for (int j = 0; j < nums[i].length; j++) { //columnas
                nums[i][j] = cont;
                cont++;
            }
        }//creando matriz

        for (int i = 0; i < nums.length; i++) { // filas
            for (int j = 0; j < nums[i].length; j++) { //columnas
                System.out.print(" " + nums[i][j]);
            }
            System.out.println(" ");
        } //imprimir datos matriz

        int diagonal1[] = new int[nums.length];
        int diagonal2[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) { // filas
            for (int j = 0; j < nums[i].length; j++) { //columnas
                if (i == j) {
                    diagonal1[i] = nums[i][j];
                }
                if (i + j == nums.length - 1) {
                    diagonal2[i] = nums[i][j];
                }
            }
        }//capturando diagonales

        System.out.println("Diagonal 1: ");
        for (int elemento : diagonal1) {
            System.out.print(" | " + elemento);
            sum += elemento;
        }
        System.out.print(" La suma de la diagonal #1 = " + sum); //imprimie diagonal 1

        System.out.println("\n Diagonal 2: ");
        for (int elemento : diagonal2) {
            System.out.print(" | " + elemento);
            sum += elemento;
        }
        System.out.print(" La suma de la diagonal #2 = " + sum); //imprimie diagonal 2
    }

}
