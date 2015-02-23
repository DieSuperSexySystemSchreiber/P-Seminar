
public class SUMME extends TERM
{
    double Ergebnis;
    public SUMME()
    {
    }

    public String ErgTerm(double erg)
    {
        String Term;
        double a;
        double b;
        double x;
        RANDOM r=new RANDOM();
        x=r.getRandom(erg);
        while(x>erg)
        x=r.getRandom(erg);
        a=erg - x;
        b=erg-a;
        
        this.Ergebnis=erg;
        
        Term=erg+"="+a+"+"+b;
        return Term;
    }
    
    public String RandTerm()
    {
        RANDOM r=new RANDOM();
        String Term=this.ErgTerm(r.getErgebnis());
        return Term;
    }
    
    public double Ergebnis()
    {
        return Ergebnis;
    }
    public String TermKlammertiefe(int klammertiefe, double erg)
    {
        if (klammertiefe>1)
        {String Term;
        double a;
        double b;
        double x;
        RANDOM r=new RANDOM();
        x=r.getRandom(erg);
        while(x>erg)
        x=r.getRandom(erg);
        a=erg - x;
        b=erg-a;
        
        this.Ergebnis=erg;
        
        STEUERZENTRALE k=new STEUERZENTRALE();
        Term="("+k.TermKlammertiefe(klammertiefe-1, a, false)+"+"+k.TermKlammertiefe(klammertiefe-1,b,false)+")";
        return Term;
    }
    else
    {
      String Term=erg+"";
      return Term;
    }
    }
}
