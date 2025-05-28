import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner f = new Scanner(System.in);

        double principale;
        double taux;
        int tempsCompouded;
        int annes;
        double montante;

        System.out.print("Entrez le montant principal :");
        principale = f.nextDouble();

        System.out.print("Entrez le taux d'intérêt (en %) :");
        taux = f.nextDouble() /100 ;

        System.out.println("Entrez le # de fois composé par an :");
        tempsCompouded = f.nextInt();

        System.out.print("Entrez le # d'années :");
        annes = f.nextInt();

        montante = principale * Math.pow(1 + taux /tempsCompouded , tempsCompouded * annes);

        System.out.printf("Le montant après %d annes est $%.2f ",annes,montante );
        
        f.close();



    }

}