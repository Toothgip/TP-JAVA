/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import tp5.*;
import java.util.ArrayList;

/**
 *
 * @author p1501257
 */
public class CD extends DocLibrairiePhysique{
    
    
    protected String listeMorceaux;
    private int i = 0;
    
    public CD (String codeArchivage, int numeroCopie, int anneePublication, String titre,
          String auteurPrincipal, String listeMorceaux) throws ErreurCopie{
        super( codeArchivage,numeroCopie,anneePublication,titre,auteurPrincipal);
        
       this.listeMorceaux = listeMorceaux;
       
       type = "CD";
    }
    
    CD() throws ErreurCopie{
        super("", 0, 0 ,  "", "");
    }
    
    public String toString()
    {
        return "CD " + codeArchivage + " " + titre + " écrit par "+ auteurPrincipal +
                " édité par " + " sortie en " + anneePublication +  " etat : " + etat; 
    }
}
