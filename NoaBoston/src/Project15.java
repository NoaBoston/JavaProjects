import java.util.Random;
import javax.swing.*;
public class Project15 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		int[] searchableArray = new int[1000];
		boolean linearFound = false, binaryFound = false;
		int numbersBinary = 0, numbersLinear = 0, checkNumber;
		String checkNumberString;
		
		checkNumberString = JOptionPane.showInputDialog("What number would you like to check for?");
		checkNumber = Integer.parseInt(checkNumberString);
		
		for (int i = 0; i < searchableArray.length; i++)
		{
			searchableArray[i] = generator.nextInt(10000);
		}
		
		for (int i = 0; i < searchableArray.length; i++)
		{
			for (int o = i + 1; o < searchableArray.length; o++)
				{
					if (searchableArray[i] > searchableArray[o])
					{
						int holder = searchableArray[i];
						searchableArray[i] = searchableArray[o];
						searchableArray[o] = holder;
					}
				}
		}
		
		for (int i = 0; i < searchableArray.length; i++)
		{
			if (searchableArray[i] == checkNumber)
			{
				i = i + 10000;
				linearFound = true;
			} else
			{
				numbersLinear++;
			}
		}
		
		if (searchableArray[500] > checkNumber)
		{
			for(int i = 0; i <= 500; i++)
			{
				if (searchableArray[i] == checkNumber)
				{
					i = i + 10000;
					binaryFound = true;
				} else
				{
					numbersBinary++;
				}
			}
		} else
		{
			for(int i = 500; i < 1000; i++)
			{
				if (searchableArray[i] == checkNumber)
				{
					i = i + 10000;
					binaryFound = true;
				} else
				{
					numbersBinary++;
				}
			}
		}
		
		printer(linearFound, "linear", numbersLinear, checkNumber);
		printer(binaryFound, "binary", numbersBinary, checkNumber);
		
		
	}
	
	public static void printer(boolean wasFound, String printerString, int numberPrinter, int checkPrinter)
	{
		if (wasFound)
		{
			System.out.println("The number " + checkPrinter + " was found. The " + printerString + " search found it after checking " + numberPrinter + " numbers");
		} else
		{
			System.out.println("The number " + checkPrinter + " was not found, the " + printerString + " did not find it after checking " + numberPrinter + " numbers");
		}
		
		System.out.println();
	}

}
