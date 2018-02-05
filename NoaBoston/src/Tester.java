import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.*;
public class Tester {

	public static void main(String[] args) throws AWTException 
	{
		String newString = "1abcdefghijklmnopqrstuvwxyz";
		newString = newString.substring(26);
		if (newString.equals("1"))
		{
			System.out.println("It workds");
		}
		System.out.print(newString);
		
	}

}
