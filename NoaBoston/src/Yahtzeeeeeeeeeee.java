import javax.swing.JOptionPane;
public class Yahtzeeeeeeeeeee 
{
// REMEMBER: The program must roll 13 times for each player --> total of 26 rolls
public static String showTotalScore (String[] names, String[] scorename, int topBonus, int[][] scores, String[][] usedflag, String[] msgs, int playerNum, int[] total)
{
	String rollString; 
	
	scorename[0] = "Aces";
	scorename[1] = "Twos";
	scorename[2] = "Threes";
	scorename[3] = "Fours";
	scorename[4] = "Fives";
	scorename[5] = "Sixes";
	scorename[6] = "3 of a kind";
	scorename[7] = "4 of a kind";
	scorename[8] = "Full House";
	scorename[9] = " Small straight";
	scorename[10] = "Large straight";
	scorename[11] = "Yahtzee";
	scorename[12] = "Chance";	   	   
	
	String catagories[] = {"Ones......", "Twos...... ", "Threes......", "Fours......", "Fives......", "Sixes......", "3 of a kind......", "4 of a kind......", "Full House......", "Small Straight......", "Large Straight......", "Yahtzee......", "Chance......"};             	   			   	   	 
	
	rollString ="\t\t  CURRENT SCORES " + "           Current Total = " + total[playerNum] +    " for player -- " + names[playerNum] + " TOP HALF BONUS --  " + topBonus +
			"\n" + scorename[0] + "\t\tscore is....." + scores[playerNum][0] + usedflag[playerNum][0] + "\n\t"+ scorename[1] + "score is....." + scores[playerNum][1] + usedflag[playerNum][1] +
			"\n" + scorename[2] + "\t\tscore is....." + scores[playerNum][2] + usedflag[playerNum][2] + "\n\t"+ scorename[3] + "score is....." + scores[playerNum][3] + usedflag[playerNum][3] + 
			"\n" + scorename[4] + "\t\tscore is....." + scores[playerNum][4] + usedflag[playerNum][4] + "\n\t"+ scorename[5] + "score is....." + scores[playerNum][5] + usedflag[playerNum][5] +
			"\n_______________________________________________________________________________________" +
			"\n" + scorename[6] + "  score is....." + scores[playerNum][6] + usedflag[playerNum][6] + "\n\t"+ scorename[7] + "  score is....." + scores[playerNum][7] + usedflag[playerNum][7]+ 
			"\n" + scorename[8] + "  score is....." + scores[playerNum][8] + usedflag[playerNum][8] + "\n\t"+ scorename[9] + "  score is....." + scores[playerNum][9] + usedflag[playerNum][9]+ 
			"\n" + scorename[10] + "  score is....." + scores[playerNum][10] + usedflag[playerNum][10]+ "\n\t"+ scorename[11] + "score is....." + scores[playerNum][11] + usedflag[playerNum][11] + 
			"\n" + scorename[12] + "  score is....." + scores[playerNum][12] + usedflag[playerNum][12] + 
			"\n";
	
	JOptionPane.showMessageDialog(null,rollString);
	return(rollString);   
} 

public static void main(String[] args)
{
	//6. Just a tip, variables should always be written with a lower case letter first "reRolled" instead of "ReRolled"
	// It's just common coding technique
	String RolledDie;
	String choose;
	String ReRolled;
	
	int d1, d2, d3, d4, d5;
	int topBonus;

	//1. This is called a 2D array. Think of them like a graph with an x and y coordinate and each point holds a value. In this case an integer
	int[][] score = new int[2][13];
	
	for (int i = 0; i < score.length; i++)
		for (int a = 0; a < score[i].length; a++)
			score[i][a] = 0;
	
	//7. 
	String[] players = new String[2];
	
	//2. This is how you create an object of a class so you can call its methods
	// You tried to create a roll method in this giant class but I'm tired so I'm using the one from Die class
	// This means you have to put both classes in the project file for it to work and when you turn it in turn in both
	Die die = new Die();
	
	players[0] = JOptionPane.showInputDialog(null, "Player 1's name: ");
	players[1] = JOptionPane.showInputDialog(null, "Player 2's name: " );                        
	
	
	int[] dice = new int[5];
	
	
	JOptionPane.showMessageDialog(null, "Player 1 Name:" + players[0]);
	JOptionPane.showMessageDialog(null, "Player 2 Name: " + players[1]);
	
	for (int i = 0; i < 13; i++)
	{
		for (int player = 0; player < 2; player++)
		{
			for (int x = 0; x < 5; x++)
			{
				dice[x] = die.roll();
			}
			
			RolledDie = "Which die would you like to roll? \nDie 1: " + dice[0] + " \n " + " Die 2: " + dice[1] + " \n " + " Die 3: " + dice[2] + " \n " + " Die 4: " + dice[3] + " \n " + " Die 5: " + dice[4] + " \n ";
			choose = JOptionPane.showInputDialog(null, RolledDie);
			 
			 //4. This was frustrating me because there was a semicolon after the for loop
			 // Instead it should have been a bracket
			 // I also changed the way that it reads the string of dice choices, instead of using characters I created strings for each letter in the string
			 // I then pass them into the if statements
			 for (int a = 0; a < choose.length(); a++)
			 {
				 ReRolled = choose.substring(a, a + 1);
				 
				 System.out.println(ReRolled);
				 
				 if (ReRolled.equals("1") )
				 {
					 dice[0] = die.roll();
				 }
				 
				 if (ReRolled.equals("2"))
				 {
					 dice[1] = die.roll();
				 }
			        		 
				 if (ReRolled.equals("3"))
				 {	
					 dice[2] = die.roll();		 
				 }
					
				 if (ReRolled.equals("4"))
				 {			 
					 dice[3] = die.roll();				 
				 }
				 
				 if (ReRolled.equals("5"))
				 {
					 dice[4] = die.roll();			 
				 }		 
			 }									
			 
			 RolledDie = "Which die would you like to roll? \nDie 1: " + dice[0] + " \n " + " Die 2: " + dice[1] + " \n " + " Die 3: " + dice[2] + " \n " + " Die 4: " + dice[3] + " \n " + " Die 5: " + dice[4] + " \n ";
			 choose = JOptionPane.showInputDialog(null, RolledDie);
			 
			 for (int a = 0; a < choose.length(); a++)
			 {
				 ReRolled = choose.substring(a, a + 1);
				 
				 System.out.println(ReRolled);
				 
				 if (ReRolled.equals("1") )
				 {
					 dice[0] = die.roll();
				 }
				 
				 if (ReRolled.equals("2"))
				 {
					 dice[1] = die.roll();
				 }
			        		 
				 if (ReRolled.equals("3"))
				 {	
					 dice[2] = die.roll();		 
				 }
					
				 if (ReRolled.equals("4"))
				 {			 
					 dice[3] = die.roll();				 
				 }
				 
				 if (ReRolled.equals("5"))
				 {
					 dice[4] = die.roll();			 
				 }		 
			 }
			 
			 //5. Not even quite sure what you were thinking with the saved array of integers, I deleted it
			 String rerollProduct;
			 rerollProduct = "\n" + players[player]
					 + "\n Dice 1:"  + dice[0]
							 + "\n Dice 2:"  + dice[1]
									 + "\n Dice 3:"  + dice[2]
											 + "\n Dice 4:"  + dice[3]
													 + "\n Dice 5:"  + dice[4];
					        
			 JOptionPane.showMessageDialog(null, rerollProduct);
			 
			 //showTotalScore(players, topBonus,);
			 
			 int index = 1, rollTotal = 0;
			 
			 switch (index) // the index is to organize the dice variables 
			 {
			 case 1: 
				 
				 for (int r = 0; r < 5; r++)
				 { 
					 if (dice[r] == 1)
					 {
						 rollTotal= rollTotal + dice[r];	
					 }
					 score[player][0] = rollTotal;
				 }
				 break;				      		      			 
			 
			 case 2:				        
				 for (int r = 0; r < 5;r++)
				 { 
					 if (dice[r] == 2)
					 {
						 rollTotal= rollTotal + dice[r];
					 }
				 }
				 score[player][1] = rollTotal;
				 break;				      	  
				 
			 case 3: 				        
				 for (int r = 0; r < 5;r++)
				 { 
					 if (dice[r] == 3)
					 {
						 rollTotal= rollTotal + dice[r];
					 }
				 }
				 
				 score[player][2] = rollTotal;      	    
				 break;
						      	
			 case 4: 
				 for (int r = 0; r < 5; r++)
				 { 
					 if (dice[r] == 4)
					 {
						 rollTotal= rollTotal + dice[r];      		     
					 }			 
				 }
				 score[player][3] = rollTotal;
				 break;
						      	
			 case 5: 				        
				 for (int r = 0; r < 5; r++)
				 { 
					 if (dice[r] == 5)
					 {   
						 rollTotal= rollTotal + dice[r];				 
					 }
				 }
				 score[player][4] = rollTotal;
				 break;
						      	
			 case 6: 				        
				 for (int r = 0; r < 5; r++)
				 { 
					 if (dice[r] == 6)
					 {
						 rollTotal= rollTotal + dice[r];				 
					 }
				 }
				 score[player][5] = rollTotal;
				 break;
						      	
			 case 7:		 
				 for (int r = 0; r < 5; r++)
				 { 
					 rollTotal= rollTotal + dice[r];	
					 
				 }
				 score[player][6] = rollTotal;;
				 break;  
							    
			 case 8:				        
				 for (int r = 0; r < 5; r++)
				 { 
					 rollTotal= rollTotal + dice[r];	
				 }
				 score[player][7] = rollTotal;;
				 break;        
						       
			 case 9:  
				 score[player][8]=25;
				 break;

			 case 10: 
				 score[player][9]=30;
				 break;

			 case 11: 
				 score[player][10]=40;
				 break;
				 
			 case 12: 
				 score[player][11]=50;
				 break;
						        
			 case 13:				        
				 for (int r=0; r<5;r++)
				 { 
					 rollTotal= rollTotal + dice[r];				 
				 }
				 score[player][12] = rollTotal;;
				 break;
						      		 
			 default: 
				 System.out.println(" Error occured while selecting a choice");
				 break;				        
			 }
			 for (int b = 0; b < score.length; b++)
			 {
				 for (int a = 0; a < score[b].length; a++)
					 System.out.print(score[b][a]);
				 System.out.println();;
			 }
		}
	}
	
					        		 	      
}

//3. Deleted the roll method, it would have worked in principle if you had the roll method doing anything
// See #2 for more

