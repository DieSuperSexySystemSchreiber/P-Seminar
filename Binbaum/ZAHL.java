public class ZAHL extends TERMELEMENT
{
    private int number;
    private final int NAN=Integer.MAX_VALUE;
    
    public ZAHL(int i)
    {
        number=i;
        
    }
    
    public ZAHL()
    {
        number=NAN;
    }
    
    public void präfix()
    {
    }
    
    
    public int gibHöhe() {
        return -1;
    }
    
    public TERMELEMENT sortiertEinfügen(char e) 
    {
        DATENKNOTEN dk=new DATENKNOTEN(e);
        
        dk.setzeLinkerNaechster(this);
        dk.setzeRechterNaechster(new ZAHL());
        
        return dk;
    }
    
    public int gibAnzahl() {
        return 0;
    }
    
    
    public void setzeLinkerNaechster(TERMELEMENT k) {
    }
    public void setzeRechterNaechster(TERMELEMENT k) {
    }
    
    public boolean isAVL()
    {
        return true;
    }
    
    public String infix()
    {
        return "";
    }
}
