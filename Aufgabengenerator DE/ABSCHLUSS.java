

/**
 * Die Klasse ABSCHLUSS ist eine Hilfe für den ERGEBNISSPEICHER
 * 
 * @author (Kilian Steinberg)
 * @version (15/02/23)
 */
public class ABSCHLUSS extends ERGEBNIS
{
    public ABSCHLUSS()
    {
    }

    /**
     * Method ErgebnisEinfuegen
     * Erstellt einen neuen ERGEBNISSPEICHER mit einem bestimmten Ergebnis als Attribut
     *
     * @param erg Das Ergebnis welches eingefügt wird
     * @return neuer Speicher
     */
    public ERGEBNIS ErgebnisEinfuegen(double erg, String term)
    {
        ERGEBNISSPEICHER e=new ERGEBNISSPEICHER(erg, term);
        e.naechster=this;
        return e;
    }
    
    
    /**
     * Method ErgebnisPruefen
     * Sollte die Methode beim Abschluss ankommen ist kein Ergebnis verfügbar oder alle wurden bereits gelöst.
     *
     * @return -1 (Gibt es der Steuerzentrale zu erkennen)
     */
    public double ErgebnisPruefen()
    {
        return (-1);
    }
}
