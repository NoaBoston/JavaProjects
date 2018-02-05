import java.util.Random;

public class YahtzeeDie 
{	
	public static int[] initialRoll() 
	{
		int[] outputInitialRoll = new int[5];
		
		//Used to generate dice values
		Random generator = new Random();
		
		for (int i = 0; i < 5; i++)
		{
			//Since a die cannot equal zero it adds one to the actual value returned
			outputInitialRoll[i] = generator.nextInt(6) + 1; 
		}
		
		return outputInitialRoll;
	}
	public static int[] replaceRoll(int[] inputDie, String inputRoll)
	{
		Random generator = new Random();
		
		int dieChoice;
		int[] outputRoll = new int[inputDie.length];
		
		//Checks each character in the string
		for (int i = 0; i < inputRoll.length(); i++)
		{
			//Outputs an integer value for each character in the string
			dieChoice = Character.getNumericValue(inputRoll.charAt(i));
			
			//If the player input a number between 1 and 5 it rerolls the die at that number
			switch(dieChoice)
			{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				inputDie[dieChoice - 1] = generator.nextInt(6) + 1;
			}
		}
		
		outputRoll = inputDie;
		return outputRoll;
	}
}