/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;

/**
 *
 * @author p1501257
 */
public class CatalogueLibrairie {
    
    private ArrayList<DocLibrairie> docs;
    private int nbDoc = 0;
    
    public CatalogueLibrairie ()
    {
        docs = new ArrayList<DocLibrairie>(10);
    }
    
    public void add (DocLibrairie doc)
    {
        if (doc != null)
        {
            docs.add(doc);
            nbDoc ++;
            System.out.println("Le document a été ajouté");
        }
        else 
        {
            System.out.println("Le document n'existe pas");
        }
    }
    
    public void remove (DocLibrairie doc)
    {
        if(docs.size() != 0 && doc != null)
        {
            int i = 0;
            while (i < nbDoc && doc != docs.get(i))
            {
                i++;
            }
            if (doc == docs.get(i))
            {
                docs.remove(i);
                System.out.println("Le document a été supprimé");
            }
            else
            {
                System.out.println("Ce document n'est pas dans la liste");
            }
        }
        else
        {
            System.out.println("Ce document n'est pas dans la liste");
        }
        
    }
    
    
    public void emprunter(MembreLibrairie membre, int index)
    {
        if (index <= docs.size()-1)
            docs.get(index).emprunt(membre);
        else
            System.out.println("Ce document n'existe pas"); 
    }
    
    public void reservation(MembreLibrairie membre, int index)
    {
        if (index <= docs.size()-1)
            docs.get(index).reservation(membre);
        else 
            System.out.println("Ce document n'existe pas"); 
    }
    
    public void annulReservation(MembreLibrairie membre, int index)
    {
        if (index <= docs.size()-1)
            docs.get(index).annulReservation(membre);
        else
            System.out.println("Ce document n'existe pas");    
    }
    
    public void retour( int index)
    {
        if (index <= docs.size()-1)
            docs.get(index).retour();
        else
            System.out.println("Ce document n'existe pas");    
    }
    
    public void ranger(int index)
    {
        docs.get(index).ranger();
    }
    
    
    public DocLibrairie get (int i)
    {
        if(i < docs.size() && i >= 0)
        {
            return docs.get(i);
        }
        return null;             
    }
    
    public void affiche ()
    {
        int i = 0;
        while (i< docs.size())
        {
            System.out.println(docs.get(i).toString());
            i++;
        }
    }
    
    public int size()
    {
        return docs.size();
    }
}
