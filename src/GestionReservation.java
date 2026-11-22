import java.util.ArrayList;
public class GestionReservation {
    private ArrayList<Salle> salles= new ArrayList<>();
    private ArrayList<Utilisateur> utilisateurs= new ArrayList<>();
    private ArrayList<Reservation> reservations= new ArrayList<>();
    public void ajouterSalle(Salle s){
        for(Salle salle:salles){
          if(s.getNom().equalsIgnoreCase(salle.getNom())){
              throw new IllegalArgumentException("Une salle avec ce nom existe déjà");
            }
        }
            salles.add(s);
    }
    public void afficherSalle(){
        for(Salle s:salles){
            System.out.println(s.toString());
        }
    }
    public void ajouterUtilisateur(Utilisateur u){
        for(Utilisateur utilisateur:utilisateurs){
        if(u.getNom().equalsIgnoreCase(u.getNom())){
            throw new IllegalArgumentException("utilisateur avec ce nom existe déjà");
        }
    }
        utilisateurs.add(u);
    }
    public void afficherUtilisateur(){
        for(Utilisateur u:utilisateurs){
            System.out.println(u.toString());
        }
    }
    public void ajouterReservation(Reservation r)throws ConflitReservationException{
        for(Reservation reservation:reservations){
           if(reservation.chevauche( r)){
               throw new ConflitReservationException("Conflit : la salle " + r.getSalle().getNom() + " est déjà réservée le "
                       + r.getDate() + " de " + reservation.getHeureDebut() + " à " + reservation.getHeureFin() + ".");
           }
        }
        reservations.add(r);
    }
    public void afficherReservation(){
        for(Reservation r:reservations){
            System.out.println(r.toString());
        }
    }
    public Salle trouverSalle(int id){
        for(Salle s:salles) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
    public Utilisateur trouverUtilisateur(int id){
        for(Utilisateur u:utilisateurs) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
    public Reservation trouverReservation(int id){
        for(Reservation r:reservations) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }
}
