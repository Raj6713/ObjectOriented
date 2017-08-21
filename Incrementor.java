
//This program will create a increment class will show how the increment
//works after initializing final static data member;
import javax.swing.JOptionPane;
public class Incrementor 
{
	private String message;
	private int number;
	private final int INCREMENT;
	public Incrementor(int n)
	{
		number=0;
		INCREMENT=n;
	}

	public void displayMessage(int i)
	{
		message="Total as shown: "+
		         Integer.toString(i)+" :"+
		        Integer.toString(number+=INCREMENT);
		JOptionPane.showMessageDialog(null,message);
	}
}