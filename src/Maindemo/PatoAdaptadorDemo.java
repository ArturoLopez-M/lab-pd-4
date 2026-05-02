package Maindemo;

import Domain.AdaptadorDrone;
import Domain.AdaptadorPavo;
import Domain.Pato;
import Domain.PatoReal;
import Domain.PavoSilvestre;
import Domain.SuperDrone;

public class PatoAdaptadorDemo {
    public static void main(String[] args) {
        System.out.println("Pato");
        PatoReal        patoReal        = new PatoReal();
        PavoSilvestre   pavoSilvestre   = new PavoSilvestre();
        AdaptadorPavo   adaptadorPavo   = new AdaptadorPavo(pavoSilvestre);
        SuperDrone      superDrone      = new SuperDrone();
        AdaptadorDrone  adaptadorDrone  = new AdaptadorDrone(superDrone);
        
        patoReal.cuaquear();
        adaptadorPavo.cuaquear();
        adaptadorDrone.cuaquear();
        
        System.out.println("\nEl pavo hace...");
        pavoSilvestre.gluglutear();
        pavoSilvestre.volar();
        
        System.out.println("\nEl Pato hace...");
        testPato(patoReal);
        
        System.out.println("\nEl Drone hace...");
        superDrone.beep();
        superDrone.girarmotor();
        superDrone.despegar();
        
        System.out.println("\nEl AdaptadorPavo hace...");
        testPato(adaptadorPavo);
        
        System.out.println("\nEl AdaptadorDrone hace...");
        testPato(adaptadorDrone);
        }
    static void testPato(Pato pato){
        pato.cuaquear();
        pato.volar();
        
    }
    
}
