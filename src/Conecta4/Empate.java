package Conecta4;

import static Conecta4.Conecta4.*;

public class Empate {
    public boolean esEmpate(){
        for (int j = 0; j < columnes; j++){
            if (tablero[0][j] == buit){
                return false;
            }
        }
        return true;
    }
}
