import java.io.*;

public class CONVERT
{
    public boolean aoAddition;
    public boolean aoSubtraction;
    public boolean aoMultiplication;
    public boolean aoDivision;
    public int bracketDepht;
    public int Substitutions;
    public int Digits;
    public boolean justPositive;
    public boolean withFraction;
    String[] Parameters;
    public CONVERT()
    {
        CHOOSER Chooser = new CHOOSER();
        try {
                Parameters = Chooser.parseFile();
            }
        catch (Exception e) 
            {
                System.out.println(e);
            }
        this.parseArray(Parameters);
    }

    public void parseArray(String Parameters[])
    {
        aoAddition = Boolean.parseBoolean(Parameters[0]);
        aoSubtraction = Boolean.parseBoolean(Parameters[1]);
        aoMultiplication = Boolean.parseBoolean(Parameters[2]);
        aoDivision = Boolean.parseBoolean(Parameters[3]);
        bracketDepht = Integer.parseInt(Parameters[4]);
        Substitutions = Integer.parseInt(Parameters[5]);
        Digits = Integer.parseInt(Parameters[6]);
        justPositive = Boolean.parseBoolean(Parameters[7]);
        withFraction = Boolean.parseBoolean(Parameters[8]);
    }
}
