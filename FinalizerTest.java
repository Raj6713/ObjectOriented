
//This class will show the working of the grabage collector and will
//show it on the screen.
import javax.swing.JOptionPane;
import java.io.IOException;
public class FinalizerTest 
{
	public static void main(String[] args) throws IOException
	{
	String message;
	message="Class member count before initialization: "+
	       Integer.toString(Finalizer.getCount());

    JOptionPane.showMessageDialog(null,message);
    Finalizer e1=new Finalizer("Raj","Kumar");
    Finalizer e2=new Finalizer("Only","Me");
    message="Count for emp1: "+Integer.toString(e1.getCount());
     JOptionPane.showMessageDialog(null,message);
    message="Count for emp2: "+Integer.toString(e2.getCount());
    JOptionPane.showMessageDialog(null,message);
    message="Class member count after initialization: "+
	       Integer.toString(Finalizer.getCount());
    JOptionPane.showMessageDialog(null,message);
    e1=null;
    e2=null;
   message="Count for emp1: "+Integer.toString(e1.getCount());
     JOptionPane.showMessageDialog(null,message);
    message="Count for emp2: "+Integer.toString(e2.getCount());
    JOptionPane.showMessageDialog(null,message);
    message="Class member count after initialization: "+
	       Integer.toString(Finalizer.getCount());
    JOptionPane.showMessageDialog(null,message);
    System.gc();
   }
}