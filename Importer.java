
//This java based program will show how the import works and will 
//output the results related to it.
import java.io.IOException;
import javax.swing.JOptionPane;
import static java.lang.Math.*;
public class Importer 
{
	public static void main(String[] args) throws IOException 
	{
		double num=9.8;
	   String message;
	   message="Square of  9.8: "+String.format("%.4f",pow(num,2));
	   JOptionPane.showMessageDialog(null,message);

	   message="Square root of 9.8: "+String.format("%.4f",sqrt(num));
	   JOptionPane.showMessageDialog(null,message);

	   message="Ceiling of 9.8: "+String.format("%.4f",ceil(num));
	   JOptionPane.showMessageDialog(null,message);

	   message="floor of 9.8: "+String.format("%.4f",floor(num));
	   JOptionPane.showMessageDialog(null,message);
	}
}