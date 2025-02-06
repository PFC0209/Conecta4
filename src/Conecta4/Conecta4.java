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

        while(!jocFinalitzat){
            Tablero.imprimirTablero();
            int columna = Columna.demanaColumna(sc, juagorActual);
            Fitxa.Colocarfitxa(columna, juagorActual);

            if (Win.HihaGuanyador(juagorActual)){
                Tablero.imprimirTablero();
                System.out.println("Jugador " +juagorActual + " ha guanyat!");
                jocFinalitzat = true;
            } else if (Empate.esEmpate()) {
                Tablero.imprimirTablero();
                System.out.println("És un Empate!");
            }else{
                juagorActual = (juagorActual == jugador1) ? jugador2 : jugador1;
            }
        }
        sc.close();
    }
    public static void main(String [] args){
        Conecta4 conecta4 = new Conecta4();
        conecta4.jugar();
    }
}