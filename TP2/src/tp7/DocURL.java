/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;



/**
 *
 * @author p1501257
 */
public class DocURL extends DocLibrairie{
    
    protected String URL,description;
    
    public DocURL (String codeArchivage, int anneePublication, String titre,
          String auteurPrincipal,String URL,String description){
        
        super(codeArchivage,anneePublication,titre,auteurPrincipal);
        this.URL = URL;
        this.description = description;
        this.type ="URL";
    }
    
    public String getURL(){
        return URL;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String toString(){
        return " Code " + codeArchivage + " description: " + " URL: " + URL +  description;
    }
    
}
