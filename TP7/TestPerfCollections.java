/**
* Classe proposant l'évaluation de la performance de certaines Collections Java 
**/
import java.util.*;
import java.text.*;

public class TestPerfCollections
{
	private DocLibrairie[] tabPers;
	private Set<DocLibrairie> hashSet;
	private List<DocLibrairie> arrayList;
	private List<DocLibrairie> linkedList;
	private static int compteurDoc = 10000;

	public static void main(String argv[])
	{
		System.out.println("Début des tests de performance...");
		TestPerfCollections test = new TestPerfCollections();
		System.out.println("Fin...");
	}

	public TestPerfCollections()
	{
		// création d'un grand nombre d'objets DocLibrairie
		tabPers = new DocLibrairie[compteurDoc];
		for(int i = 0; i < compteurDoc; i++)
			tabPers[i] = new DocLibrairie(i);
			
		arrayList = new ArrayList<DocLibrairie>();
		linkedList = new LinkedList<DocLibrairie>();
		hashSet = new HashSet<DocLibrairie>();
		
			// écriture de code pour ajouter les objets DocLibrairie aux collections (cf. méthodes correspondantes ci-dessous)
			// ....
			
			// écriture de code pour rechercher les objets DocLibrairie dans les collections (cf. méthodes correspondantes ci-dessous)
			// ....
	}
	
	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute à l'ArrayList
	 **/
	public void ajArrayList()
	{
		
	// écriture de code pour ajouter les objets DocLibrairie

	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute à la LinkedList
	 **/
	public void ajLinkedList()
	{

	// écriture de code pour ajouter les objets DocLibrairie
	
	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute au HashSet
	 **/
	public void ajHashSet()
	{

	// écriture de code pour ajouter les objets DocLibrairie

	}

	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le paramètre d'entrée nbObj indique le nombre d'objets considérés.
	 * Le processus consiste à vérifier que le ArrayList contient bien les nbObj
	 * objets de tabPers et à déterminer le temps requis pour réaliser la recherche.
	 **/
	 
	public void rechArrayList(int nbObj)
	{
		
	// écriture de code pour rechercher les objets DocLibrairie

	}
	
	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le paramètre d'entrée nbObj indique le nombre d'objets considérés.
	 * Le processus consiste à vérifier que la LinkedList contient bien les nbObj
	 * objets de tabPers et à déterminer le temps requis pour réaliser la recherche.
	 **/

	public void rechLinkedList(int nbObj)
	{

	// écriture de code pour rechercher les objets DocLibrairie
	
	}
	
	/**
	 * Evalue la performance de recherche de l'implémentation.
	 * Le paramètre d'entrée nbObj indique le nombre d'objets considérés.
	 * Le processus consiste à vérifier que le HashSet contient bien les nbObj
	 * objets de tabPers et à déterminer le temps requis pour réaliser la recherche.
	 **/

	public void rechHashSet(int nbObj)
	{

	// écriture de code pour rechercher les objets DocLibrairie

	}
}