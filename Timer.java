/*This class will create a time class and will show it on screen*/
import javax.swing.JOptionPane;
public class Timer 
{
	private String message;
	private int hour,minute,second;
	public Timer()
	{
		hour=minute=second=0;
		message="";
	}
	public void setTime(int hour,int minute,int second)
	{
		hour=((hour>=0)||(hour<24))?hour:0;
		minute=((minute>=0)||(minute<60))?minute:0;
        second=((second>=0)||(second<60))?second:0;
        System.out.printf("%d %d %d",hour,minute,second);
	}

	private String universalString()
	{
       message=Integer.toString(hour)+" : "+Integer.toString(minute)+" : "
                +Integer.toString(second);
       return message;        
	}

	private String localString()
	{
        message=Integer.toString((hour==0||hour==12)?hour:hour%12)+" : "+
                Integer.toString(minute)+" : "+
                Integer.toString(second)+" "+
                (hour<12?"AM":"PM");
        return message;
	}

	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,universalString());
		JOptionPane.showMessageDialog(null,localString());
	}
}