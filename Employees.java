import javax.swing.JOptionPane;
public class Employees 
{
	private String fname;
	private String lname;
	private DateClass birth;
	private DateClass hireDate;

	public Employees(String fn,String ln,DateClass p1,DateClass p2)
	{
		fname=fn;
		lname=ln;
		birth=p1.setDate;
		hireDate=p2;
	}

	public void showData()
	{
		String message;
		message="First Name: "+fname+"\nLast Name: "+lname+"\n"+
		        "Birth date: "+birth+"\nHireDate: "+hireDate;
		JOptionPane.showMessageDialog(null,message);
	}
}