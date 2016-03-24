
package tp4;

public class DocLibrairie {
    
    protected int anneePublication;
    protected String titre, auteurPrincipal, codeArchivage, type = "";
    
    
    public DocLibrairie(String codeArchivage, int anneePublication, String titre,
            String auteurPrincipal)
    {
        this.codeArchivage = codeArchivage;
        
        
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

    public int getAnneePublication(){
        return anneePublication;
    }
    
    public String getType()
    {
        return type;
    }

    public String toString ()
    {
        return("Document : "+ codeArchivage + " " + titre + " " + auteurPrincipal +
                " " + anneePublication);
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

    public void setTitre(String newTitre){
        titre = newTitre;
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
    
    public void reservation(MembreLibrairie membreReserveur)
    {
        System.out.println("Ce document n'est pas réservable");
    }
    
    public void emprunt(MembreLibrairie membreEmprunteur)
    {
        System.out.println("Ce document n'est pas empruntable");
    }
        
    public void annulReservation(MembreLibrairie membreReserveur)
    {
        System.out.println("Ce document n'est pas réservable");
    }
    
    public void retour()
    {
        System.out.println("Ce document n'est pas retournable");
    }
    
    
}
