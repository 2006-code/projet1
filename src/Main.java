import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args){
        Salle s= new Salle("spa",50);
        s.setCapacite(20);
        System.out.println(s);
        Utilisateur u=new Utilisateur("Sara","SARA@gmail.com",Role.UTILISATEUR);
        System.out.println(u);
        Reservation r1=new Reservation(s,u, LocalDate.of(2026,11,16),LocalTime.of(9,0),LocalTime.of(11,0));
        Reservation r2=new Reservation(s,u, LocalDate.of(2026,11,16),LocalTime.of(8,0),LocalTime.of(10,0));
        Reservation r3=new Reservation(s,u, LocalDate.of(2026,11,16),LocalTime.of(11,0),LocalTime.of(13,0));
        System.out.println(r1);
        System.out.println(r1.chevauche(r2));
        System.out.println(r1.chevauche(r3));
        GestionReservation g=new GestionReservation();
        g.ajouterSalle(s);
        g.afficherSalle();
        g.ajouterUtilisateur(u);
        g.afficherUtilisateur();
        g.ajouterReservation(r1);
        g.ajouterReservation(r2);
        g.afficherReservation();
    }
}
