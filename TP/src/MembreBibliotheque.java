public class MembreBibliotheque {
    private String prenom;
    private String nom;
    private int tel;
    private String adresse;
    private int numeroabonne;
    public static int dernierNumeroAbonne = 1;

    public MembreBibliotheque(String prenom, String nom, int tel, String adresse){
        int numeroabonne = dernierNumeroAbonne;
        this.prenom = prenom;
        this.nom = nom;
        this.tel = tel;
        this.adresse = adresse;
        this.numeroabonne = numeroabonne;
        dernierNumeroAbonne ++;
    }

    // Getters

    public String getPrenom(){
        return this.prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public int getTel(){
        return this.tel;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getNumeroabonne(){
        return this.numeroabonne;
    }

    // Setters

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setTel(int tel){
        this.tel = tel;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void setNumeroabonne(int numeroabonne){
        this.numeroabonne = numeroabonne;
    }

    public String toString(){
        return "Membre de la bibliotheque: " + this.prenom + " " + this.nom + " Numero de tel :" + this.tel + " Adresse :" + this.adresse + " Numero d'abonée :" + this.numeroabonne;
    }
}
