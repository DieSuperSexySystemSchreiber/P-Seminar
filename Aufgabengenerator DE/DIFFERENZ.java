public class DIFFERENZ extends TERM
{
    double Ergebnis;
    public DIFFERENZ()
    {
       
    }

    public String ErgTerm(double erg)
    {
        double a;
        double b;
        
        RANDOM r=new RANDOM();
        b=r.getRandom(erg);
        a=erg+b;
        
         this.Ergebnis=erg;
         
        String Term=erg+"="+a+"-"+b;
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
        
        RANDOM r=new RANDOM();
        b=r.getRandom(erg);
        a=erg+b;
        
         this.Ergebnis=erg;
        
        STEUERZENTRALE k=new STEUERZENTRALE();
        Term="("+k.TermKlammertiefe(klammertiefe-1, a, false)+"-"+k.TermKlammertiefe(klammertiefe-1,b,false)+")";
        return Term;
    }
    else
    {
      String Term=erg+"";
      return Term;
    }
    }
}
