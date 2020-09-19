
import java.util.Random;
import java.util.Scanner;

public class exercice4 {

    // Fonction qui permet de créer un nombre aléatoire : 
        public static int creatNumber(){
            Random rd = new Random();
            int r = rd.nextInt(10);
            return(r);

        }
    //Question 1 :  Fonction question : 
        public static int question(){
        int m = creatNumber();
        int n = creatNumber();
        System.out.println("Les deux nombres créés sont  : " + m + " et " + n);
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez la réponse de la multiplication : ");
        int a = sc.nextInt();
        System.out.println("Vous avez donné l’entier "+ a);
        int cpt = 1;
        while (a != n * m) {
            cpt++;
            Scanner b = new Scanner(System.in);
            System.out.println("Veuillez saisir la bonne réponse");
            a = sc.nextInt();
        }
        System.out.println(" Le nombre de tentatives est " + cpt);
        return (cpt);
    }

    // Question 2 : Fonction évaluation :
    public static int evaluation(int n){
        int note = 0;
        for(int i=1;i<n;i++){
        int b = question();
        if(b!=1 && note>0){
            note =note-1;
        }else if(b==1){
            note++;
        }
    }
    if( note > 20){
        note=20;
    }
    System.out.println("Vous avez eu la note de "+ note + "/20");
    return(note);
}

    public static void main (String [] args){
        question();
        evaluation(2);
    }
           
}
