package tp1;


public class Impot {
    public static double impot (double revenu) {
        double impot = 0;
        
        double t1 = 20000, t2= 40000, t3= 60000;    //T1, T2, T3 correspond aux tranches d'impots
        

        if(revenu >= 0)
        {  
            if(revenu <= t1)
            {
                impot = revenu * 0.05;
            }
            else
            {
                impot = t1 * 0.05;

                if(revenu <= t2)
                {
                    impot += (revenu - t1) *0.1;
                }
                else
                {
                    impot += t1*0.1;

                    if(revenu <= t3)
                    {
                        impot += (revenu - t2) *0.15;
                    }
                    else
                    {
                        impot += (t1*0.15) + (revenu- t3) * 0.3 ;
                    }           
                }
            }
        }

        return impot;

    // résultat = valeur de l'impôt calculée en fonction du revenu
    }
    
    public static void main(String[] args) {
        System.out.print("impot : ");
        System.out.println(impot(-57000));
    }
}