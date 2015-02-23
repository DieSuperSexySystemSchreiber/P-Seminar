
import java.util.regex.*;
/**
 * Die Klasse test ist dazu da um Terme auf ihre Richtigkeit zu prüfen.
 * 
 * @author (Morgan Couapel & Kilian Steinberg)
 * @version (15/02/23)
 */
public class test
{

    public test()
    {
    }

    /**
     * Method regex
     * Prüft Terme in Form von Strings auf ihre syntaktische Richtigkeit
     * das heißt:
     * /t -Keine Doppelten Klammern "((" oder "))" bzw "()" oder ")("
     * /t -Keine Doppelten Rechenzeichen "+*"; "-*"; "//"; "**"; ...
     * /t -Keine Vermischung der anderen Fehler "(+("; "((++)))"; "*-/(+4"; ...
     * 
     * @param a Der zu überprüfende Term
     * @return true= keine Fehler im Term; false= Fehler im Term
     */
    public boolean regex(String a)
    {
        String term="((\\(*\\-?)?\\d+\\)*[*|/|+|-])+\\d+\\)*";
        Pattern pattern = Pattern.compile(term);
        Matcher matcher = pattern.matcher(a);
        if(matcher.matches())
            return true;
        else
            return false;

    }
    
    public boolean testOne()
    {
       STEUERZENTRALE k= new STEUERZENTRALE();
       return regex(k.fRandTerm());
       
    }
}

