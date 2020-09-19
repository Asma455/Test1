
import java.util.HashMap;
public class exercice3 {
    public static String shift(String a) {

        // Première méthode : En utilisant une HashMap : 
        HashMap<Character, Character> associateVoyelToNextVoyel = new HashMap<>();
        associateVoyelToNextVoyel.put('a', 'e');
        associateVoyelToNextVoyel.put('e', 'i');
        associateVoyelToNextVoyel.put('i', 'o');
        associateVoyelToNextVoyel.put('o', 'u');
        associateVoyelToNextVoyel.put('u', 'y');
        associateVoyelToNextVoyel.put('y', 'a');
        associateVoyelToNextVoyel.put('A', 'e');
        associateVoyelToNextVoyel.put('E', 'i');
        associateVoyelToNextVoyel.put('I', 'o');
        associateVoyelToNextVoyel.put('O', 'u');
        associateVoyelToNextVoyel.put('U', 'y');
        associateVoyelToNextVoyel.put('Y', 'a');
        String s = "";
        for(int i=0;i<a.length();i++){
            if(associateVoyelToNextVoyel.containsKey(a.charAt(i))){
                char lettre = associateVoyelToNextVoyel.get(a.charAt(i));
                s = s + lettre;
            }else{
                s = s+a.charAt(i);
            }
        }
        return(s);
    }
    // Deuxième méthode : Des conditions if :

        char[] tab = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            tab[i] = a.charAt(i);
        }
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] == 'a') {
                tab[j] = 'e';
                continue;
            }
            if (tab[j] == 'A') {
                tab[j] = 'E';
                continue;
            }
            
            if (tab[j] == 'e' ) {
                tab[j] = 'i';
                continue;
            }
            if (tab[j] == 'E') {
                tab[j] = 'I';
                continue;
            }
    
            if (tab[j] == 'i' ) {
                tab[j] = 'o';
                continue;
            }
            if (tab[j] == 'I') {
                tab[j] = 'O';
                continue;
            }
            if (tab[j] == 'o') {
                tab[j] = 'u';
                continue;
            }
            if (tab[j] == 'O') {
                tab[j] = 'U';
                continue;
            }
            if (tab[j] == 'u') {
                tab[j] = 'y';
                continue;
            }
            if (tab[j] == 'U') {
                tab[j] = 'Y';
                continue;
            }
            if (tab[j] == 'y') {
                tab[j] = 'a';
                continue;
            }
            if (tab[j] == 'Y') {
                tab[j] = 'A';
                continue;
            }
        }
        String chaine = "";
        for (int i = 0; i < tab.length; i++) {
            chaine = chaine + tab[i];
        }
        a = chaine;
        return (a);
    
}

    public static void main(String[] args) {
        String c = "Il fait beau aujourd'hui, j y vais !                                                                                        ";
        // System.out.println(shift(c));
        System.out.println(shift(c));
    }

}