	public static String showTotalScore (String[] names, int topBonus, String[] scorename, int[][] scores, String[][] usedflag, int[] saveddice, String[] msgs, int playerNum, int[] total)			
	{
		String rollString;
					   	
		rollString ="\t\t  CURRENT SCORES " + "           Current Total = " + total[playerNum] +    " for player -- " + names[playerNum] + " TOP HALF BONUS --  " + topBonus +
				"\n" + scorename[0] + "\t\tscore is....." + scores[playerNum][0] + usedflag[playerNum][0] + "\n\t"+ scorename[1] + "score is....." + scores[playerNum][1] + usedflag[playerNum][1] +
				"\n" + scorename[2] + "\t\tscore is....." + scores[playerNum][2] + usedflag[playerNum][2] + "\n\t"+ scorename[3] + "score is....." + scores[playerNum][3] + usedflag[playerNum][3] + 
				"\n" + scorename[4] + "\t\tscore is....." + scores[playerNum][4] + usedflag[playerNum][4] + "\n\t"+ scorename[5] + "score is....." + scores[playerNum][5] + usedflag[playerNum][5] +
				"\n_______________________________________________________________________________________" +
				"\n" + scorename[6] + "  score is....." + scores[playerNum][6] + usedflag[playerNum][6] + "\n\t"+ scorename[7] + "  score is....." + scores[playerNum][7] + usedflag[playerNum][7]+ 
				"\n" + scorename[8] + "  score is....." + scores[playerNum][8] + usedflag[playerNum][8] + "\n\t"+ scorename[9] + "  score is....." + scores[playerNum][9] + usedflag[playerNum][9]+ 
				"\n" + scorename[10] + "  score is....." + scores[playerNum][10] + usedflag[playerNum][10]+ "\n\t"+ scorename[11] + "score is....." + scores[playerNum][11] + usedflag[playerNum][11] + 
				"\n" + scorename[12] + "  score is....." + scores[playerNum][12] + usedflag[playerNum][12] + 
				"\n";
		JOptionPane.showMessageDialog(null,rollString);
		return(rollString);
	}
}