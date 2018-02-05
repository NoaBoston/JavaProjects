public class ScoreKeeping 
{	
	public static boolean[][] used(String inputChoiceString, boolean[][] inputUsed, int playerNumber, int numberPlayers, int[] inputDice, int[][] inputPrinting)
	{
		String lastCase;
		int inputChoice = Integer.parseInt(inputChoiceString);

		boolean[][] outputUsed;
		if (inputChoice == 0)
		{
			lastCase = PrintingScore.printCategoryChoice(inputPrinting, numberPlayers, inputDice, playerNumber, inputUsed);
			inputChoice = Integer.parseInt(lastCase);
			
		}
		
		switch(inputChoice)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			inputUsed[playerNumber][inputChoice - 1] = true;
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
			inputUsed[playerNumber][inputChoice + 2] = true;
			break;
		}
		
		outputUsed = inputUsed;
		return outputUsed;
	}
	public static int[][] scores(int[] inputDie, String inputChoiceString, int[][] inputScore, int playerNumber)
	{
		//Holder values for bonus and totals
		int lowerTotal = 0;
		int upperTotal = 0;
		int bonus = 0;
		
		//Determines how to score the input die set
		int inputChoice;
		inputChoice = Integer.parseInt(inputChoiceString);
		
		//Each case is modified to fit the array in the order it is displayed either -1 or +2
		switch (inputChoice)
		{
		//Cases 1-6 all have the same code that is contigent upon the input choice
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:	
			inputScore[playerNumber][inputChoice - 1] = 0;
			for (int i = 0; i < 5; i++)
			{
				if (inputDie[i] == inputChoice)
				{
					inputScore[playerNumber][inputChoice - 1] = inputScore[playerNumber][inputChoice - 1] + inputChoice;
				}
			}
			break;
		
		//Cases 7, 8, 13 all have the same method
		case 7:
		case 8:
		case 13:
			for (int i = 0; i < 5; i++)
			{
				inputScore[playerNumber][inputChoice + 2] = inputScore[playerNumber][inputChoice + 2] + inputDie[i]; 
			}
			break;
		
		case 9: 
			inputScore[playerNumber][inputChoice + 2] = 25;
			break;
		case 10:
			inputScore[playerNumber][inputChoice + 2] = 30;
			break;
		case 11:
			inputScore[playerNumber][inputChoice + 2] = 40;
			break;
		case 12:
			inputScore[playerNumber][inputChoice + 2] = 50;
			break;
		}
		
		// Choice 6 = Lower Total w/o bonus
		for (int i = 0; i < 6; i++)
		{
			lowerTotal = lowerTotal + inputScore[playerNumber][i];
		}
		
		inputScore[playerNumber][6] = lowerTotal;
		
		// Choice 7 = Bonus if Lower Total is greater than 63
		if (lowerTotal >= 63)
		{
			bonus = 35;
		}
		
		inputScore[playerNumber][7] = bonus;
		
		// Choice 8 = Lower Total w/ bonus
		if (bonus == 35)
		{
			inputScore[playerNumber][8] = lowerTotal + bonus;
		} else
		{
			inputScore[playerNumber][8] = lowerTotal;
		}
		
		// Choice 16 = Lower Total
		inputScore[playerNumber][16] = inputScore[playerNumber][8];
		
		// Choice 17 = Upper Total
		for (int i = 9; i < 16; i++)
		{
			upperTotal = upperTotal + inputScore[playerNumber][i];
		}
		
		inputScore[playerNumber][17] = upperTotal;
		
		// Choice 18 = Grand Total
		inputScore[playerNumber][18] = inputScore[playerNumber][16] + inputScore[playerNumber][17];
		
		//Returns the entire modified scoresheet
		int[][] outputScore = inputScore;
		return outputScore;
	}
}
