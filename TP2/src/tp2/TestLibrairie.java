/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author p1501257
 */
public class TestLibrairie {
    
    static DocLibrairie doc1 = new DocLibrairie("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc"),
                 doc2 = new DocLibrairie("967. 4987 T248O", 10, 2013, "Structures de Données", "M. Machin");
    
    public static void main(String[] args)
    {
        System.out.println("Le titre du doc 1 est " + doc1.getTitre() );
        System.out.println("L'auteur principal du doc 1 est " + doc1.getAuteurPrincipal());
        
        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );
        
        System.out.println("Le code d'archivage du doc 1 est " + doc1.getCodeArchivage() );
        
        doc1.setAnnee(3000);

        System.out.println("L'annee de publication du doc 1 est " + doc1.getAnneePublication() );
        
        
    }
    
    
}
