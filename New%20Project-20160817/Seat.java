/**
 * Un siège de théâtre
 */
public class Seat {
    private int numero;
    private int rang;
    private boolean free;
    public Seat (int numero, int rang){
        this.numero=numero;
        this.rang=rang;
        this.setFree();
    }
    public void setBooked() {
        this.free=false;
    }
    public void setFree() {
        this.free=true;
    }
}