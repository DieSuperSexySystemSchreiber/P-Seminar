
import java.util.regex.*;
/**
 * Die Klasse TESTER ist dazu da um Terme auf ihre Richtigkeit zu prüfen.
 * 
 * @author (Morgan Couapel & Kilian Steinberg)
 * @version (15/03/04)
 */
public class PRÜFER
{

    public PRÜFER()
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
        String term="((\\(*\\-?)?\\d+\\)*[\\*|\\/|\\+|\\-])+\\d+\\)*";
        Pattern pattern = Pattern.compile(term);
        Matcher matcher = pattern.matcher(a);
        if(matcher.matches())
            return true;
        else
            return false;

    }

    public boolean testReg()
    {
        STEUERZENTRALE k= new STEUERZENTRALE();
        return regex(k.KlammerTerm(3));
    }

    public String restLöschen(String Term)
    {
        char[] chars = Term.toCharArray();
        int counter=0;
        for(int N=0; N<chars.length; N++)
        {
            if (N<chars.length-1)
                if(chars[N]==chars[N+1] && (chars[N]=='+'|chars[N]=='('|chars[N]==')'))
                {
                    chars=PosEntfernen(N,chars);
                    N--;
                    counter++;
                }

        }
        
        
        
        char[] term=new char[chars.length-counter];
        for(int j=0;j<term.length;j++)
        {
            term[j]=chars[j];
        }
        return new String(term);
    }

    private char[] PosEntfernen(int Pos, char[] Liste)
    {   

        for (int a=Pos; a<Liste.length-1; a++)
        {

            Liste[a]=Liste[a+1];
        }
        Liste[Liste.length-1]='d';
        return Liste;
    }
}

