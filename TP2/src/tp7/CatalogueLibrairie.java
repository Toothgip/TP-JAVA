/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;


import java.util.Iterator;
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
            //Utilisation d' un iterateur 
            Iterator<DocLibrairie> docIte = docs.iterator();
            while (docIte.hasNext() && doc != docIte)
            {
                docIte.next();
            }
            if (doc == docIte)
            {
                if(doc.equals(new Livre()))
                {
                    nbLivre --;
                }
                else if (doc.equals(new CD()))
                {
                    nbCD --;
                }
                docIte.remove();
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
        
        //Boucle for optmisé
        for(DocLibrairie doc : docs)
        {
            if(doc.getEtat() != "Indisponible")
            {
                System.out.println(doc.toString());
            }
            
            
        }
    }
    
    public int size()
    {
        return docs.size();
    }
    
    
}