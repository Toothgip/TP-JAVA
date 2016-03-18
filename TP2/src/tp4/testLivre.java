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
public class testLivre {
    
    private static Livre livre1 = new Livre("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc","PitracCorp","044524-454-5",12),
                 livre2 = new Livre("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin","Hachette","005464578",42);
    private static Scanner input;
    private static int choix, choixMembre;
    private static String newEtat;
    private static boolean quitter = false;
    private static MembreLibrairie membre1 = new MembreLibrairie("Pitrac", "Avenue Albert Einstein", "0822462246", 10),
            membre2 = new MembreLibrairie("Zlatan","Rue Dunais","0687956412",11);
    
    public static void main(String[] args)
    {
      
        while (quitter == false)
        {
            System.out.println("\n1. Afficher des informations sur un livre");
            System.out.println("2. Connaître l’état d’un livre");
            System.out.println("3. Empruter un livre");
            System.out.println("4. Faire une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Retourner un livre");
            System.out.println("7. Afficher le nombre de livres empruntés");
            System.out.println("8. Afficher le nombre de livres sur la pile des retours");
            System.out.println("9. Afficher le nombre de livres dans la section réservations");
            System.out.println("10. Quitter\n");

        
            input = new Scanner(System.in);

            switch(input.nextInt())
            {

                case 1 : 

                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        System.out.println(livre1.toString());
                    }
                    else if (choix == 2)
                    {
                        System.out.println(livre2.toString());
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }

                    break;
                case 2:

                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        System.out.println("Livre 1 " + livre1.getEtat() );
                    }
                    else if (choix == 2)
                    {
                        System.out.println("Livre 2 " + livre2.getEtat() );
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }

                    break;

                case 3:
                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre1.emprunt(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre1.emprunt(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre2.emprunt(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre2.emprunt(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }                       

                    break;


                case 4:                         
                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre1.reservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre1.reservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre2.reservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre2.reservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }                

                    break;

                case 5:                   
                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre1.annulReservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre1.annulReservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        testLivre.afficheMembre();

                        if(choixMembre == 1)
                        {
                            livre2.annulReservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            livre2.annulReservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }          

                    break;

                case 6:                              
                    testLivre.afficheDoc();

                    if (choix == 1)
                    {
                        livre1.retour();
                                                         
                    }
                    else if (choix == 2)
                    {
                        livre2.retour();
                    }
                    else
                    {
                        System.out.println("Ce livre n'existe pas");
                    }          

                    break;

                case 7:
                    System.out.println("Nombre de livres empruntés: " + tp2.DocLibrairie.getNbEmprunte());
                    break;

                case 8:
                    System.out.println("Nombre de livres sur la pile des retours: " + tp2.DocLibrairie.getNbRetour());
                    break;

                case 9:
                    System.out.println("Nombre de livres dans la section réservations: " + tp2.DocLibrairie.getNbReserve ());
                    break;
                case 10:
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
        System.out.println("Entrez le numero du livre");
        
        System.out.println("1. " + livre1.getTitre()+ " " + livre1.getAuteurPrincipal());
        System.out.println("2. " + livre2.getTitre()+ " " + livre2.getAuteurPrincipal());
        choix = input.nextInt();
    }
    
        private static void afficheMembre()
    {
        System.out.println("Entrez le membre");
        
        System.out.println("1. " + membre1.getNom());
        System.out.println("2. " + membre2.getNom());
        choixMembre = input.nextInt();
    }
    
    
}
