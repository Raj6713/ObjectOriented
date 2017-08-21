
//This class will  show the working of the finalizer
import javax.swing.JOptionPane;
public class Finalizer 
{
	private String fname;
	private String lname;
	private static int count=0;
    private String message;
	public Finalizer(String f1,String l1)
	{
		fname=f1;
        lname=l1;
        count++;
        message="First Name: "+fname+
                "\nLast Name: "+lname+
                "\nCount: "+Integer.toString(count);
        JOptionPane.showMessageDialog(null,message);
	}

	protected void finalize()
	{
      count--;
      message="First Name: "+fname+
              "\nLast Name: "+lname+
              "\nCount: "+Integer.toString(count);
      JOptionPane.showMessageDialog(null,message);
	}

	public String getFName(){return fname;}
	public String getLName(){return lname;}
	public static int getCount(){return count;}
}