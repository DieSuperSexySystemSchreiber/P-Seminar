
/**
 * The class RANDOM is responsible for a random number with a limited co-domain.
 * 
 * @author (Kilian Steinberg)
 * @version (15/02/22)
 */
public class RANDOM {
    
    /**
     * Method getRandom
     * Generates a random number in a similar co-domain as the result.
     * 
     * @param Ergebnis (result)
     * @return zufällige Zahl (random number)
     */ 
    public double getRandom(double erg) {
        double x=0;
             if(erg>=100000)
        x=1000000;
        else if(erg>=10000)
        x=100000;
        else if(erg>=1000)
        x=10000;
        else if(erg>=100)
        x=1000;
        else if(erg>=10)
        x=100;
        else if(erg>=1)
        x=10;
        else if(erg==0)
        x=0;
        double rand=Math.random()*(x);
        
        rand=rand-rand%1;
        return rand;
        
    }
    
    /**
     * Method getErgebnis
     * Generates a random number/ result with a natural co-domain between 10 and 9999.
     *
     * @return zufällige Zahl (random number)
     */
    public double getErgebnis() {
        double rand=Math.random()*(10|100|1000);
        
        rand=rand-rand%1;
        return rand;
    }
    
}