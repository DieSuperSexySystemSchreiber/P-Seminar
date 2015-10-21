/**
 * Beschreiben Sie hier die Klasse Löser.
 * 
 * @author Morgan, Leon 
 * @version 21.10.2015
 */
import java.util.regex.*;
public class Löser
{
    TERM Fehlerhaft[] = new TERM[0];
    public Löser()
    {
          
    }

    public double lösen(String term)
    {
        boolean t = SyntaxPrüfer(term);
        if(t == false)
            return -0.000000000000000000000000000000001;
        String a =  "\\(\\-?\\d+(\\.\\d+)?\\)"; 
        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(term);
        while (matcher.find())
        {

            matcher = pattern.matcher(term);   //set the new term

            matcher.find();   //search the pattern in the new term

            System.out.println(matcher.group());

            term = term.substring(0,matcher.start())+term.substring(matcher.start()+1,matcher.end()-1)+term.substring(matcher.end());
        }
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
        a = "\\(\\-?\\d+\\.?\\d*\\).\\(\\-?\\d+\\.?\\d*\\)";
        String f = "";
        pattern = Pattern.compile(a);
        matcher = pattern.matcher(term);
        while(matcher.find())
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
        String a =  "\\(\\-?\\d+(\\.\\d+)?\\)"; 
        Pattern pattern = Pattern.compile(a);
        Matcher matcher = pattern.matcher(term);
        while (matcher.find())
        {

            matcher = pattern.matcher(term);   //set the new term

            matcher.find();   //search the pattern in the new term

            System.out.println(matcher.group());

            term = term.substring(0,matcher.start())+term.substring(matcher.start()+1,matcher.end()-1)+term.substring(matcher.end());
        }
        // pattern muss noch erstellt werden u.a
        a = "\\+\\(+\\-?\\d+(\\.\\d\\d)?[\\+|\\-|\\*|\\/]\\-?\\d+(\\.\\d\\d)?\\)+[\\+\\-]|[\\+|\\*|\\/]\\(+\\-?d+(\\.\\d\\d)?[\\*|\\/]\\-?\\d+(\\.\\d\\d)?\\)+[\\+|\\-|\\*|\\/]";
        // +(Z+/-/*//Z)+/-                                                               +/*//(Z*//Z)+/-/*//
        term = "+"+term+"+";
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
            String teilString1 = term.substring(matcher.start(),matcher.start()+1);  // delete the (
            String teilString2 = term.substring(matcher.start()+2,matcher.end()-2);
            String teilString3 = term.substring(matcher.end()-1,matcher.end());
            term=teil1+teilString1+teilString2+teilString3+teil2;
            matcher = pattern.matcher(term);
        }
        term = term.substring(1,term.length()-1);

        return term;

    }

    public boolean SyntaxPrüfer(String l)
    {
        String prüfer="(\\(*\\-?\\d+(\\.\\d+)?\\)*[\\*|\\/|\\+|\\-])+\\(*\\-?\\d+(\\.\\d+)?\\)*";
        Pattern muster = Pattern.compile(prüfer);
        Matcher übereinstimmer = muster.matcher(l);
        if(übereinstimmer.matches())
            return true;    
        else return false;
    }

    public boolean massentester(int anzahl,boolean aoAddition,boolean aoSubstraction,boolean aoMultiplication, boolean aoDivision,int bracketDepth, int substitutions, int digits, boolean oPositive, boolean wFraction)
    {
        boolean geht = true;
        String r;
        TERM Fehlerhatig[];
        int zähler=0;
        for(int y=0;y<anzahl;y++)
        {
            TERM h =new TERM(aoAddition, aoSubstraction, aoMultiplication, aoDivision, bracketDepth, substitutions, digits, oPositive, wFraction);
            String c = h.result+"="+h.wurzel.infix();
            String[] parts = c.split("\\=");
            String e = parts[0];
            double f = Double.parseDouble(e);
            String t = parts[1];
            
            if(f != this.lösen(t))
            {
                if(zähler==0)
            {
                Fehlerhaft = new TERM[1];
                Fehlerhaft[0] = h;
                zähler++;
                geht =false;
            }
            else
            {
                
                TERM Fehlerhaftig[] = new TERM[zähler];
                for(int x=0;x<zähler;x++)
                {
                    Fehlerhaftig[x] = Fehlerhaft[x];
                }
                Fehlerhaft = new TERM[zähler+1];
                for(int x=0;x<zähler;x++)
                {
                    Fehlerhaft[x] = Fehlerhaftig[x];
                }
                Fehlerhaft[zähler]=h;
                zähler++;
            }
        }
        }
        return geht;
    }

}