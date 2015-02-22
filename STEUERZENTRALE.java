/**
 * Die Klasse STEUERZENTRALE ist die ausführende bzw. Anweisung gebende Klasse des Termgenerators.
 * 
 * @author (Kilian Steinberg)
 * @version (15/02/20)
 */
public class STEUERZENTRALE
{
    ERGEBNIS erster=new ABSCHLUSS();
    public STEUERZENTRALE()
    {
    }
    
    /**
     * Die Methode fügt eine Zahl in den Ergebnisspeicher ein.
     * @param erster 
     */
    private void ErgebnisEinfuegen(double erg)
    {
        erster=erster.ErgebnisEinfuegen(erg);   
    }
    
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

    public String fRandTerm()
    {
        TERM k=this.randTermKlasse();
        String term;

        term =k.RandTerm();
        this.ErgebnisEinfuegen(k.Ergebnis());
        return term ;

    }
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

    public ERGEBNIS showErster()
    {
        return erster;
    }

    public  String KlammerTerm(int klammertiefe)
    {
        return TermKlammertiefe(klammertiefe,0,true);
    }

    public String TermKlammertiefe(int klammertiefe, double erg, boolean start)
    {
        TERM b=this.randTermKlasse();
        String term;
        RANDOM f=new RANDOM();
        double lösung=f.getErgebnis();
        if (start==false)
        {lösung=erg;
            term =b.TermKlammertiefe(klammertiefe,lösung);
            return term ;
        }
        else
        {
            term =b.TermKlammertiefe(klammertiefe,lösung);
            this.ErgebnisEinfuegen(b.Ergebnis());
            return term ; 
        }

        
    }

    public char[] gibEins()
    {
        String hello = "Hello";
        char[] chars = KlammerTerm(3).toCharArray();
        return chars;
    }
}
