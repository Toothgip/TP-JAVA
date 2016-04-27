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
public class MembreEtudiant extends MembreLibrairie {
    
    
    public MembreEtudiant(String nom,String adresse, String numTel, int numAbo)
    {
        super(nom, adresse, numTel, numAbo);
        typeMembre = "Etudiant";
    }
    
    public boolean peutEmprunterAutreDocument()
    {
        if(nbDocEmprunt < 0)
        {
            return true;
        }
        return false;
    }
    
    
    
}
