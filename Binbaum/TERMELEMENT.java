public abstract class TERMELEMENT
{
    public abstract void präfix();

    public abstract int gibHöhe();
    //public abstract TERMELEMENT sortiertEinfügen(OPERATOR e);

    public abstract int gibAnzahl();

    public abstract void setzeLinkerNaechster(TERMELEMENT newElement);

    public abstract void setzeRechterNaechster(TERMELEMENT newElement);

    public abstract boolean isAVL();

    public abstract String infix();
}
