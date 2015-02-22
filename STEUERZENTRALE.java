/**
 * Die Klasse STEUERZENTRALE ist die ausführende bzw. Anweisung gebende Klasse des Termgenerators.
 * 
 * @author (Kilian Steinberg)
 * @version (15/02/22)
 */
public class STEUERZENTRALE
{
    ERGEBNIS erster=new ABSCHLUSS();
    public STEUERZENTRALE()
    {
    }

    /**
     * Die Methode fügt eine Zahl in den Ergebnisspeicher ein.
     * 
     * @param erg ist das Ergebnis welches abgespeichert wird.
     */
    private void ErgebnisEinfuegen(double erg)
    {
        erster=erster.ErgebnisEinfuegen(erg);   
    }
<<<<<<< HEAD
    
=======

    /**
     * Method randTermKlasse
     *
     *Eine Unterklasse von TERM wird zufällig ausgewählt, mit welcher anschließend gearbeitet werden kann.
     *
     * @return eine der Klassen SUMME, DIFFERENZ, PRODUKT und DIVISION
     */
>>>>>>> origin/master
    public TERM randTermKlasse()
    {
        TERM k;
        int r=(int)(5*Math.random()+1);
        if(r==1)
        { 
            k= new SUMME();
            return k;

        }
        else if (r==2)
        { 
            k= new DIFFERENZ();
            return k;
        }
        else if (r==3)
        { 
            k= new PRODUKT();
            return k;
        }
        else
        { 
            k= new DIVISION();
            return k;

        }
    }

    /**
     * Method fRandTerm
     * Erstellt einen zufällig generierten Term mit einem zufälligen Ergebnis und der Klammertiefe 2.
     *
     * @return Term
     */
    public String fRandTerm()
    {
        TERM k=this.randTermKlasse();
        String term;

        term =k.RandTerm();
        this.ErgebnisEinfuegen(k.Ergebnis());
        return term ;

    }

    /**
     * Method ErgebnisPruefen
     *Vergleicht das Ergebnis des Benutzers mit dem richtigen mit dem ältesten ungelösten Ergebnis
     *
     * @param erg Ergebnis des Benutzers
     * @return eine Antwort: "Richtig" oder "Falsch" je nach dem ob das Ergebnis richtig war
     */
    public String ErgebnisPruefen(double erg)
    {
        String antwort;
        if(erg==this.erster.ErgebnisPruefen())
            antwort="Richtig!";
        else if(this.erster.ErgebnisPruefen()==(-1))
            antwort="Keine Aufgabe";
        else
            antwort="Falsch!";

        return antwort;
    }

    /**
     * Method showErster zeigt das erste abgespeicherte Ergebnis
     *
     * @return Das zuerst abgespeicherte Ergebnis.
     */
    public ERGEBNIS showErster()
    {
        return erster;
    }

    /**
     * Method KlammerTerm
     *Generiert einen zufälligen Term mit beliebiger Klammertiefe
     *
     * @param klammertiefe die Gewünschte Klammertiefe (z.B. 1 -> eine Zahl; 2 -> a+b)
     * @return Term
     */
    public  String KlammerTerm(int klammertiefe)
    {
        return TermKlammertiefe(klammertiefe,0,true);
    }

    /**
     * Method TermKlammertiefe
     * Erzeugt einen Term mit gewünschter Klammertiefe und wahlweise für ein gewünschtes Ergebnis.
     *
     * @param klammertiefe die gewünschte Klammertiefe
     * @param erg ein Ergebnis welches Rekursiv in einen Term zerlegt werden kann
     * @param start gibt an ob dies der fertige Term oder nur ein Zwischenterm dessen ist
     * @return Term
     */
    public String TermKlammertiefe(int klammertiefe, double erg, boolean start)
    {
        TERM b=this.randTermKlasse();
        String term;
        RANDOM f=new RANDOM();
        double lösung=f.getErgebnis();
        if (start==false)
        // Wenn start = false ist, dann wird der parameter erg in einen weiteren Term aufgespalten
        {lösung=erg;
            term =b.TermKlammertiefe(klammertiefe,lösung);
            return term ;
        }
        else
        /*
         * Wenn start = true ist, dann wird das Ergebnis abgespeichert.
         * Somit wird sichergestellt, dass nur das Endergebnis abgespeichert wird.
        */
        {
            term =b.TermKlammertiefe(klammertiefe,lösung);
            this.ErgebnisEinfuegen(b.Ergebnis());
            return term ; 
        }

    }
    
    /** Method gibEins
     * Testmethode; macht aus einem String ein char array.
     * 
     * @return char array
     */
    public char[] gibEins()
    {
        String hello = "Hello";
        char[] chars = KlammerTerm(3).toCharArray();
        return chars;
    }
}
