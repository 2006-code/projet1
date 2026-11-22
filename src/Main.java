import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args){
        Salle s1= new Salle("spa",50);
        Salle s2= new Salle("coiffure",40);
        s1.setCapacite(20);
        System.out.println(s1);
        Utilisateur u=new Utilisateur("Sara","SARA@gmail.com",Role.UTILISATEUR);
        System.out.println(u);
        Reservation r1=new Reservation(s1,u, LocalDate.of(2026,11,16),LocalTime.of(9,0),LocalTime.of(11,0));
        Reservation r2=new Reservation(s1,u, LocalDate.of(2026,11,16),LocalTime.of(8,0),LocalTime.of(10,0));
        Reservation r3=new Reservation(s2,u, LocalDate.of(2026,11,16),LocalTime.of(11,0),LocalTime.of(13,0));
        System.out.println(r1);
        System.out.println(r1.chevauche(r2));
        System.out.println(r1.chevauche(r3));
        GestionReservation g=new GestionReservation();
        g.ajouterSalle(s1);
        g.ajouterSalle(s2);
        g.afficherSalle();
        g.ajouterUtilisateur(u);
        g.afficherUtilisateur();
        LocalDate demain = LocalDate.now().plusDays(1);
        try {
            g.ajouterReservation(new Reservation( s1, u, demain,
                    LocalTime.of(10, 0), LocalTime.of(12, 0)));
            System.out.println("Réservation 1 acceptée");

            g.ajouterReservation(new Reservation( s1, u, demain,
                    LocalTime.of(11, 0), LocalTime.of(13, 0)));
            System.out.println("Réservation 2 acceptée");
        } catch (ConflitReservationException e) {
            System.out.println(e.getMessage());
        }
        g.afficherReservation();
        System.out.println(g.trouverSalle(2));
        System.out.println(g.trouverSalle(4));
        System.out.println(g.trouverUtilisateur(2));
        System.out.println(g.trouverReservation(3));
    }
}
