public class Informations {
    String nom;
    private int vitalite;
    private int force;
    private int agilite;

    // Constructeur 1 :

    Informations(int v, int f, int a){
                this.vitalite = v;
        this.force = f;
        this.agilite = a;
    }

    // Constructeur 2 : 

    Informations(Informations inf) {
        this(inf.vitalite, inf.force, inf.agilite);
    }

    // 3 Acesseurs / 3 Modificateurs :

    public int getVitalite() {
        return (this.vitalite);
    }

    public void setVitalite(int vitalitienew) {
        this.vitalite = vitalitienew;
    }

    public int getForce() {
        return (this.force);
    }

    public void setForce(int forcenew) {
        this.force = forcenew;
    }

    public int getAgilite() {
        return (this.agilite);
    }

    public void setAgilite(int agiliteenew) {
        this.agilite = agiliteenew;
    }

    // Méthode qui décrit un personnage en donnant son nom, sa force, son agilité et sa vitalitté :

    public String toString() {
        String s = "Le personne " + this.nom + ". Sa vitalité est de " + this.vitalite + " et sa force est :" + this.force
                + " et son agilité est : " + this.agilite);
                return(s);
    }

}
