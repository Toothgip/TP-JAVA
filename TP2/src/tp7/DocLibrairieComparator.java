/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.Comparator;

/**
 *
 * @author Thomas
 */
public class DocLibrairieComparator implements Comparator<DocLibrairie> {


    public int compare(DocLibrairie doc1, DocLibrairie doc2) {
        return(doc1.getTitre().compareTo(doc2.getTitre()));
    }
    
}
