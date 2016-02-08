/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author P1501257
 */
public class conversion {
    

    
    public static void conversionMaj( char caractere)
    {
        if(caractere >= 'A' && caractere <= 'Z')
        {
          
            System.out.println("Le caractere minuscule correspondant à " + caractere   + " est " + (char)(caractere+32) );
     
        }
        else if(caractere >= 'a' && caractere <= 'z')
        {
            System.out.println("Le caractere Majuscule correspondant à " + caractere   + " est " + (char)(caractere-32) );
        }
        else
        {
            System.out.println(caractere + " n'est pas une lettre");
        }
    }
    
    
    public static void main(String[] args)
    {
        conversionMaj('2');
    }
    
    
    
}
