/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.Scanner;

public class MembreEtudiant extends MembreLibrairie implements Notifiable {
    
    private Scanner input;
    int choix;
    
    public MembreEtudiant(String nom,String adresse, String numTel, int numAbo)
    {
        super(nom, adresse, numTel, numAbo);
        typeMembre = "Etudiant";
    }
    
    public boolean peutEmprunterAutreDocument()
    {
        if(nbDocEmprunt < 4)
        {
            return true;
        }
        return false;
    }
    
    public void DocDisponible(DocLibrairie doc)
    {
        
            System.out.println("Le document " + doc.getTitre() + " est disponible\n" +
                                "Souhaitez vous le reserver ? 1- Oui 2-Non/n)");
            input = new Scanner(System.in);
            
            choix = input.nextInt();
            if(choix == 1)
            {
                doc.emprunt(this);
                
                doc.annulReservation(this);
            }
           
      
        
    }
    
}
