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
    private static int choix, choixMembre;
    private static boolean quitter = false;
    private static DocLibrairie doc1 = new DocLibrairie("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc"),
                 doc2 = new DocLibrairie("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin");
    
    private static ListeMembres membres = new ListeMembres();
    
    public static void main(String[] args)
   {
       docs.add(doc1);
       docs.add(doc2);
       
       membres.add(new MembreLibrairie("Pitrac", "Avenue Albert Einstein", "0822462246", 10));
       membres.add(new MembreLibrairie("Zlatan","Rue Dunais","0687956412",11));
               
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
            System.out.println("9.Quitter");

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

                    docs.add(docs.get(choix-1));

                 break;
               case 4:
                   TestCatalogue.afficheDoc();

                   docs.remove(docs.get(choix-1));

                   break;
               case 5:
                   TestCatalogue.afficheDoc();
                   TestCatalogue.afficheMembre();
                   
                   docs.emprunter(membres.get(choixMembre), choix -1);                 
                   break;
               case 6:
                   TestCatalogue.afficheDoc();
                   TestCatalogue.afficheMembre();
                   
                    docs.reservation(membres.get(choixMembre), choix-1);
                   
                    break;
               case 7:
                   TestCatalogue.afficheDoc();
                   TestCatalogue.afficheMembre();
                                      
                    docs.annulReservation(membres.get(choixMembre), choix-1);
                    
                    break;
               case 8:
                   TestCatalogue.afficheDoc();
                   
                   docs.retour(choix-1);
                   break;
               case 9:
                   quitter = true;
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
        int i = 0;
        while (i < docs.size() )
        {
            System.out.println(i+1 + ". " + docs.get(i).getTitre() + " " + 
                    docs.get(i).getAuteurPrincipal());
            i++;
        }
        
        //System.out.println("2. " + docs.get(1).getTitre() + " " + docs.get(1).getAuteurPrincipal());
        choix = input.nextInt();
    }
   
   
    private static void afficheMembre()
    {
        System.out.println("Entrez le membre");
        
        System.out.println("1. " + membres.get(10).getNom()+ " Code abo: " + membres.get(10).getNumAbo());
        System.out.println("2. " + membres.get(11).getNom() + " Code abo: " + membres.get(11).getNumAbo());
      //  choixMembre = input.nextInt();
        if(input.nextInt() == 1)
        {
            choixMembre = membres.get(10).getNumAbo();
        }
        else if(input.nextInt() == 2)
        {
            choixMembre = membres.get(11).getNumAbo();
        }
    }
    
}
