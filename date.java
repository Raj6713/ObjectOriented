
//This java class will take a date format  and will declare it as package
package falcon; 
import javax.swing.JOptionPane;
public class date 
{
	private int day;
	private int month;
	private int year;
	public date()
	{
		this.day=0;
		this.month=0;
		this.year=0;
	}
	public void setDate(int d,int m,int y)
	{
		year=y;
		month=checkMonth(m);
		day=checkDay(d);
	}

	private int checkMonth(int m)
	{
		if(m>0 && m<=12)
			return m;
		else 
			JOptionPane.showMessageDialog(null,"Month out of range set to 0");
		return 0;
	}

	private int checkDay(int d)
	{
		int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(d>=0 && d<days[month])
		return d;
		else
			JOptionPane.showMessageDialog(null,"Day out of range set to 0");
		return 0;
	}

   public String toString()
   {
   	return String.format("%d / %d / %d",day,month,year);
   }

}