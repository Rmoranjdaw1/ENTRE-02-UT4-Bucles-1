import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @Roberto Moran - 
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
          
        if(n %2 <= 0)
        {
            while(n >=0){
            while(n >= 7)
            {
                 return true;
                
            }
            }
        }else{
        return false;
        }
        return true;

    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        while(n != 0)
        {
        n = n / 10;
        int cifra = n% 10;
        }
        return 0;

    }

   
    
}
