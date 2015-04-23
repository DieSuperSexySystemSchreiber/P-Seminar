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
    
    public void unterbäumeErstellen(int anz) {
        
    }
        
    public int gibHöhe() {
        return -1;
    }
    
    public TERMELEMENT sortiertEinfügen(OPERATOR e) 
    {
        DATENKNOTEN dk=new DATENKNOTEN(e);
        
        dk.setzeLinkerNaechster(this);
        dk.setzeRechterNaechster(new ZAHL());
        
        return dk;
    }
    public int gibAnzahl() {
        return 0;
    }
    
    public OPERATOR[] baumSortieren(int nr, OPERATOR[] liste) {
        return liste;
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
