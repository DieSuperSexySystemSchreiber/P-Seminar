import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

public class CHOOSER
{
    public File F;
    private String[] Values = new String[9];
    public CHOOSER()
    {

    }

    public File getConfigFile()
    {
        JFileChooser Chooser = new JFileChooser();
        FileFilter Filter = new FileNameExtensionFilter("Textdatei", "txt");
        Chooser.setFileFilter(Filter);
        int rueckgabeWert = Chooser.showOpenDialog(null);
        if(rueckgabeWert == JFileChooser.APPROVE_OPTION)
        {
            F = Chooser.getSelectedFile();
        }
        return F;
    }

    public String[] parseFile() throws IOException
    {
        FileReader Reader = new FileReader(getConfigFile());
        BufferedReader Buffered = new BufferedReader(Reader);
        for ( int i = 0; i < 9; i++ )
         Values[i] = Buffered.readLine();
        return Values;
    }
}
