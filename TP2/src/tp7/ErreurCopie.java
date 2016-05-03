/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import tp6.*;

/**
 *
 * @author Thomas
 */
public class ErreurCopie extends Exception {
    public ErreurCopie(int nb)
    {
        super("Le numero de copie est invalide suivant "+ nb);
    }
    
}
