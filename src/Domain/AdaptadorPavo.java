package Domain;

public class AdaptadorPavo implements Pato{
   private final Pavo pavo;

    public AdaptadorPavo(Pavo pavo) {
        this.pavo = pavo;
    }

   
    @Override
    public void cuaquear() {
        pavo.gluglutear();
    }

    @Override
    public void volar() {
        pavo.volar();
    }
    
}
