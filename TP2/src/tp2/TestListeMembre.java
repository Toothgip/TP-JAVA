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
public class TestListeMembre {  
    
    private static MembreLibrairie membre1 = new MembreLibrairie("Pitrac", "Avenue Albert Einstein", "0822462246", 10),
            membre2 = new MembreLibrairie("Zlatan","Rue Dunais","0687956412",11);
    
    private static ListeMembres membres = new ListeMembres();
    
    
    private static Scanner input;
    private static boolean quitter = false;
    private static int choix, choixMembre;
    
    public static void main(String[] args){
        
        while (quitter == false)
        {
            System.out.println("\n1. Afficher les informations de tous les membres");
            System.out.println("2.  Afficher les informations sur un membre");
            System.out.println("3. Ajouter un membre");
            System.out.println("4. Supprimer un membre");
                  
            input = new Scanner(System.in);

            switch(input.nextInt())
            {

                case 1 : 
                   membres.affiche();
                   

                   break;
                case 2:
                    System.out.println("Entrer le code abo du membre");
                    membres.get(input.nextInt());

                    break;

                case 3:
                    TestListeMembre.afficheMembre();
                    
                    membres.add(membre1);
                    
                    break;


                case 4:                         
                    TestListeMembre.afficheMembre();
                    
                    membres.remove(membre1);       

                    break;               
                default:

                    System.out.println("Le chiffre entré n'est pas valide");    //Faire un truc qui redemarre

                   break;                      
            }
        }        
    }
    
    
    private static void afficheMembre()
    {
        System.out.println("Entrez le membre");
        
        System.out.println("1. " + membre1.getNom());
        System.out.println("2. " + membre2.getNom());
        choixMembre = input.nextInt();
    }
    
    

}
