

/**
 * The class ABSCHLUSS is an assistance for the ERGEBNISSPEICHER (result memory).
 * 
 * @author (Kilian Steinberg)
 * @version (15/02/22)
 */
public class ABSCHLUSS extends ERGEBNIS
{
    public ABSCHLUSS()
    {
    }

    /**
     * Method ErgebnisEinfuegen
     * Creates a new ERGEBNISSPEICHER with a certain result as an attribute.
     * @param erg The result which is beeing inserted.
     * @return new memory
     */
    public ERGEBNIS ErgebnisEinfuegen(double erg)
    {
        ERGEBNISSPEICHER e=new ERGEBNISSPEICHER(erg);
        e.naechster=this;
        return e;
    }
    
    
    /**
     * Method ErgebnisPruefen
     * If the method comes to an end, than there is no result or everything is beeing solved.
     *
     * @return -1 (A recognition for the control center)
     */
    public double ErgebnisPruefen()
    {
        return (-1);
    }
}
