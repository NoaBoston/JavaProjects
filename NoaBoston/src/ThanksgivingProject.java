import java.util.*;
public class ThanksgivingProject 
{
	public static void main(String args[])
	{
		int[] numbersBag = new int[1000];
		int numberOfChips = 0;
		
		ArrayList<Integer> averageValue = new ArrayList();
		
		Random generator = new Random();
		
		boolean foundNumber = false;
		
		for (int i = 0; i < 1000; i++) 
		{
			numbersBag[i] = generator.nextInt(1000);
		}
		
		for (int i = 0; i < 1000; i++)
		{
			if (!foundNumber) 
			{
				if (numbersBag[i] == 159)
				{
					foundNumber = true;
				} else
				{
					averageValue.add(numbersBag[i]);
					numberOfChips++;
				}
			}
		}
		//Determines whether the chip with 159 has been found
		if (!foundNumber)
		{
			System.out.print("The number 159 was not found.");
		} else 
		{
			System.out.println("The number 159 was found");
			System.out.println("It was found after pulling " + numberOfChips + " chips");
			System.out.println("The average of all the chips pulled is " + average(averageValue));
		}
	}
	//Averages all of the numbers that were not 159 as collected by the averageValue ArrayList
	public static int average(ArrayList<Integer> inputAverage)
	{
		int outputAverage = inputAverage.get(0);
		
		for (int i = 1; i < inputAverage.size(); i++)
		{
			outputAverage = (inputAverage.get(i) + outputAverage) / 2;
		}
		
		return outputAverage;
	}

}
