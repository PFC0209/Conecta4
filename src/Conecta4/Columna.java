package Conecta4;

import java.util.Scanner;

import static Conecta4.Conecta4.*;

public class Columna {
    public int demanaColumna(Scanner scanner, char jugador){
        int columna;

        do{
            System.out.print("Jugador: " + jugador +",tria una columna (1-7): ");
            while (!scanner.hasNextInt()){
                System.out.println("Per favor escriu un numero.");
                scanner.next();
            }
            columna = scanner.nextInt();
        }while (columna < 0 || columna >= columnes || tablero[0][columna] != buit);
        return columna;
    }
}
