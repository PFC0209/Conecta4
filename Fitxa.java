package Conecta4;

import static Conecta4.Conecta4.*;

public class Fitxa {
    public  boolean Colocarfitxa(int columna, char jugador){
        for (int i = files - 1; i >=0 ; i--){
            if (tablero[i][columna] == buit){
                tablero[i][columna] = jugador;
                return true;
            }
        }
        return false;
    }
}
