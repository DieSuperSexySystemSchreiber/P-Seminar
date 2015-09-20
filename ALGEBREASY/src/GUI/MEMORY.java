
public class MEMORY
{
    private String Exercise;
    private MEMORY Next;

    public MEMORY()
    {
    }

    public String readExercise()
    {
        return Exercise;
    }
    
    public MEMORY returnNext()
    {
        return Next;
    }
    
    public void writeExercise(String K)
    {
        Exercise = K;
    }
    
    public void setNext(MEMORY N)
    {
        Next = N;
    }
}
