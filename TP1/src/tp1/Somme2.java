package tp1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P1501257
 */
public class Somme2 {
     
    
    public static int calculSomme()
    {
        int Somme = 0;
        // calcule la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++)
        Somme = Somme + i;
        // affiche le résultat à l’écran
        return Somme;
    }
    
    public static void main(String[] args)
    {
        System.out.println(calculSomme());
    }
    
    
       
}
