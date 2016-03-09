package tp2;
import java.util.Scanner;

public class TestLibrairie {
    
    private static DocLibrairie doc1 = new DocLibrairie("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc"),
                 doc2 = new DocLibrairie("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin");
    private static Scanner input;
    private static int choix, choixMembre;
    private static String newEtat;
    private static boolean quitter = false;
    private static MembreLibrairie membre1 = new MembreLibrairie("Pitrac", "Avenue Albert Einstein", "0822462246", 10),
            membre2 = new MembreLibrairie("Zlatan","Rue Dunais","0687956412",11);
    
    public static void main(String[] args)
    {
       /* System.out.println("Le titre du doc 1 est " + doc1.getTitre() );
        System.out.println("L'auteur principal du doc 1 est " + doc1.getAuteurPrincipal());
        
        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );
        
        System.out.println("Le code d'archivage du doc 1 est " + doc1.getCodeArchivage() );
        
        doc1.setAnnee(3000);

        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );*/
        
      
        
        while (quitter == false)
        {
            System.out.println("\n1. Afficher des informations sur un document");
            System.out.println("2. Connaître l’état d’un document");
            System.out.println("3. Empruter un document");
            System.out.println("4. Faire une réservation");
            System.out.println("5. Annuler une réservation");
            System.out.println("6. Retourner un livre");
            System.out.println("7. Afficher le nombre de documents empruntés");
            System.out.println("8. Afficher le nombre de documents sur la pile des retours");
            System.out.println("9. Afficher le nombre de documents dans la section réservations");
            System.out.println("10. Quitter\n\n");

        
            input = new Scanner(System.in);

            switch(input.nextInt())
            {

                case 1 : 

                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        System.out.println("Document 1 " + doc1.getCodeArchivage() + " " + doc1.getTitre()+ " " + doc1.getAuteurPrincipal() + " " + doc1.getAnneePublication() + " Etat: " + doc1.getEtat() );
                    }
                    else if (choix == 2)
                    {
                        System.out.println("Document 2 " + doc2.getCodeArchivage() + " " + doc2.getTitre()+ " " + doc2.getAuteurPrincipal() + " " + doc2.getAnneePublication() + " Etat: " + doc2.getEtat() );
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }

                    break;
                case 2:

                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        System.out.println("Document 1 " + doc1.getEtat() );
                    }
                    else if (choix == 2)
                    {
                        System.out.println("Document 2 " + doc2.getEtat() );
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }

                    break;

                case 3:
                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc1.emprunt(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc1.emprunt(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc2.emprunt(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc2.emprunt(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }                       

                    break;


                case 4:                         
                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc1.reservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc1.reservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc2.reservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc2.reservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }                

                    break;

                case 5:                   
                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc1.annulReservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc1.annulReservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }                                        
                    }
                    else if (choix == 2)
                    {
                        TestLibrairie.afficheMembre();

                        if(choixMembre == 1)
                        {
                            doc2.annulReservation(membre1);
                        }
                        else if(choixMembre == 2)
                        {
                            doc2.annulReservation(membre2);
                        }
                        else
                        {
                            System.out.println("Ce membre n'existe pas");
                        }
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }          

                    break;

                case 6:                              
                    TestLibrairie.afficheDoc();

                    if (choix == 1)
                    {
                        doc1.retour();
                                                         
                    }
                    else if (choix == 2)
                    {
                        doc2.retour();
                    }
                    else
                    {
                        System.out.println("Ce document n'existe pas");
                    }          

                    break;

                case 7:
                    System.out.println("Nombre de documents empruntés: " + DocLibrairie.getNbEmprunte());
                    break;

                case 8:
                    System.out.println("Nombre de documents sur la pile des retours: " + DocLibrairie.getNbRetour());
                    break;

                case 9:
                    System.out.println("Nombre de documents dans la section réservations: " + DocLibrairie.getNbReserve ());
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
        System.out.println("Entrez le numero du document");
        
        System.out.println("1. " + doc1.getTitre()+ " " + doc1.getAuteurPrincipal());
        System.out.println("2. " + doc2.getTitre()+ " " + doc2.getAuteurPrincipal());
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
