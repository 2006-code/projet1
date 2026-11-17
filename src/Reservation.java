import java.time.LocalDate;
import java.time.LocalTime;
public class Reservation {
    private static int prochainId=1;
    private final int id;
    private Salle salle;
    private Utilisateur utilisateur;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    Reservation(Salle salle, Utilisateur utilisateur, LocalDate date, LocalTime heureDebut, LocalTime heureFin){
        if(salle==null || utilisateur==null || date==null){
            throw new IllegalArgumentException("Salle, utilisateur et date sont obligatoires.");
        }
        verifierHoraires(heureDebut,heureFin);
        this.id=prochainId++;
        this.salle=salle;
        this.utilisateur=utilisateur;
        this.date=date;
        this.heureDebut=heureDebut;
        this.heureFin=heureFin;
    }
    public void verifierHoraires(LocalTime heureDebut, LocalTime heureFin){
        if(heureDebut==null || heureFin==null || !heureFin.isAfter(heureDebut)){
          throw new IllegalArgumentException("L'heure de fin doit etre après l'heure de début.");
        }
    }
    public int getId(){
        return id;
    }
    public Salle getSalle(){
        return salle;
    }
    public Utilisateur getUtilisateur(){
        return utilisateur;
    }
    public LocalDate getDate(){
        return date;
    }
    public LocalTime getHeureDebut(){
        return heureDebut;
    }
    public LocalTime getHeureFin(){
        return heureFin;
    }

    public void setHoraires(LocalTime debut, LocalTime fin){
        verifierHoraires(debut,fin);
        this.heureDebut=debut;
        this.heureFin=fin;
    }
    public boolean chevauche(Reservation autre){ // retourne vrai si les deux reservations vont se croiser
        return salle.getId()==autre.salle.getId() && date.equals(autre.date) &&
                heureDebut.isBefore(autre.heureFin) && autre.heureDebut.isBefore(heureFin);
    }
    @Override
    public String toString(){
        return "Réservation "+id+" à "+salle.getNom()+" pour "+utilisateur.getNom()+" le "+date+" de "+heureDebut+" à "+heureFin;
    }
}
