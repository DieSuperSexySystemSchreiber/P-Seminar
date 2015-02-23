public class DIVISION extends TERM
{
    double Ergebnis;
    public DIVISION()
    {
    }

    public String ErgTerm(double erg)
    {
        double a;
        double b;
        double x;
        RANDOM r=new RANDOM();
        x=r.getRandom(erg);
        
        a=erg*x;
        b=x;
        
         this.Ergebnis=erg;
         
        String Term=erg+"="+a+"/"+b;
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
        {
            String Term;
        double a;
        double b;
        double x;
        RANDOM r=new RANDOM();
        x=r.getRandom(erg);
        
        a=erg*x;
        b=x;
        
         this.Ergebnis=erg;
        
        STEUERZENTRALE k=new STEUERZENTRALE();
        if (a*b==erg)
        {Term="("+k.TermKlammertiefe(klammertiefe-1, a, false)+"/"+k.TermKlammertiefe(klammertiefe-1,b,false)+")";
            return Term;}
        else
        return k.TermKlammertiefe(klammertiefe,erg,false);
        
    }
    else
    {
      String Term=erg+"";
      return Term;
    }
}
}
