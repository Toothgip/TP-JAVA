/**
* Classe proposant l'�valuation de la performance de certaines Collections Java 
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
		System.out.println("D�but des tests de performance...");
		TestPerfCollections test = new TestPerfCollections();
		System.out.println("Fin...");
	}

	public TestPerfCollections()
	{
		// cr�ation d'un grand nombre d'objets DocLibrairie
		tabPers = new DocLibrairie[compteurDoc];
		for(int i = 0; i < compteurDoc; i++)
			tabPers[i] = new DocLibrairie(i);
			
		arrayList = new ArrayList<DocLibrairie>();
		linkedList = new LinkedList<DocLibrairie>();
		hashSet = new HashSet<DocLibrairie>();
		
			// �criture de code pour ajouter les objets DocLibrairie aux collections (cf. m�thodes correspondantes ci-dessous)
			// ....
			
			// �criture de code pour rechercher les objets DocLibrairie dans les collections (cf. m�thodes correspondantes ci-dessous)
			// ....
	}
	
	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute � l'ArrayList
	 **/
	public void ajArrayList()
	{
		
	// �criture de code pour ajouter les objets DocLibrairie

	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute � la LinkedList
	 **/
	public void ajLinkedList()
	{

	// �criture de code pour ajouter les objets DocLibrairie
	
	}

	/**
	 * Traite chaque objet DocLibrairie dans le tableau tabPers et l'ajoute au HashSet
	 **/
	public void ajHashSet()
	{

	// �criture de code pour ajouter les objets DocLibrairie

	}

	/**
	 * Evalue la performance de recherche de l'impl�mentation.
	 * Le param�tre d'entr�e nbObj indique le nombre d'objets consid�r�s.
	 * Le processus consiste � v�rifier que le ArrayList contient bien les nbObj
	 * objets de tabPers et � d�terminer le temps requis pour r�aliser la recherche.
	 **/
	 
	public void rechArrayList(int nbObj)
	{
		
	// �criture de code pour rechercher les objets DocLibrairie

	}
	
	/**
	 * Evalue la performance de recherche de l'impl�mentation.
	 * Le param�tre d'entr�e nbObj indique le nombre d'objets consid�r�s.
	 * Le processus consiste � v�rifier que la LinkedList contient bien les nbObj
	 * objets de tabPers et � d�terminer le temps requis pour r�aliser la recherche.
	 **/

	public void rechLinkedList(int nbObj)
	{

	// �criture de code pour rechercher les objets DocLibrairie
	
	}
	
	/**
	 * Evalue la performance de recherche de l'impl�mentation.
	 * Le param�tre d'entr�e nbObj indique le nombre d'objets consid�r�s.
	 * Le processus consiste � v�rifier que le HashSet contient bien les nbObj
	 * objets de tabPers et � d�terminer le temps requis pour r�aliser la recherche.
	 **/

	public void rechHashSet(int nbObj)
	{

	// �criture de code pour rechercher les objets DocLibrairie

	}
}