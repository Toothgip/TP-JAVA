package tp7;

import java.util.*;
import java.text.*;

public class TestPerfCollections
{
	private DocLibrairie[] tabPers;
	private Set<DocLibrairie> hashSet;
	private List<DocLibrairie> arrayList;
	private List<DocLibrairie> linkedList;
	private static int compteurDoc = 10000;
        private long time = 0;
        int cpt = 0;

	public static void main(String argv[])
	{
		System.out.println("Début des tests de performance...");
		TestPerfCollections test = new TestPerfCollections();
		System.out.println("Fin...");
	}

	public TestPerfCollections()
	{
		// cr�ation d'un grand nombre d'objets DocLibrairie
		tabPers = new DocLibrairie[compteurDoc];
		for(int i = 0; i < compteurDoc; i++)
			tabPers[i] = new DocLibrairie();
			
		arrayList = new ArrayList<DocLibrairie>();
		linkedList = new LinkedList<DocLibrairie>();
		hashSet = new HashSet<DocLibrairie>();
		
                
		ajArrayList();
                ajLinkedList();
                ajHashSet();

                rechArrayList(compteurDoc);
                rechLinkedList(compteurDoc);
                rechHashSet(compteurDoc);
                
	}
	
	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute � l'ArrayList
	 **/
	public void ajArrayList()
	{
            for(DocLibrairie doc : tabPers)
            {
                arrayList.add(doc);
            }
            
	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute � la LinkedList
	 **/
	public void ajLinkedList()
	{

            for(DocLibrairie doc: tabPers)
            {
                linkedList.add(doc);
            }
	
	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute au HashSet
	 **/
	public void ajHashSet()
	{

            for(DocLibrairie doc: tabPers)
            {
                hashSet.add(doc);
            }

	}

	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le param�tre d'entree nbObj indique le nombre d'objets considérés.
	 * Le processus consiste à vérifier que le ArrayList contient bien les nbObj
	 * objets de tabPers et à déterminer le temps requis pour réaliser la recherche.
	 **/
	 
	public void rechArrayList(int nbObj)
	{
            
            time = System.currentTimeMillis();
            for(DocLibrairie doc : tabPers)
            {
                if(arrayList.contains(doc))
                    cpt++;
            }
            time =  System.currentTimeMillis() - time;
            
            System.out.println("ArrayList : Le temps necessaire pour rechercher " + nbObj + " est de " + time + " ms");

	}
	
	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le param�tre d'entr�e nbObj indique le nombre d'objets consid�r�s.
	 * Le processus consiste � v�rifier que la LinkedList contient bien les nbObj
	 * objets de tabPers et � d�terminer le temps requis pour r�aliser la recherche.
	 **/

	public void rechLinkedList(int nbObj)
	{
            time = System.currentTimeMillis();
            for(DocLibrairie doc : tabPers)
            {
                if(linkedList.contains(doc))
                    cpt++;
            }
            time =  System.currentTimeMillis() - time;
            
            System.out.println("LinkedLIST : Le temps necessaire pour rechercher " + nbObj + " est de " + time + " ms");
	}
	
	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le param�tre d'entr�e nbObj indique le nombre d'objets consid�r�s.
	 * Le processus consiste � v�rifier que le HashSet contient bien les nbObj
	 * objets de tabPers et � d�terminer le temps requis pour r�aliser la recherche.
	 **/

	public void rechHashSet(int nbObj)
	{
            time = System.currentTimeMillis();
            
            for(DocLibrairie doc: tabPers)
            {
                if(hashSet.contains(doc))
                    cpt++;
            }
            
            time = System.currentTimeMillis() - time;
            
            System.out.println("HashSet: Le temps necessaire pour rechercher " + nbObj + " est de " + time + " ms");
	}
}