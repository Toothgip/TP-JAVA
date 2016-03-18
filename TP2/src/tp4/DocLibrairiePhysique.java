/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author p1501257
 */
public class DocLibrairiePhysique extends DocLibrairie {
    protected String etat;
    protected static int nbDoc = 0, nbDocEmprunte = 0, nbDocReserve = 0, nbDocRetour = 0; 
    protected int numeroCopie;
    protected MembreLibrairie membreEmprunteur, membreReserveur;
    
    public DocLibrairiePhysique(String codeArchivage, int numeroCopie, int anneePublication, 
            String titre, String auteurPrincipal){
        
        super(codeArchivage,anneePublication,titre,auteurPrincipal);
        
        if(verifNumero(numeroCopie) == true)
        {
            this.numeroCopie = numeroCopie;
        }
        else
        {
            System.out.println("Numero de copie invalide");
        }
        nbDoc ++;   
        
    }
    
    private boolean verifNumero(int numero)
    {
        if(numero > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Acesseurs
    public int getNumeroCopie(){
        return numeroCopie;
    }
        
    public String getEtat()
    {
        return etat;
    }
    
        public static int getNbDoc()
    {
        return nbDoc;
    }
    public static int getNbEmprunte()
    {
        return nbDocEmprunte;
    }
    public static int getNbReserve()
    {
        return nbDocReserve;
    }
    public static int getNbRetour()
    {
        return nbDocRetour;
    }
    public MembreLibrairie getMembreReserveur()
    {
        if(this.membreReserveur == null)
        {
            System.out.println("Le livre ne possede pas de membre reserveur");
        }
        
        return this.membreReserveur;
    }
    
    public MembreLibrairie getMembreEmprunteur()
    {
        if(this.membreEmprunteur == null)
        {
            System.out.println("Le livre ne possede pas de membre emprunteur");
        }
        
        return this.membreEmprunteur;
    }
    
    
    
    //Mutateur
    public void setNumeroCopie(int newNumero){
        numeroCopie = newNumero;
    }
    
    public void setEtat(String newEtat)
    {
        if(newEtat == "Disponible" || newEtat == "Reserve" || newEtat == "Emprunte" || newEtat == "Retourne")
        {
           etat = newEtat;
        }
        else
        {
            System.out.println("L'etat entré est invalide les etats possibles sont : Disponible, Reserve, Emprunte, Retourne" + newEtat);
        }
    }
    
   
    //Getion Etat livres
    
    public void reservation(MembreLibrairie membreReserveur)
    {
        if(this.etat == "Emprunte")
        {
            System.out.println("Le livre a été reservé par " + membreReserveur.getNom());
            etat = "Reserve";
            this.membreReserveur = membreReserveur;
            nbDocReserve ++;
        }
        else
        {
            System.out.println("Le livre n'est pas disponible à la réservation");
        }
    }
    
    public void emprunt(MembreLibrairie membreEmprunteur)
    {
        if(this.etat == "Disponible")
        {
            etat = "Emprunte";
            this.membreEmprunteur = membreEmprunteur;
            nbDocEmprunte ++;
            System.out.println("Le livre a été emprunté par " + membreEmprunteur.getNom());
        }
        else if(this.etat == "Reserve" && this.membreReserveur == membreEmprunteur)
        {
            this.membreEmprunteur = membreEmprunteur;
            this.membreReserveur = null;
            etat = "Emprunte";
            System.out.println("Le livre a été emprunté par " + membreEmprunteur.getNom());
        }
        else
        {
            System.out.println("Le livre ne peut pas être emprunté");
        }
    }
        
    public void annulReservation(MembreLibrairie membreReserveur)
    {
        if(membreReserveur == this.membreReserveur)
        {
            this.etat = "Disponible";
            this.membreReserveur = null;
            System.out.println("La réservation de "+ membreReserveur.getNom() + " a été annulée");
            nbDocReserve --;
        }
        else
        {
            System.out.println("Ce livre n'a pas été réservé par "+ membreReserveur.getNom());
        }
    }
    
    public void retour()
    {
        if (this.etat == "Emprunte" || this.etat == "Reserve")
        {
            this.etat = "Retourne";
            this.membreEmprunteur = null;
            System.out.println("Le livre est dans la pile des retours");
            nbDocEmprunte --;
            nbDocRetour ++;
        }
        else
        {
            System.out.println("Ce livre n'a pas été emprunté");
        }
    }
    
    public void ranger()
    {
        if (this.etat == "Retourne")
        {
            this.etat = "Disponible";
            System.out.println("Le livre est rangé");
            nbDocRetour --;
        }
        else
        {
            System.out.println("Le livre est déjà rangé ou réservé");
        }
    }
    
    public String toString(){
        return super.toString() + " numéro de copie " + numeroCopie + " Etat: " + etat; 
    }
    
}
