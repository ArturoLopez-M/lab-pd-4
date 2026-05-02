package Maindemo;

import Domain.AdaptadorPavo;
import Domain.Pato;
import Domain.PatoReal;
import Domain.PavoSilvestre;

public class PatoAdaptadorDemo {
    public static void main(String[] args) {
        System.out.println("Pato");
        PatoReal        patoReal        = new PatoReal();
        PavoSilvestre   pavoSilvestre   = new PavoSilvestre();
        AdaptadorPavo   adaptadorPavo   = new AdaptadorPavo(pavoSilvestre);

        patoReal.cuaquear();
        adaptadorPavo.cuaquear();
        
        System.out.println("\nEl pavo hace...");
        pavoSilvestre.gluglutear();
        pavoSilvestre.volar();
        
        System.out.println("\nEl Pato hace...");
        testPato(patoReal);
        
        System.out.println("\nEl AdaptadorPavo hace...");
        testPato(adaptadorPavo);
        }
    static void testPato(Pato pato){
        pato.cuaquear();
        pato.volar();
        
    }
    
}
