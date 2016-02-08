package tp1;


public class Impot {
    public static double impot (double revenu) {
        double impot = 0;

        if(revenu >= 0)
        {  
            if(revenu <= 20000)
            {
                impot = revenu * 0.05;
            }
            else
            {
                impot = 20000 * 0.05;

                if(revenu <= 40000)
                {
                    impot += (revenu - 20000) *0.1;
                }
                else
                {
                    impot += 20000*0.1;

                    if(revenu <= 60000)
                    {
                        impot += (revenu - 40000) *0.15;
                    }
                    else
                    {
                        impot += (20000*0.15) + (revenu- 60000) * 0.3 ;
                    }           
                }
            }
        }

        return impot;

    // résultat = valeur de l'impôt calculée en fonction du revenu
    }
    
    public static void main(String[] args) {
        System.out.print("impot : ");
        System.out.println(impot(57000));
    }
}