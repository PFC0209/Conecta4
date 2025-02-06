package Conecta4;
import java.util.Scanner;
public class Conecta4{
    public static final int files = 6;
    public static final int columnes = 7;
    public static final char buit = ' ';
    public static final char jugador1 = 'X';
    public static final char jugador2 = 'O';

    //tablero
    public static char [][] tablero;


    public Conecta4(){
        tablero = new char[files][columnes];
        for(int i = 0; i < files; i++){
            for(int j = 0; j < columnes; j++){
                tablero[i][j] = buit;
            }
        }
    }

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        char juagorActual = jugador1;
        boolean jocFinalitzat = false;
    }
}