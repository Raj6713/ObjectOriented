
//This class will declare date and will show the working of it
import javax.swing.JOptionPane;
public class DateClass 
{
	private int day,month,year;
	public DateClass(int d,int m,int y)
	{ 
		year=y;
		month=checkMonth(m);
		day=checkDay(d);
		
	}

   public int checkMonth(int m)
   {
   	if(m>0 && m<=12)
   	return m;
    else
   JOptionPane.showMessageDialog(null,"Month is not valid");
   return 1;
   }

   public int checkDay(int d)
   {
     int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
     if(d>0 && d<days[month])
     return d;
     else
     JOptionPane.showMessageDialog(null,"Day is not valid");
     return 1;
   }

   public String toString()
   {
   	return String.format("%d / %d / %d",day,month,year);
   }

   
}