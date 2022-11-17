import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int resultado = suma(2, 4, 6);
        
        System.out.println(resultado);
        
        coche micoche = new coche();
    
        micoche.sumarPuertas();
    
        System.out.println(micoche.puertas);
    }
    
    public static int suma(int a, int b, int c){
        
        return a + b + c;
        
    }
   
}

class coche{
    
    static int puertas = 4;
    
    public void sumarPuertas(){
        
        this.puertas++;
        
    
    }
}
    
