/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.Scanner;

/**
 *
 * @author p1501257
 */
public class TestCatalogueLibrairie {
    private static CatalogueLibrairie docs = new CatalogueLibrairie();
    private static Scanner input;
    private static int choix, choixMembre;
    private static boolean quitter = false;
   
    private static Livre livre1 = new Livre("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc","PitracCorp","044524-454-5",12),
                 livre2 = new Livre("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin","Hachette","005464578",42);
    private static DocURL url1 = new DocURL("045640 450687", 2007, "PitracLeDieu",
          "Pitrac","www.pitracDieu.com","La vie résumée du Dieu Pitrac.");
    private static CD cd1 = new CD ("045646548 45FDGP",15, 2012, "Kinedaire",
          "Cortex","1.Es Muy Bueno\n2.El Country\n3.La Surpreza\n4.The Egg");
    
    private static DocLibrairiePhysique docPhy= new DocLibrairiePhysique("", 0, 0, 
            "", "");
    
    
    private static ListeMembres membres = new ListeMembres();
    
    public static void main(String[] args)
   {
       docs.add(livre1);
       docs.add(url1);
       
       
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
                   TestCatalogueLibrairie.afficheDoc();
                   
                   if (choix <= docs.size()-1)
                       System.out.println(docs.get(choix).toString());
                   else
                       System.out.println("Ce document n'existe pas");
                   break;
               case 3:
                   TestCatalogueLibrairie.choisiDoc();

                   switch(choix)
                   {
                       case 1:
                           docs.add(livre1);
                           break;
                       case 2:
                           docs.add(livre2);
                           break;
                       case 3:
                           docs.add(url1);
                           break;
                       case 4:
                           docs.add(cd1);
                           break;    
                   }               
                 break;
               case 4:
                   TestCatalogueLibrairie.afficheDoc();

                   docs.remove(docs.get(choix-1));

                   break;
               case 5:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();

                      docs.get(choix -1).emprunt(membres.get(choixMembre));

                  
                   break;
               case 6:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();
                   
                 
                    docs.get(choix -1).reservation(membres.get(choixMembre));

                   
                   
                    break;
               case 7:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();
                    

                    docs.get(choix -1).annulReservation(membres.get(choixMembre));

                    
                    break;
               case 8:
                   TestCatalogueLibrairie.afficheDoc();
                   
                    docs.get(choix -1).retour();

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
        
        choix = input.nextInt();
    }
   
   
    private static void afficheMembre()
    {
        System.out.println("Entrez le membre");
        
        System.out.println("1. " + membres.get(10).getNom()+ " Code abo: " + membres.get(10).getNumAbo());
        System.out.println("2. " + membres.get(11).getNom() + " Code abo: " + membres.get(11).getNumAbo());
        if(input.nextInt() == 1)
        {
            choixMembre = membres.get(10).getNumAbo();
        }
        else if(input.nextInt() == 2)
        {
            choixMembre = membres.get(11).getNumAbo();
        }
    }
    
    private static void choisiDoc()
    {
        System.out.println("Entrez le numero du document");
        
        System.out.println("1. " + livre1.getTitre()+ " " + livre1.getAuteurPrincipal());
        System.out.println("2. " + livre2.getTitre()+ " " + livre2.getAuteurPrincipal());
        System.out.println("3. " + url1.getTitre()+ " " + url1.getAuteurPrincipal());
        System.out.println("4. " + cd1.getTitre()+ " " + cd1.getAuteurPrincipal());
                
        
        choix = input.nextInt();
    }
}
