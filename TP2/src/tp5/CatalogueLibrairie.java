/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

import tp4.*;
import java.util.ArrayList;

/**
 *
 * @author p1501257
 */
public class CatalogueLibrairie {
    
    private ArrayList<DocLibrairie> docs;
    private int nbDoc = 0, nbLivre = 0, nbCD = 0;
    
    public CatalogueLibrairie ()
    {
        docs = new ArrayList<DocLibrairie>(10);
    }
    
    public void add (DocLibrairie doc)
    {
        if (doc != null)
        {
            if(doc.equals(new Livre()))
            {
                nbLivre ++;
            }
            else if (doc.equals(new CD()))
            {
                nbCD ++;
            }
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
                if(doc.equals(new Livre()))
                {
                    nbLivre --;
                }
                else if (doc.equals(new CD()))
                {
                    nbCD --;
                }
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
    
    public int compteLivres(){
        return nbLivre;
    }
    
    public int compteCD(){
        return nbCD;
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