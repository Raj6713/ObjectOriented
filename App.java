import javax.swing.JLabel;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;
public class App extends JApplet 
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
             {
             	public void run()
             	{
             		JLabel lb1=new JLabel("Carpe diem");
             		add(lb1);
             	}
             }
				);

		}
		catch(Exception e)
		{
			System.err.println("Create GUI didnt complete succesfully");
	
        }
	}

}