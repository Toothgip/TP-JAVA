/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import tp6.*;
import tp5.*;

/**
 *
 * @author Thomas
 */
public interface Notifiable {
    
    public abstract void DocDisponible(DocLibrairie doc);
    
    public String getNom();
    public void retour();
    
    
    public void emprunt();

    public int getNumAbo();
    
    public String getTypeMembre();
    
    public boolean peutEmprunterAutreDocument();

    public int getnbDocEmprunt();

}
