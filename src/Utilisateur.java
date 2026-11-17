public class Utilisateur {
    private static int prochainId=1;
    private final int id;
    private String nom;
    private String email;
    private Role role;
    Utilisateur(String nom, String email,Role role){
        this.id=prochainId++;
        this.nom=nom;
        setEmail(email);//pour qu il soit traiter avant de le confirmer
        this.role=role;
    }
    public int getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getEmail(){
        return email;
    }
    public Role getRole(){
        return role;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setEmail(String email){
        if(email==null || !email.contains("@")){
            throw new IllegalArgumentException("Email invalide: "+email);
        }
        this.email=email;
    }
    public void setRole(Role role){
        this.role=role;
    }
    @Override
    public String toString(){
        return id+" -" +nom+" -"+ email+ " -["+role+"]";
    }
}
