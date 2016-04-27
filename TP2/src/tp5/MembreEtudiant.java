/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import java.util.Scanner;

public class MembreEtudiant extends MembreLibrairie implements Notifiable {
    
    private Scanner input;
    
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
        if(doc.etat == "Disponible" && doc.getMembreReserveur() == this)
        {
            System.out.println("Le document " + doc.getTitre() + " est disponible\n" +
                                "Souhaitez vous le reserver ? (y/n)");
            
            if(input.nextLine() == "y")
            {
                doc.emprunt(this);
                
                doc.annulReservation(this);
            }
           
        }
        
    }
    
}
