import java.util.regex.*;
public class test
{
    public test()
    {
    }
    public void regex(String a)
    {
        String term="((\\(*\\-?)?\\d+\\)*[//*|///|//+|//-])+\\d+\\)*";
        Pattern pattern = Pattern.compile(term);
        Matcher matcher = pattern.matcher(a);
        if(matcher.matches())
            System.out.println("richtig");
    }
}
