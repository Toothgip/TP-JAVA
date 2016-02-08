package tp1;

public class Somme {
    
    public static void main(String[] args) {
        int Somme = 0;
        // calcule la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++)
        Somme = Somme + i;
        // affiche le résultat à l’écran
        System.out.println(Somme);
    }
}