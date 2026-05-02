package Domain;

public class SuperDrone implements Drone{

    @Override
    public void beep() {
        System.out.println("Beep Beep");
    }

    @Override
    public void girarmotor() {
        System.out.println("Rotor girando");
    }

    @Override
    public void despegar() {
        System.out.println("Drone despegando");
    }
    
    
}
