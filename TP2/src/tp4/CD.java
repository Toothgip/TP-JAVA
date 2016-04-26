/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.ArrayList;

/**
 *
 * @author p1501257
 */
public class CD extends DocLibrairiePhysique{
    
    
    protected ArrayList<String> listeMorceaux;
    private int i = 0;
    
    public CD (String codeArchivage, int numeroCopie, int anneePublication, String titre,
          String auteurPrincipal, ArrayList<String> listeMorceaux){
        super( codeArchivage,numeroCopie,anneePublication,titre,auteurPrincipal);
        
        while(i < listeMorceaux.size())
        {
            this.listeMorceaux.add(listeMorceaux.get(i)) ;
            i++;
        }
        type = "CD";
    }
    
    CD(){
        super("", 0, 0 ,  "", "");
    }
    
    public String toString()
    {
        return "CD " + codeArchivage + " " + titre + " écrit par "+ auteurPrincipal +
                " édité par " + " sortie en " + anneePublication +  " etat : " + etat; 
    }
}
