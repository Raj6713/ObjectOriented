
//This class will create a Library type and will show working of class library
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.EnumSet;
public class LibraryTest 
{
	public static void main(String[] args) throws IOException
	{
          System.out.println("All books in Library");
          for(Library book:Library.values())
          {
          	System.out.printf("%10s %10s %10s\n",book,book.getTitle(),book.getBookPub());
          }

         System.out.println("IT will print books within specified range");
          for(Library book:EnumSet.range(Library.JP1,Library.JP6))
          {
          	System.out.printf("%10s %10s %10s\n",book,book.getTitle(),book.getBookPub());
          }
	}
}