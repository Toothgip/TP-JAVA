/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author p1501257
 */
public class TestCatalogueLibrairie {
    private static CatalogueLibrairie docs = new CatalogueLibrairie();
    private static Scanner input;
    private static int choix = -1, choixMembre;
    private static boolean quitter = false;
   
    private static Livre livre1 = new Livre("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc","PitracCorp","044524-454-5",12),
                 livre2 = new Livre("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin","Hachette","005464578",42),
                  livre3 = new Livre("957 EDQ597 9547",42,2016,"Koman devenir Iffisssion","M.Sintur","Ceinture","ISBN-EF48494",1174);
    private static DocURL url1 = new DocURL("045640 450687", 2007, "PitracLeDieu",
          "Pitrac","www.pitracDieu.com","La vie résumée du Dieu Pitrac.");

    
    private static String newCode, newTitre, newDesc, newAuteur, newEditeur, newIsbn, newUrl,
                            newDescription, newMor;
    
    private static String newMorceau;
    
    private static int newAnnee, newPage, newCopie;
    
    private static DocLibrairie docUser;
    
    private static DocLibrairiePhysique docPhy = new DocLibrairiePhysique("", 0, 0, 
            "", "");
    
    
    private static ListeMembres membres = new ListeMembres();
    
    public static void main(String[] args)
   {
       docs.add(livre1);
       docs.add(livre2);
       docs.add(livre3);
       docs.add(url1);
       
       membres.add(new MembreEtudiant("Pitrac", "Avenue Albert Einstein", "0822462246", 10));
       membres.add(new MembrePersonnel("Zlatan","Rue Dunais","0687956412",11));
               
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
            System.out.println("9.Creer Doc");
            System.out.println("10.Compter le nombre de livre");
            System.out.println("11.Quitter");
            
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
                       case 0:
                           docs.add(livre1);
                           break;
                       case 1:
                           docs.add(livre2);
                           break;
                       case 2:
                           docs.add(livre3);
                           break;
                       case 3:
                           docs.add(url1);
                           break; 
                       default:
                           System.out.println("Le chiffre entré n'est pas valide");
                           break;
                   }               
                 break;
               case 4:
                   TestCatalogueLibrairie.afficheDoc();

                   docs.remove(docs.get(choix));

                   break;
               case 5:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();

                  
                   if(docs.get(choix) != null)
                   {
                       docs.get(choix).emprunt(membres.get(choixMembre));
                   }
                   else
                       System.out.println("Ce document n'existe pas");
                      

                   break;
               case 6:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();
                   
                 if(docs.get(choix) != null)
                   {
                        docs.get(choix).reservation(membres.get(choixMembre));
                   }
                 else
                       System.out.println("Ce document n'existe pas");
                 
                    break;
               case 7:
                   TestCatalogueLibrairie.afficheDoc();
                   TestCatalogueLibrairie.afficheMembre();
                    
                   if(docs.get(choix) != null)
                   {
                        docs.get(choix).annulReservation(membres.get(choixMembre));
                   }
                   else
                       System.out.println("Ce document n'existe pas");
                   
                   
                    break;
               case 8:
                   TestCatalogueLibrairie.afficheDoc();
                   
                   
                   if(docs.get(choix) != null)
                   {
                         docs.get(choix).retour();
                   }
                   else
                       System.out.println("Ce document n'existe pas");
                   
                   
                   break;
               case 9:
                   TestCatalogueLibrairie.creerDoc();
                   break;   
               case 10:
                   System.out.println("IL y a " + docs.compteLivres() + " Livre");
                   break; 
               case 11:
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
            System.out.println(i+1 + ". " + docs.get(i).getType() + docs.get(i).getTitre() + " " + 
                    docs.get(i).getAuteurPrincipal());
            i++;
        }
        
        choix = input.nextInt() - 1;
    }
   
   
    private static void afficheMembre()
    {
        System.out.println("Entrez le membre");
        
        System.out.println("1. " + membres.get(0).getNom()+ " Code abo: " + 
                membres.get(0).getNumAbo() + " est un membre " + membres.get(0).typeMembre);
        System.out.println("2. " + membres.get(1).getNom() + " Code abo: " +
                membres.get(1).getNumAbo() +" est un membre " + membres.get(1).typeMembre);
        /*if(input.nextInt() == 1)
        {
            choixMembre = membres.get(10).getNumAbo();
        }
        else if(input.nextInt() == 2)
        {
            choixMembre = membres.get(11).getNumAbo();
        }*/
        
        
        choixMembre = input.nextInt() -1;
    }
    
    private static void choisiDoc()
    {
        System.out.println("Entrez le numero du document");
        
        System.out.println("1. Livre: " + livre1.getTitre()+ " " + livre1.getAuteurPrincipal());
        System.out.println("2. Livre: " + livre2.getTitre()+ " " + livre2.getAuteurPrincipal());
        System.out.println("3. Livre: " + livre3.getTitre()+ " " + livre3.getAuteurPrincipal());
        System.out.println("4. URL " + url1.getTitre()+ " " + url1.getAuteurPrincipal());
              
        
        choix = input.nextInt() -1;
    }
    
    
    private static void creerDoc()
    {
        while (choix == -1)
        {
            System.out.println("Entrer le type de documents");
            System.out.println("1. Livre");
            System.out.println("2. CD");
            System.out.println("3. DocUrl");
            choix = input.nextInt();

            System.out.println("Entrer le code d'archivage");

            newCode = input.nextLine();
            newCode = input.nextLine();


            System.out.println("Entrer le Titre ou nom de du document");

            newTitre = input.nextLine();

            System.out.println("Entrer la date de création du document ou de publication");
            newAnnee = input.nextInt();
       
            switch(choix)
            {
                case 1://Creation de livre

                    System.out.println("Entrer le  nom de l'auteur du document");

                    newAuteur = input.nextLine();
                    newAuteur = input.nextLine();

                    System.out.println("Entrer le  nom de l'editeur");
                    newEditeur = input.nextLine();

                    System.out.println("Entrer le  nombre de page du document");
                    newPage = input.nextInt();

                    System.out.println("Entre le numero de copie");
                    newCopie = input.nextInt();

                    newIsbn = input.nextLine();

                    System.out.println("Entre le numero ISBN");
                    newIsbn = input.nextLine();

                    docs.add(new Livre(newCode, newCopie, newAnnee, newTitre, newAuteur, newEditeur,
                                        newIsbn, newPage));

                    break;
                case 2: //Crétion CD
                    System.out.println("Entre le numero de copie");
                    newCopie = input.nextInt();


                    System.out.println("Entrer le  nom de l'auteur du document");

                    newAuteur = input.nextLine();
                    newAuteur = input.nextLine();
                   

                    System.out.println("Entrer la liste des morceaux separé par un ;");
                    newMor = input.nextLine();
                        

                    docs.add(new CD(newCode, newCopie, newAnnee, newTitre, newAuteur, newMorceau));
                    break;

                case 3: //Création DocURL
                    System.out.println("Entrer le  nom de l'auteur du site");

                    newAuteur = input.nextLine();
                    newAuteur = input.nextLine();

                    System.out.println("Entrer l'url du site");

                    newUrl = input.nextLine();


                    System.out.println("Entrer une breve description du site");

                    newUrl = input.nextLine();

                    docs.add(new DocURL(newCode, newAnnee, newTitre, newAuteur, newUrl, newDescription));
                    break;

                default:
                        System.out.println("Le chiffre entré n'est pas valide");    //Faire un truc qui redemarre
                        choix = -1;
                       break;  
            }
        }
        System.out.println("Le document a été ajouté au catalogue");
    }
}
