
package tp7;



public class DocLibrairie implements Comparable {
    
    protected int anneePublication;
    protected String titre, auteurPrincipal, codeArchivage, type = "", etat;
    protected Notifiable membreEmprunteur, membreReserveur;
    
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
    
    public DocLibrairie()
    {
        
    }
    
    //Accesseur 

    public Notifiable getMembreReserveur() {
        return membreReserveur;
    }

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
    
    public String getEtat() {
        return etat;
    }

    public String toString ()
    {
        return("Document : "+ codeArchivage + " " + titre + " " + auteurPrincipal +
                " " + anneePublication);
    }
    //Mutateur


    public void setEtat(String etat) {
        this.etat = etat;
    }
    
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
    
    public void reservation(Notifiable membreReserveur)
    {
        System.out.println("Ce document n'est pas réservable");
    }
    
    public void emprunt(Notifiable membreEmprunteur)
    {
        System.out.println("Ce document n'est pas empruntable");
    }
        
    public void annulReservation(Notifiable membreReserveur)
    {
        System.out.println("Ce document n'est pas réservable");
    }
    
    public void retour()
    {
        System.out.println("Ce document n'est pas retournable");
    }

    public int compareTo(Object o) {
        
        DocLibrairie doc = (DocLibrairie)o;
        
        return this.getCodeArchivage().compareTo(doc.getCodeArchivage());
        /*  Renvoi négatif si this est avant le docParametre
            Renvoie Positif si docParametre est avant this
            Renvoie 0 si ils sont équivalents
        */
    }
    
    
}
