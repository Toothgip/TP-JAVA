/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author p1501257
 */
public class MembrePersonnel extends MembreLibrairie{
    
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
    
    
}
