
package tp2;

public class DocLibrairie {
    
    private int numeroCopie, anneePublication;
    private static int nbLivre = 0, nbLivreEmprunte = 0, nbLivreReserve = 0; 
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
            System.out.println("L'etat entré est invalide les etats possibles sont : Disponible, Reserve, Emprunte, Retourne");
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
        if(this.etat == "Reserve")
        {
            System.out.println("Le livre est déjà réservé");
        }
        else
        {
            System.out.println("Le livre a été reservé");
            etat = "Reserve";
            this.membreReserveur = membreReserveur;
        }
    }
    
    public void emprunt(MembreLibrairie membreEmprunteur)
    {
        if(this.etat == "Disponible")
        {
            etat = "Emprunte";
            this.membreEmprunteur = membreEmprunteur;
        }
        else if(this.etat == "Reserve" && this.membreReserveur == membreEmprunteur)
        {
            this.membreEmprunteur = membreEmprunteur;
            this.membreReserveur = null;
            etat = "Emprunte";
        }
    }
        
    public void annulReservation()
    {
         this.etat = "Disponible";
         this.membreEmprunteur = null;
    }
    
    public void retour()
    {
        if (this.etat == "Emprunte")
        {
            this.etat = "Retourne";
            this.membreEmprunteur = null;
            System.out.println("Le livre est dans la pile des retours");
            
        }
    }
    
    public void ranger()
    {
        if (this.etat == "Retourne")
        {
            this.etat = "Disponible";
            System.out.println("Le livre est rangé");
        }
        else
        {
            System.out.println("Le livre est déjà rangé ou réservé");
        }
    }
    
}
