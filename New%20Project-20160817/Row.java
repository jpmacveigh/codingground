import java.util.ArrayList;
/**
 * Une rangée de sièges d'un théâtre
*/
public class Row { 
    private int row;
    private ArrayList<Seat> seats = new ArrayList<Seat>();
    public Row (int row){
        this.row=row;
    }
    public int getLargeur(){
        return this.seats.size();
    }
    public void addSeat (Seat seat){
        this.seats.add(seat);
    }
}