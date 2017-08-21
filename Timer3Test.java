
//This program will test the working of various constructors
import java.io.IOException;
public class Timer3Test 
{
	public static void main(String[] args)
	{
		Timer3 goodTimes1=new Timer3();
		Timer3 goodTimes2=new Timer3(10);
		Timer3 goodTimes3=new Timer3(10,12);
		Timer3 goodTimes4=new Timer3(10,45,54);
		Timer3 goodTimes5=new Timer3(goodTimes4);
		
		goodTimes1.displayMessage();
		goodTimes2.displayMessage();
		goodTimes3.displayMessage();
		goodTimes4.displayMessage();
		goodTimes5.displayMessage();
	}
}