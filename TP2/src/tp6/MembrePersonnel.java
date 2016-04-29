/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import tp5.*;

public class MembrePersonnel extends MembreLibrairie implements Notifiable{
    
    public MembrePersonnel(String nom,String adresse, String numTel, int numAbo)
    {
        super(nom, adresse, numTel, numAbo);
        typeMembre = "Personnel";
    }
    
    public boolean peutEmprunterAutreDocument()
    {
        if(nbDocEmprunt < 8)
        {
            return true;
        }
        return false;
    }
    
    public void DocDisponible(DocLibrairie doc)
    {
        System.out.println("Le document " + doc.titre + " qui a été réservé par le membre du personnel" +
                doc.getMembreReserveur().getNom() +" est désormais disponible à l’emprunt au bureau des réservations");
    }
    
}
