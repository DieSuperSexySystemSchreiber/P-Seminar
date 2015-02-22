public class ERGEBNISSPEICHER extends ERGEBNIS
{
    double Ergebnis;
    int antwort=0;
    ERGEBNIS naechster=null;
    public ERGEBNISSPEICHER(double erg)
    {
        this.Ergebnis=erg;
    }
    
    public ERGEBNIS ErgebnisEinfuegen(double erg)
    {
        naechster=naechster.ErgebnisEinfuegen(erg);
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
