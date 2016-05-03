/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author p1501257
 */
public class CatalogueLibrairie {
    
    private LinkedList<DocLibrairie> docs;
    private int nbDoc = 0, nbLivre = 0, nbCD = 0;
    
    public CatalogueLibrairie ()
    {
        docs = new LinkedList<DocLibrairie>();
    }
    
    public void add (DocLibrairie doc) throws ErreurCopie
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
    
    public void remove (DocLibrairie doc) throws ErreurCopie
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
            try
            {
                return docs.get(i);
            }
            catch(ArrayIndexOutOfBoundsException probleme)
            {
                System.out.println("Ereur indice qui sort du catalogue");
            }
            finally
            {
                return null; 
            }
                    
    }
    
    public void affiche ()
    {
        int i = 0;
        while (i< docs.size())
        {
            if(docs.get(i).getEtat() != "Indisponible")
            {
                System.out.println(docs.get(i).toString());
            }
            
            i++;
        }
    }
    
    public int size()
    {
        return docs.size();
    }
    
    
}