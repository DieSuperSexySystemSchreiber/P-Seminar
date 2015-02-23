public class ERGEBNISSPEICHER extends ERGEBNIS
{
    String Term;
    double Ergebnis;
    
    int antwort=0;
    ERGEBNIS naechster=null;
    public ERGEBNISSPEICHER(double erg, String term)
    {
        this.Ergebnis=erg;
        this.Term=term;
    }
    
    public ERGEBNIS ErgebnisEinfuegen(double erg, String term)
    {
        naechster=naechster.ErgebnisEinfuegen(erg, term);
        return this;
    }
    
    public double ErgebnisPruefen()
    {
        if (antwort==1)
        return naechster.ErgebnisPruefen();
        else
        {
            this.antwort=1;
            return Ergebnis;
        }
        
    }
}
