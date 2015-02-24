/**
 * The class STEUERZENTRALE (control center) is the executive class of the term generator.
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
     * This method adds a number to the result memory.
     * 
     * @param erg is the result which is beeing saved.
     */
    private void ErgebnisEinfuegen(double erg)
    {
        erster=erster.ErgebnisEinfuegen(erg);   
    }

    /**
     * Method randTermKlasse
     *
     *A subclass of TERM is randomly choosen, with which the program works.
     *
     * @return a class SUMME (sum), DIFFERENZ (difference) , PRODUKT (product) and DIVISION
     */

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
     * Creates a random generated term with a random result and a nesting depth of 2.
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
     * Compairs the users' result with the oldest, right and unsolved result.
     *
     * @param erg The users' result
     * @return an answer: "Right" or "Wrong", depending on whether the result is correct.
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
     * Method showErster shows the saved result.
     *
     * @return The first saved result.
     */
    public ERGEBNIS showErster()
    {
        return erster;
    }

    /**
     * Method KlammerTerm
     * Generates a random term with a random nesting depth.
     *
     * @param klammertiefe The required nesting depth (e.g. 1 -> one number; 2 -> a+b)
     * @return Term
     */
    public  String KlammerTerm(int klammertiefe)
    {
        return TermKlammertiefe(klammertiefe,0,true);
    }

    /**
     * Method TermKlammertiefe
     * Generates a term with the required nesting depth and an (optional) result.
     *
     * @param klammertiefe The required nesting depth.
     * @param erg A result which can be decomposed recursively into a term.
     * @param start Tells you if this is the final or a intermediate term.
     * @return Term
     */
    public String TermKlammertiefe(int klammertiefe, double erg, boolean start)
    {
        TERM b=this.randTermKlasse();
        String term;
        RANDOM f=new RANDOM();
        double lösung=f.getErgebnis();
        if (start==false)
        // If start = false, the parameter erg is beeing split into another term.
        {lösung=erg;
            term =b.TermKlammertiefe(klammertiefe,lösung);
            return term ;
        }
        else
        /*
         * If start = true ist, the result is beeing saved.
         * This ensures that only the final result will be saved.
        */
        {
            term =b.TermKlammertiefe(klammertiefe,lösung);
            this.ErgebnisEinfuegen(b.Ergebnis());
            return term ; 
        }

    }
    
    /** Method gibEins
     * Testmethod; modifies String to char array.
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
