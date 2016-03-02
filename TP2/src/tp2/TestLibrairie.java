package tp2;
import java.util.Scanner;

public class TestLibrairie {
    
    static DocLibrairie doc1 = new DocLibrairie("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc"),
                 doc2 = new DocLibrairie("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin");
    private static Scanner input;
    private static String titreDoc;
    
    public static void main(String[] args)
    {
       /* System.out.println("Le titre du doc 1 est " + doc1.getTitre() );
        System.out.println("L'auteur principal du doc 1 est " + doc1.getAuteurPrincipal());
        
        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );
        
        System.out.println("Le code d'archivage du doc 1 est " + doc1.getCodeArchivage() );
        
        doc1.setAnnee(3000);

        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );*/
        
        System.out.println("1. Afficher des informations sur un document");
        System.out.println("2. Connaître l’état d’un document");
        System.out.println("3. Changer l’état d’un document");
        System.out.println("4. Faire une réservation");
        System.out.println("5. Annuler une réservation");
        System.out.println("6. Afficher le nombre de documents empruntés");
        System.out.println("7. Afficher le nombre de documents sur la pile des retours");
        System.out.println("8. Afficher le nombre de documents dans la section réservations\n\n");
        
        input = new Scanner(System.in);
        
        switch(input.nextInt())
        {
            
            case 1 : 
                System.out.println("Entrer le titre du document");
                titreDoc = input.nextLine();
                titreDoc = input.nextLine();
                
                break;
            case 2:
                break;
                
            case 3:
                break;
                
                
            case 4:
                break;
                
            case 5:
                break;
                                
            case 6:
                break;
            
            case 7:
                break;
                
            case 8:
                break;
                
            default:
                
                System.out.println("Le chiffre entré n'est pas valide");    //Faire un truc qui redemarre
                
               break;
            
            
            
            
            
            
            
            
        }
        
    }
    
    
}
