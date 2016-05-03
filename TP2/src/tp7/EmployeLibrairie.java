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
public class EmployeLibrairie implements Notifiable {
    
    private String id, nom, typeMembre;
    
    public EmployeLibrairie(String id, String nom)
    {
        this.id = id;
        this.nom = nom;
        typeMembre = "Employé librairie";
    }
    
    public void DocDisponible(DocLibrairie doc)
    {
        System.out.println("Le document " + doc.getTitre() + " est maintenant Indisponible");
        doc.setEtat("Indisponible");
    }


    public String getNom() {
        return nom;
    }


    public void retour() {
        
    }

    @Override
    public void emprunt() {

    }

    @Override
    public int getNumAbo() {
        return 0;
    }

    @Override
    public String getTypeMembre() {
        return typeMembre;
    }
    
    public boolean peutEmprunterAutreDocument() {
        return true; 
    }

    public int getnbDocEmprunt() {
        return 0;
    }
    
    
    
    
    
}
