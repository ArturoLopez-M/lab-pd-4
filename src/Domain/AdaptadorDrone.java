package Domain;

public class AdaptadorDrone implements Pato{
    private final Drone drone;

    public AdaptadorDrone(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void cuaquear() {
        drone.beep();
    }

    @Override
    public void volar() {
        drone.girarmotor();
        drone.despegar();
    }
    
}
