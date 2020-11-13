
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int base = 8;
        n1 = 0;
        n2 = 0;
        for(int i = 1;i <= n1 * (int)(base);n1++)
        {   
            if(base / n1 == 0)
            {
            base = i / n1; 
            int octal1 = base / n1;
            i++;
            } 
            for(int j = 1; j <= n2 * (int)(base); n2++){
            if(base / n2 == 0)
            {
                      base = i % n2; 
                      int octal2 = base % n2;
                      j++;
            }
            }
            switch(base)
            {
                        case 1: n1++;
                        break;
                        case 2: n2++;
                        break;
            }
            System.out.println("Octal" + base);
        }
        
        
        return base;

    }
    
    
}
