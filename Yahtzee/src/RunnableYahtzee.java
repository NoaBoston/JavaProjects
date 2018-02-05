import javax.swing.JOptionPane;

public class RunnableYahtzee 
{
	public static void main(String[] args) 
	{
		//Very important for function theoretically allows for an unlimited amount of players
		String numberPlayersString = JOptionPane.showInputDialog("How many players?");
		
		//Both of these hold outputs from printing that are passed into different classes as strings and processed later
		String diceChoice;
		String scoreChoice;		
		
		int numberPlayers = Integer.parseInt(numberPlayersString);		
		
		//Both the die and the score are stored in 2D arrays with the first row corresponding to a player
		int[][] playerDice = new int[numberPlayers][5];
		int[][] totalScore = new int[numberPlayers][19];	
		
		//Stores whether or not the player has used the category before
		boolean[][] categoryUsed = new boolean[numberPlayers][19];
		
		//Creates an empty array for scores that is dependent on the number of players
		for (int i = 0; i < totalScore.length; i++)
			for (int a = 0; a < totalScore[i].length; a++)
				totalScore[i][a] = 0;	
		
		//Creates an entirely false array to store category choices
		for (int i = 0; i < categoryUsed.length; i++)
			for (int a = 0; a < categoryUsed[i].length; a++)
				categoryUsed[i][a] = false;
		
		//Thirteen turns each to fill each category
		for (int i = 0; i < 13; i++)
		{
			//Once again built for many players executes a simplified turn by player
			for (int a = 0; a < numberPlayers; a++)
			{
				//Initial Roll returns an array of five numbers, representing the die
				playerDice[a] = YahtzeeDie.initialRoll();
				
				//Dice choice presents a window with an input for dice they would like to roll
				diceChoice = PrintingScore.printDiceChoice(totalScore, numberPlayers, playerDice[a], a);
				
				//Middle of turn uses YahtzeeDie.replaceRoll method to change dice depending on input
				playerDice[a] = YahtzeeDie.replaceRoll(playerDice[a], diceChoice);
				diceChoice = PrintingScore.printDiceChoice(totalScore, numberPlayers, playerDice[a], a);
				
				//Category choice presents a window with an input for where they would like score their dice
				playerDice[a] = YahtzeeDie.replaceRoll(playerDice[a], diceChoice);
				scoreChoice = PrintingScore.printCategoryChoice(totalScore, numberPlayers, playerDice[a], a, categoryUsed);
				
				//Sends the 2D array for score into Scorekeeping class for calculation
				categoryUsed = ScoreKeeping.used(scoreChoice, categoryUsed, a, numberPlayers, playerDice[a], totalScore);
				totalScore = ScoreKeeping.scores(playerDice[a], scoreChoice, totalScore, a);
			}
		}
		// Shows a final window w/o any input
		PrintingScore.printFinal(totalScore, numberPlayers);
	}
}