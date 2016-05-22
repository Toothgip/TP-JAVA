
package tp7;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollection {
    private static Set<DocLibrairie> setCollec;
    private static DocLibrairie doc1, doc2, doc3;
    private static DocLibrairieComparator comparator;
    private static Map<String, DocLibrairie> mapCollec;
    
    public static void main(String[] argv)
    {
        //Instanciation
        setCollec = new TreeSet<DocLibrairie>();
        
        mapCollec = new TreeMap<String, DocLibrairie>();
        
        doc1 =  new Livre("004. 178 K20PM", 10, 2015, "Introduction à Java", "J. Leblanc","PitracCorp",
                            "044524-454-5",12);
        
        comparator = new DocLibrairieComparator();
        
        doc3 = new Livre("957 EDQ597 9547",42,2016,"Koman devenir Iffisssion","M.Sintur","Ceinture","ISBN-EF48494",1174);
        
        
        
        //Ajout des docs dans les collections
        setCollec.add(new DocURL("045640 450687", 2007, "PitracLeDieu",
          "Pitrac","www.pitracDieu.com","La vie résumée du Dieu Pitrac."));
        
        mapCollec.put(doc1.getCodeArchivage(), doc1);
        
        mapCollec.put(doc3.getCodeArchivage(), doc3);
        
        
        //1er methode avec un Set
        Iterator<DocLibrairie> ite = setCollec.iterator();
        
        System.out.println("Affichage des docs par ordre de code archivage avec usage d'un iterateur");
        
        doc2 = ite.next();

        if(doc2.compareTo(doc1) < 0)
        {
            System.out.println(ite.next().toString());
            System.out.println(doc2.toString());
        }
            
        else if ( doc2.compareTo(doc1) > 0)
        {
            System.out.println(doc1.toString());
            System.out.println(doc2.toString());
        }
        
        //2eme methode avec un comparator
        System.out.println("\n\nAffichage des docs par ordre alphabetique du titre");
        if(comparator.compare(doc1, doc3) < 0)
        {
            System.out.println(doc1.getTitre());
            System.out.println(doc2.getTitre());
        }
        else if( comparator.compare(doc1, doc2) > 0)
        {
            System.out.println(doc2.getTitre());
            System.out.println(doc1.getTitre());
        }
        else
        {
            System.out.println("Les documents ont le même titre");
        }
        
        
        //3eme méthode avec un Map
        
        Iterator<DocLibrairie> mapIte = mapCollec.values().iterator();
        
        System.out.println("\n\nAffichage des objets de la map");
        
        while(mapIte.hasNext())
        {
            System.out.println(mapIte.next().toString());
        }
         //Ils sont affiché par ordre alphabetique de la clé ici le code d'archivage   
    }
    
    
}
