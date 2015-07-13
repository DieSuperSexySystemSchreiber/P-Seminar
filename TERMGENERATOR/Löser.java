
/**
 * Beschreiben Sie hier die Klasse Löser.
 * 
 * @author Morgan, Leon 
 * @version 11.06.2015
 */
import java.util.regex.*;
public class Löser
{
    public Löser()
    {
    }

    public double lösen(String term)
    {
        boolean t = Prüfer(term);
        if(t == false)
        return -0.000000000000000000000000000000001;
        term = "(" + term + ")";
        int u =1;
        
        String k ="\\d\\)*[\\+|\\-|\\*|\\/]";
        Pattern mattern = Pattern.compile(k);
        Matcher patcher = mattern.matcher(term);
        while(patcher.find())
        {
            patcher = mattern.matcher(term);
            patcher.find();
            System.out.println(patcher.group());
            String k1 = term.substring(0,patcher.end() - 1);
            String k2 = term.substring(patcher.end() - 1,patcher.end());
            String k3 = term.substring(patcher.end());
            term = k1 + "l)" + k2 + "(" + k3;
            u++;
        }
        
        String g = term;
        String[] part = g.split("l");
        String g1 = "";
        for(int n=0;n<u;n++)
        {
            g1 = g1 + part[n];
        }
        term = g1;
        String a = "\\(\\-?\\d+\\.?\\d*\\).\\(\\-?\\d+\\.?\\d*\\)";
        String f = "";
        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(term);
        matcher.find();
        
        while (matcher.find())
        {
            matcher = pattern.matcher(term);

            matcher.find();

            System.out.println(matcher.group());

            String b = term;
            String b1 = b.substring(0,matcher.start()); //take the part of the string whitch is not changed
            String b2 = b.substring(matcher.end());

            String c = matcher.group();
            String[] parts = c.split("\\(|\\)");
            String c1 = parts[1];
            String c2 = parts[2];
            String c3 = parts[3];
            double d1 = Double.parseDouble(c1);
            double d3 = Double.parseDouble(c3);
            String z = "+";
            String y = "-";
            String w = "*";
            String s = "/";
           if(z.equals(c2))
           {
                double e = (d1) + (d3);
                f = e + "";
            }
            else if(y.equals(c2))
            {
                double e = (d1) - (d3);
                f = e + "";
            }
            else if(w.equals(c2))
            {
                double e = (d1) * (d3);
                f = e + "";
            }
            else if(s.equals(c2))
            {
                double e = (d1) / (d3);
                f = e + "";
            }
            else
            {
                System.out.println("error");
                f= "";
                break;
            } 
            term= b1 + f + b2;
            matcher = pattern.matcher(term);
        }
        String yay = term.substring(1,term.length()-1);
        double awsome = Double.parseDouble(yay);
        return awsome;
    
    }

    public String entklammern(String term)
    {
        String a =  "\\(\\-?\\d+(\\.\\d+)?\\)"; // "[^\\+\\-\\*\\/]\\(\\-?\\d+(\\.\\d+)?)\\)|.\\(\\d+(\\.\\d+)?\\)";
        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(term);
        while (matcher.find())
        {

            matcher = pattern.matcher(term);   //set the new term

            matcher.find();   //search the pattern in the new term

            System.out.println(matcher.group());

            String b = term;
            String teil1 = b.substring(0,matcher.start()); //take the part of the string whitch is not changed
            String teil2 = b.substring(matcher.end());

            String string = matcher.group();
            String[] parts = string.split("\\(|\\)");
            term = teil1 + parts[1] + teil2;
            
           /** String ganzerString = matcher.group();
            String teilString1 = ganzerString .substring(0,1);  // delete the (
            String teilString2 = ganzerString .substring(1);  

            String string = teilString2;
            String[] parts = string.split("\\)"); // delete the )
            String part1 = parts[0]; 
            

            term= teil1 + teilString + part1 + teil2; // this put all together again */
        }

        /**          // pattern muss noch erstellt werden u.a

        a = "([^\\-\\*\\/]\\(\\d+.+(\\(\\-\\d+\\))|(\\d+)\\)[^\\*\\/])|([^\\+\\-\\/]\\(\\d+[\\*\\/](\\(\\-\\d+\\))|(\\d+)\\).)";
        pattern = Pattern.compile(a);
        matcher = pattern.matcher(term);

        while(matcher.find())
        {

        matcher = pattern.matcher(term);    //set the new term

        matcher.find();     //search the pattern in the new term

        System.out.println(matcher.group());

        String b = term;
        String teil1 = b.substring(0,matcher.start()); //take the part of the string
        //which is not changed
        String teil2 = b.substring(matcher.end());

        String ganzerString = matcher.group();
        String teilString1 = ganzerString .substring(0,1);  // delete the (
        String teilString2 = ganzerString .substring(2);  

        String string = teilString2;
        String parts = string.substring(0,string.length()-1);     //delete the )

        term=teil1+teilString1+parts+teil2;

        }
         */
        return term;

    }
    public boolean Prüfer(String l)
    {
        String prüfer="((\\(*\\-?)?\\d+\\)*[\\*|\\/|\\+|\\-])+\\d+\\)*";
        Pattern muster = Pattern.compile(prüfer);
        Matcher übereinstimmer = muster.matcher(l);
        if(übereinstimmer.matches())
        return true;
        else return false;
    }
}