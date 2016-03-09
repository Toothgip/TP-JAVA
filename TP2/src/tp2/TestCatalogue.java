/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author p1501257
 */
public class TestCatalogue {
    
    private static CatalogueLibrairie docs = new CatalogueLibrairie();
    private static Scanner input;
    private static int choix;
    private static boolean quitter = false;
    private static DocLibrairie doc1 = new DocLibrairie("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc"),
                 doc2 = new DocLibrairie("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin");
    
    public static void main(String[] args)
   {
       docs.add(doc1);
       docs.add(doc2);
       
       while(quitter == false)
       {
            System.out.println("\n1. Afficher des informations sur les documents");
            System.out.println("2. Afficher les informations d'un document");
            System.out.println("3. Ajouter un document");
            System.out.println("4. Supprimer un document");
            System.out.println("5. Empruter un document");
            System.out.println("6. Faire une réservation");
            System.out.println("7. Annuler une réservation");
            System.out.println("8. Retourner un livre");

           input = new Scanner(System.in);
           switch(input.nextInt())
           {
               case 1:
                   docs.affiche();
                   break;
               case 2: 
                   TestCatalogue.afficheDoc();
                   System.out.println(docs.get(choix).toString());
                   break;
               case 3:
                   TestCatalogue.afficheDoc();
                   if (choix == 1)
                   {
                       docs.add(doc1);
                   }
                   else
                   {
                       docs.add(doc2);
                   }
                 break;
               case 4:
                   TestCatalogue.afficheDoc();
                   if (choix == 1)
                   {
                       docs.remove(doc1);
                   }
                   else
                   {
                       docs.remove(doc2);
                   }
                   break;
               case 5:
                   quitter = true;
                   break;
               case 6:
                   TestCatalogue.afficheDoc();

                    docs.remove(doc1);
              
                   
                   
                   break;
                   
               default:
                 System.out.println("Le chiffre entré n'est pas valide");    //Faire un truc qui redemarre
                   break;  
            }
          
       }
   }
    
    
   private static void afficheDoc()
    {
        System.out.println("Entrez le numero du document");
        
        System.out.println("1. " + docs.get(1).getTitre() + " " + docs.get(1).getAuteurPrincipal());
        System.out.println("2. " + docs.get(2).getTitre() + " " + docs.get(2).getAuteurPrincipal());
        choix = input.nextInt();
    }
    
}
