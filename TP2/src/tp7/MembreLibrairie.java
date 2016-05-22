/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;




public abstract class  MembreLibrairie implements Notifiable {
    protected String nom, adresse, numTel, typeMembre = "";
    protected int numAbo;
    protected int nbDocEmprunt = 0;
    
    public MembreLibrairie(String nom,String adresse, String numTel, int numAbo)
    {
        this.adresse = adresse;
        this.nom = nom;
        this.numTel = numTel;
        this.numAbo = numAbo;
    }
        
    public String getAdresse()
    {
        return adresse;
    }
    public String getNom()
    {
        return nom;
    }
    public String getNumTel()
    {
        return numTel;
    }
    public int getNumAbo()
    {
        return numAbo;
    }
    public int getnbDocEmprunt()
    {
        return nbDocEmprunt;
    }
    
    public String getTypeMembre()
    {
        return typeMembre;
    }
    
    
    public String toString ()
    {
        return("Membre :" + nom + " numéro abo: " + numAbo + " adresse: " + adresse + " numero telephone :" 
                + numTel + "\n" );
    }
    
    public boolean peutEmprunterAutreDocument()
    {
        return true;
    }
    
    public abstract void DocDisponible(DocLibrairie doc);


    public void emprunt()
    {
        nbDocEmprunt ++;
    }
    
    public void retour()
    {
        nbDocEmprunt --;
    }
    
}