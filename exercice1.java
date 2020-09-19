public class exercice1 {
    // Question 1:
    // Type d'entrée de la fonction main est :
    // Type de sortie de la fonction main est : int

    // Question 2 : 
    public static int a (String [] args){
        return(args.length);
        
    }


    // Question 3 : 
    // Méthode int length ();


    // Question 4 : 
    // 1/- La méthode hypot appartient à la classe Math 
    // Programme qui l'utilise est :
    public static double  distance (int x,int y){
        return(Math.hypot(x,y));
    }
    public static void  main(String [] args){
        System.out.println(distance(3,4));
    }
    
}
