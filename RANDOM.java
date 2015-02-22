
public class RANDOM {

    
    
    
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
    
    public double getErgebnis() {
        double rand=Math.random()*(10|100|1000);
        
        rand=rand-rand%1;
        return rand;
    }
    
}