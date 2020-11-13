
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        for(int i= 0;i <= ANCHO_BLOQUE;i++){
            for(int j = 1;j == (int)(altura);j++){
                for(int k = 1;k <= CAR1; k++){
                    System.out.println("%t" + CAR1);
                for(int l = 1;l <= CAR2; k++){
                System.out.println("%t" + CAR2);
                }
                }
                if(altura <= altura / i)
                {
                    altura++;
                    
                }
            }
            System.out.println("%t" + ESPACIO);
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        int i = 1; 
        while(i <= (int)(n)){
            caracter = CAR1 + CAR2;
            n++;
            
        }

    }
}
