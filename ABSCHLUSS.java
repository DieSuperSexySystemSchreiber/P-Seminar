

public class ABSCHLUSS extends ERGEBNIS
{
    public ABSCHLUSS()
    {
    }

    public ERGEBNIS ErgebnisEinfuegen(double erg)
    {
        ERGEBNISSPEICHER e=new ERGEBNISSPEICHER(erg);
        e.naechster=this;
        return e;
    }
    
    public double ErgebnisPruefen()
    {
        return (-1);
    }
}
