/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;


public class MembreLibrairie {
    private String nom, adresse;
    private int numTel, numAbo;
    
    public MembreLibrairie(String nom,String adresse, int numTel, int numAbo)
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
    public int getNumTel()
    {
        return numTel;
    }
    public int getNumAbo()
    {
        return numAbo;
    }

}
