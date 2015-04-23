import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
import java.util.Date; 

public class DATE
{
    public static String getDate()
    {
        
        return Date();
    }
    public static String Date()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date currentDate = new Date();
        String s = formatter.format(currentDate);
        return s;
    }
}
