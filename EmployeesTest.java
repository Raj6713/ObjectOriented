
//This class will show the working of date and employees class
import javax.swing.JOptionPane;
import java.io.IOException;
public class EmployeesTest 
{
	public static void main(String[] args) throws IOException
	{
		DateClass d1=new DateClass(10,3,1997);
		DateClass d2=new DateClass(3,6,2017);
		Employees emp=new Employees("Raj","Kumar",d1,d2);
		emp.showData();
	}
}