
//This class will call incrementor class and will apply the rules to
//output values.
import javax.swing.JOptionPane;
import java.io.IOException;
public class IncrementorTest 
{
	public static void main(String[] args) throws IOException
	{
		Incrementor inc=new Incrementor(5);
		String inp;
		inp=JOptionPane.showInputDialog("Enter how many times: ");
		for(int i=0;i<Integer.parseInt(inp);i++)
		{
			inc.displayMessage(i);
		}
	}
}