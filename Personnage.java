public class Personnage {
    private int vitaliteActuelle;
    private int forceActuelle;
    private int agiliteActuelle;

    Personnage(int vitaliteActuelle, int forceActuelle, int agiliteActuelle) {
        this.vitaliteActuelle = vitaliteActuelle;
        this.forceActuelle = forceActuelle;
        this.agiliteActuelle = agiliteActuelle;
    }

    public String toString() {
        String s ="Le personne " + this.informations.nom + ". Sa vitalité est de " + this.vitaliteActuelle + " et sa force est :" + this.forceACtuelle
                + " et son agilité est : " + this.agiliteActuelle);
                return(s);
    }

    public boolean estVivant(){
        if(this.vitaliteActuelle>0){
            return(true);
        }
        return(false);
    }

    public void rebirth(){
        this.vitaliteActuelle=Informations
            




    }


}
