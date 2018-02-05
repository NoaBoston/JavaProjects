import javax.swing.JOptionPane;

public class PrintingScore 
{
	public static String printDiceChoice(int[][] inputPrinting, int numberPlayers, int[] inputDice, int playerNumber)
	{
		playerNumber++;
		String outputString;

		//printString is the ultimate ouput that is created through several steps and mulitple inputs
		String printString = "";
		String[] rowNames = {"Ones:           ", "Twos:           ", "Threes:         ", "Fours:          ", "Fives:           ", "Sixes:           ", "\nLower Total: ", "Bonus:          ", "Lower Total: ", "\nThree of a kind:  ", "Four of a kind:    ", "Full house:          ", "Small Straight:    ", "Large Straight:    ", "YAHTZEE:            ", "Chance:              ", "\nLower Total: ", "Upper Total: ", "Grand Total: "};
		
		//Creates an array with rownames and scores
		for (int i = 0; i < 19; i++)
		{
			for (int a = 0; a < numberPlayers; a++)
			{
				rowNames[i] = rowNames[i] + inputPrinting[a][i] + "      ";
			}
		}
		
		//Adds all of the strings together so I can use JOptionPane
		for (int i = 0; i < rowNames.length; i++)
		{
			printString = printString + rowNames[i] + "\n";
		}
		
		printString = printString + "\n	Which die would you like to roll? \n\nDice 1   Dice 2   Dice 3   Dice 4   Dice 5 \n   ";
		
		//Adds all of the dice values to the printString
		for (int i = 0; i < 5; i++)
		{
			printString = printString + inputDice[i] + "           ";
		}
		
		outputString = JOptionPane.showInputDialog(null, printString, "Player " + playerNumber, 1);
		return outputString;
	}
	//Adds numbers to make the categories easy to choose
	public static String printCategoryChoice(int[][] inputPrinting, int numberPlayers, int[] inputDice, int playerNumber, boolean[][] inputUsed)
	{
		playerNumber++;
		String outputString;
		
		//printString is the ultimate ouput that is created through several steps and mulitple inputs
		String printString = "0. No available scores\n";
		String[] rowNames = {"1. Ones: ", "2. Twos: ", "3. Threes: ", "4. Fours: ", "5. Fives: ", "6. Sixes: ", "\nLower Total: ", "Bonus: ", "Lower Total: ", "\n7. Three of a kind: ", "8. Four of a kind: ", "9. Full house: ", "10. Small Straight: ", "11. Large Straight: ", "12. YAHTZEE: ", "13. Chance: ", "\nLower Total: ", "Upper Total: ", "Grand Total: "};
		
		for (int i = 0; i < 19; i++)
		{
			for (int a = 0; a < numberPlayers; a++)
			{
				rowNames[i] = rowNames[i] + inputPrinting[a][i] + " ";
				
				if (inputUsed[a][i])
				{
					rowNames[i] = rowNames[i] + "-Used ";
				} else 
				{
					rowNames[i] = rowNames[i] + "      ";
				}
			}
		}
		
		for (int i = 0; i < rowNames.length; i++)
		{
			printString = printString + rowNames[i] + "\n";
		}
		
		printString = printString + "\n	What category do you choose? \n\nDice 1   Dice 2   Dice 3   Dice 4   Dice 5 \n   ";
		
		for (int i = 0; i < 5; i++)
		{
			printString = printString + inputDice[i] + "           ";
		}
		
		outputString = JOptionPane.showInputDialog(null, printString, "Player " + playerNumber, 1);
		return outputString;
	}
	public static void printFinal(int[][] inputPrinting, int numberPlayers)
	{
		//printString is the ultimate ouput that is created through several steps and mulitple inputs
		String printString = "";
		String[] rowNames = {"1. Ones: ", "2. Twos: ", "3. Threes: ", "4. Fours: ", "5. Fives: ", "6. Sixes: ", "\nLower Total: ", "Bonus: ", "Lower Total: ", "\n7. Three of a kind: ", "8. Four of a kind: ", "9. Full house: ", "10. Small Straight: ", "11. Large Straight: ", "12. YAHTZEE: ", "13. Chance: ", "\nLower Total: ", "Upper Total: ", "Grand Total: "};
		for (int i = 0; i < 19; i++)
		{
			for (int a = 0; a < numberPlayers; a++)
			{
				rowNames[i] = rowNames[i] + inputPrinting[a][i] + " ";
			}
		}
		for (int i = 0; i < rowNames.length; i++)
		{ 
			printString = printString + rowNames[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, printString);
	}
}
