import java.util.ArrayList;
/**
 * Un théâtre
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class Theatre {
    private ArrayList <Row> rows;
    public Theatre(ArrayList<Row> rows){
        this.rows=rows;
    }
    public int nbDePlaces(){
        int nb=0;
        for (Row row : this.rows){
            nb=nb+row.getLargeur();
        }
        return nb;
    }
    public static Theatre getTheatre (int nbRang, int largeur){  // fabrication d'un théatre de nbRang rangées de chacune largeur sièges
        ArrayList<Row> rows = new ArrayList<Row>();
	    for (int rang=0;rang<=nbRang-1;rang++){  // boucle sur les rangées
	        Row row = new Row(rang);    // création de la rangée
	        for (int numero=0;numero <=largeur-1;numero++){  // boucle sur les sièges
	           row.addSeat(new Seat(numero,rang));   // ajout du siège à la rangée
	        }
	        rows.add(row);   // ajout de la rangée à la liste des rangées
	    }
	    Theatre theatre = new Theatre(rows);   // création du théatre
	    return theatre;
    }
}