package Conecta4;

import static Conecta4.Conecta4.*;

public class Tablero {
    public static void imprimirTablero() {
        System.out.println("\n0 1 2 3 4 5 6 ");
        for (int i = 0; i < files;i++){
            System.out.println("|");
            for (int j = 0; j < columnes;j++){
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------------");
    }

}
