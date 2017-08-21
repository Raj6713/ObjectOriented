
//This program shows working of the this verd in using time as an example
public class Timer2 
{
	private int hour,minute,second;
	public Timer2()
	{
		hour=minute=second=0;
	}
	public void setTime(int n1,int n2,int n3)
	{
		this.hour=n1;
		this.minute=n2;
		this.second=n3;
	}

	private void universalTime()
	{
		hour=((hour>=0)||(hour<24))?hour:0;
		minute=((minute>=0)||(minute<60))?minute:0;
		second=((second>=0)||(second<60))?second:0;
	}

	public void displayMessage()
    {
    	universalTime();
    	System.out.printf("Universal Time: %02d : %02d : %02d",hour,minute,second);
    }

}