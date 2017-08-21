/*This class will test Time class and show output*/
import java.io.IOException;
import javax.swing.JOptionPane;
public class TimerTest 
{
	public static void main(String[] args) throws IOException
	{
		Timer t=new Timer();
		String input;
		input=JOptionPane.showInputDialog("Enter time: ");
		t.setTime(Integer.parseInt(input.split(" ")[0]),
                  Integer.parseInt(input.split(" ")[1]),
			      Integer.parseInt(input.split(" ")[2]));
	    t.displayMessage();
	}
}