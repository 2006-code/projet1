public class Salle {
    private static int prochainId=1;
    private final int id;
    private String nom;
    private int capacite;
    Salle(String nom, int capacite){
        this.id=prochainId++;
        this.nom=nom;
        setCapacite(capacite);
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public int getCapacite(){
        return capacite;
    }
    public void setNom(String nom){
       this.nom=nom;
    }
    public void setCapacite(int capacite){
        if (capacite<=0){
            throw new IllegalArgumentException("Capacité Invalide");
        }
        this.capacite=capacite;
    }
    @Override
    public String toString(){
        return id+" - "+nom+" - "+capacite;
    }
}
