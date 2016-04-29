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
public class ListeMembres {
    
    private ArrayList<Notifiable> membres;
    private static int nbMembre = 0;
    
    public ListeMembres() {
        membres = new ArrayList<Notifiable>();
        nbMembre ++;
    }
    
    public void add(Notifiable membre){
        
        if (membre != null)
        {
            membres.add(membre);
            System.out.println("Membre ajouté");
        }
        else 
        {
            System.out.println("Le membre n'existe pas");
        }
        
    }
    
    public void remove(MembreLibrairie membre){
        int i = 0;
        
        if(membre != null)
        {
            while (i < nbMembre && membre != membres.get(i))
            {
                i++;
            }
            if (membre == membres.get(i))
            {
                membres.remove(i);
                System.out.println("Le membre a été supprimé");
            }
            else
            {
                System.out.println("Le membre n'est pas dans la liste");
            }
        }
        else
            System.out.println("Le membre n'existe pas");
    }
    
    /*public MembreLibrairie get (int codeAbonne)
    {
        int i = 0;
        while (i < membres.size() && membres.get(i).getNumAbo() != codeAbonne)
        {
            i++;
        }
        if(membres.get(i).getNumAbo() == codeAbonne)
        {
            return membres.get(i);  
        }
        System.out.println("Ce code abonné n'appartient à aucun membre");
        return null;                      
    }*/
    
    
    public Notifiable get (int index)
    {
        if(index < membres.size() && index >= 0)
        {
            return membres.get(index);
        }
        System.out.println("Le membre cherché n'existe pas");
        return null;
    }
    
    
        
    public void affiche ()
    {
        int i = 0;
        while (i< membres.size())
        {
            System.out.println(membres.get(i).toString());
            i++;
        }
    }
    
    
}
