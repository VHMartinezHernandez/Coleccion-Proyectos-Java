import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
       // Introducir valores a una matriz
       int renglones, columnas;
       var consola = new Scanner(System.in);
       // Definimos la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        int[][] matriz = new int[renglones][columnas];
        // Solicitar los valores
        for(int ren=0; ren < renglones; ren++){
            for(int col=0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // Sumar la diagonal de la matriz
        System.out.println();
        var sumaDiagonal = 0;
        for(int ren = 0; ren < renglones; ren++){
            for(int col=0; col < columnas; col++){
                if(ren == col){
                    sumaDiagonal += matriz[ren][col];
                }
            }
        }
        System.out.println("Suma Diagonal de la Matriz: " + sumaDiagonal);
    }

}
