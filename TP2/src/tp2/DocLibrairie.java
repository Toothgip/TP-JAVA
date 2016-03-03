
package tp2;

public class DocLibrairie {
    
    private int numeroCopie, anneePublication;
    private static int nbLivre = 0, nbLivreEmprunte = 0, nbLivreReserve = 0, nbLivreRetour = 0; 
    private String titre, auteurPrincipal, codeArchivage, etat;
    private MembreLibrairie membreEmprunteur, membreReserveur;
    
    
    public DocLibrairie(String codeArchivage, int numeroCopie, int anneePublication, String titre, String auteurPrincipal)
    {
        this.codeArchivage = codeArchivage;
        
        if(verifNumero(numeroCopie) == true)
        {
            this.numeroCopie = numeroCopie;
        }
        else
        {
            System.out.println("Numero de copie invalide");
        }
        
        
        if(this.verifAnnee(anneePublication) == true)
        {
            this.anneePublication = anneePublication;
        }
        else
        {
            System.out.println("Année invalide");
        }
        
        
        this.auteurPrincipal = auteurPrincipal;
        this.titre = titre;
        
        etat = "Disponible";
        
        nbLivre ++;        
    }
    
    
    //Accesseur 
        
    public String getCodeArchivage(){
        return codeArchivage;
    }
    public String getTitre(){
        return titre;
    }
    public String getAuteurPrincipal(){
        return auteurPrincipal;
    }
    public int getNumeroCopie(){
        return numeroCopie;
    }
    public int getAnneePublication(){
        return anneePublication;
    }
    public String getEtat()
    {
        return etat;
    }
    public MembreLibrairie getMembreEmprunteur()
    {
        if(this.membreEmprunteur == null)
        {
            System.out.println("Le livre ne possede pas de membre emprunteur");
        }
        
        return this.membreEmprunteur;
    }
    
    public MembreLibrairie getMembreReserveur()
    {
        if(this.membreReserveur == null)
        {
            System.out.println("Le livre ne possede pas de membre reserveur");
        }
        
        return this.membreReserveur;
    }
    
    public static int getNbLivre()
    {
        return nbLivre;
    }
    public static int getNbEmprunte()
    {
        return nbLivreEmprunte;
    }
    public static int getNbReserve()
    {
        return nbLivreReserve;
    }
    public static int getNbRetour()
    {
        return nbLivreRetour;
    }
            
    
    //Mutateur
    
    public void setAuteurPrincipal(String newAuteur){
        auteurPrincipal = newAuteur;
    }
    public void setCodeArchivage(String newCode){
        codeArchivage = newCode;
    }
    public void setAnnee(int newAnnee){
        
        if(this.verifAnnee(newAnnee) == true)
        {
            anneePublication = newAnnee;
        }
        else
        {
            System.out.println("Année invalide");
        }
    }
    public void setNumeroCopie(int newNumero){
        numeroCopie = newNumero;
    }
    public void setTitre(String newTitre){
        titre = newTitre;
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
    
    
    //Verification 
    
    private boolean verifAnnee(int annee)
    {
        if(annee <= 2016)
        {
            return true;
        }
        else
        {
            return false;
        }
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
    
       
    
    //Getion Etat livres
    
    public void reservation(MembreLibrairie membreReserveur)
    {
        if(this.etat == "Emprunte")
        {
            System.out.println("Le livre a été reservé par " + membreReserveur.getNom());
            etat = "Reserve";
            this.membreReserveur = membreReserveur;
            nbLivreReserve ++;
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
            nbLivreEmprunte ++;
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
            nbLivreReserve --;
        }
        else
        {
            System.out.println("Ce livre n'a pas été réservé par "+ membreReserveur.getNom());
        }
    }
    
    public void retour(MembreLibrairie membreEmprunteur)
    {
        if (this.etat == "Emprunte")
        {
            this.etat = "Retourne";
            this.membreEmprunteur = null;
            System.out.println("Le livre est dans la pile des retours");
            nbLivreEmprunte --;
            nbLivreRetour ++;
        }
    }
    
    public void ranger()
    {
        if (this.etat == "Retourne")
        {
            this.etat = "Disponible";
            System.out.println("Le livre est rangé");
            nbLivreRetour --;
        }
        else
        {
            System.out.println("Le livre est déjà rangé ou réservé");
        }
    }
    
}
