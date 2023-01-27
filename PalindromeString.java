import java.io.File;  
import java.util.Scanner;
import java.io.*;
class Main{
	public static void main(String[] args)
	{
		try
		{
			File myObj = new File("String.txt");
			Scanner myReader = new Scanner(myObj);
			String msg="";
			
			while (myReader.hasNextLine())
			{
				msg = myReader.nextLine().toUpperCase();
				//orignal.append(myReader.nextLine().toUpperCase());
			}
			StringBuilder orignal = new StringBuilder().append(msg);
			StringBuilder reverse = new StringBuilder().append(orignal).reverse();
			
			Boolean ans = (orignal.toString().equals(reverse.toString()))? true : false;
			
			System.out.println(ans);
			myReader.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}