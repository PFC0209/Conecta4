package Conecta4;

import static Conecta4.Conecta4.*;

public class Win {
    public boolean HihaGuanyador(char jugador){
        //Comporovació horitzontal
        for(int i = 0; i < files; i++){
            for(int j = 0; j <= columnes - 4; j++){
                if(tablero[i][j] == jugador && tablero[i][j+1] == jugador && tablero[i][j+2] == jugador && tablero[i][j+3] == jugador){
                    return true;
                }
            }
        }
        //Comprovació vertical

        for(int i = 0; i <= files -4; i++){
            for(int j = 0; j < columnes; j++){
                if(tablero[i][j] == jugador && tablero[i+1][j] == jugador && tablero[i+2][j] == jugador && tablero[i+3][j] == jugador){
                    return true;
                }
            }
        }
        //Comprovació diagonal

        for(int i = 3; i < files; i++){
            for(int j = 0; j <= columnes - 4; j++){
                if (tablero[i][j] == jugador && tablero[i-1][j+1] == jugador && tablero[i-2][j+2] == jugador && tablero[i-3][j+3] == jugador){
                    return true;
                }
            }
        }
        return false;
    }
}
