import java.util.ArrayList;
public class GestionReservation {
    private ArrayList<Salle> salles= new ArrayList<>();
    private ArrayList<Utilisateur> utilisateurs= new ArrayList<>();
    private ArrayList<Reservation> reservations= new ArrayList<>();
    public void ajouterSalle(Salle s){
        salles.add(s);
    }
    public void afficherSalle(){
        for(Salle s:salles){
            System.out.println(s.toString());
        }
    }
    public void ajouterUtilisateur(Utilisateur u){
        utilisateurs.add(u);
    }
    public void affichUtilisateur(){
        for(Utilisateur u:utilisateurs){
            System.out.println(u.toString());
        }
    }
    public void ajouterReservation(Reservation r){
        reservations.add(r);
    }
    public void affichReservation(){
        for(Reservation r:reservations){
            System.out.println(r.toString());
        }
    }
}
