public class exercice2 {


    // Une fonction qui affiche le contenu d'un tableau : 
    public static void affiche(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i != tab.length - 1) {
                System.out.print(",");
            } else {
                System.out.println("");
            }
        }
    }
    // Une fonction qui calcule la taille maximale de deux tableaux :

    public static int maximum(int t1[], int t2[]) {
        int max = 0;
        if (t1.length >= t2.length) {
            max = t1.length;
        } else {
            max = t2.length;
        }
        return (max);
    }

    // Une fonction qui calcule la taille minimale de deux tableaux :

    public static int minimum(int t1[], int t2[]) {
        int min = 0;
        if (t1.length <= t2.length) {
            min = t1.length;
        } else {
            min = t2.length;
        }
        return (min);
    }


    // Fonction multiplication : qui retourne un tableau t3 obtenu en multipliant t1*t2 case par case: 
    public static int[] multiplication(int t1[], int t2[]) {
        int taille = maximum(t1, t2);
        int[] t3 = new int[taille];
        if (t2.length == t1.length) {
            for (int i = 0; i < t1.length; i++) {
                t3[i] = t1[i] * t2[i];
            }
        } else if (t1.length != t2.length) {
            for (int i = 0; i < minimum(t1, t2); i++) {
                t3[i] = t1[i] * t2[i];
            }
            for (int j = minimum(t1, t2); j < maximum(t1, t2); j++) {
                if (t1.length >= t2.length) {
                    t3[j] = t1[j];
                } else {
                    t3[j] = t2[j];
                }
            }
        }
        return (t3);

    }

   // Fonction split 

    public static int[] split(int t[]) {
        int cmpt = 0;
        String chaine = "";
        for (int i = 0; i < t.length; i++) {
            chaine = chaine + String.valueOf(t[i]);
        }
        int[] tableau = new int[chaine.length()];
        // t = (12,24) ---> t=(1,2,2,4);
        for (int i = 0; i < t.length; i++) {
            String m = String.valueOf(t[i]); // 12 ---> "12"
            for (int j = 0; j < m.length(); j++) { // De 0 à 2
                char b = m.charAt(j); // à l'indice 0 : 1 / Indice 1 on a 2
                tableau[cmpt] = Character.getNumericValue(b); //
                cmpt++;
            }

        }
        return (tableau);
    }
    

    public static void main(String[] args) {
        // Test de la fonction affichage :
        int[] t1 = { 1, 3, 6, 7 };
        int[] t2 = { 2, 4, 6 };
        affiche(multiplication(t1, t2));
        // Test de la fonction split :
        int[] t3 = { 2, 12, 36, 7 };
        affiche(split(t3));
    }

}