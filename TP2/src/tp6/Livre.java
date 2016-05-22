/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;


/**
 *
 * @author Thomas
 */
public class Livre extends DocLibrairiePhysique {
    
    protected String nomEditeur, NumIsbn;
    protected int nbPages;
    
    
    Livre(String codeArchivage, int numeroCopie, int anneePublication, String titre,
          String auteurPrincipal, String nomEditeur, String numIsbn, int nbPages) 
    {
        
            super(codeArchivage, numeroCopie, anneePublication, titre, auteurPrincipal);
      
        this.nbPages = nbPages;
        this.nomEditeur = nomEditeur;
        this.NumIsbn = numIsbn;
        type = "Livre";
    }
    
    Livre() 
    {
        
            super("", 0, 0 ,  "", "");
        
      
    }
    
    
    public String toString()
    {
        return "Livre " + codeArchivage + " " + titre + " écrit par "+ auteurPrincipal +
                " édité par " + nomEditeur + " publié en " + anneePublication + " nombre de pages " +
                nbPages + " etat : " + etat; 
    }
}
