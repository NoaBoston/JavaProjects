import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Yahtzee 
{	
	static int[] saveddice = new int[5];
	static String[] names = new String[5];
	static int[] total = new int[5];
	static String[] scorename = new String[19];
	static int[][] scores = new int[5][19];
	static String[][] usedflag = new String[5][19];
	static int playerNum;
	static int topBonus;
	static int rollTotal=0;
	static int angelOfSaving, s1, delta, echo, alpha;
	static String numberDieSave;
	static int sum1=0;
	public static void main(String[] args) 
	{
		Die die = new Die();
		String numPlayers, playerName;
		int numPlay;
		scorename[0]="Aces ";
		scorename[1]="Twos ";
		scorename[2]="Threes ";		
		scorename[3]="Fours ";
		scorename[4]="Fives ";
		scorename[5]="Sixes ";
		scorename[6]="Upper Subtotal ";
		scorename[7]="Bonus ";
		scorename[8]="Upper Grand Total ";
		scorename[9]="3 of a kind ";
		scorename[10]="4 of a kind ";
		scorename[11]="Full House ";
		scorename[12]="Small Straight ";
		scorename[13]="Large Straight ";
		scorename[14]="Yahtzee ";
		scorename[15]="Chance ";
		scorename[16]="Lower Grand Total ";
		scorename[17]="Grand Total ";
		for(int c=0;c<5;c++)
		{
			for(int l=0;l<19;l++)
			{
				usedflag[c][l]=" ";
			}
		}
		
	
		numPlayers=JOptionPane.showInputDialog("Please enter the number of player (1-6).");
		numPlay=Integer.parseInt(numPlayers);
		for(int x =0; x<numPlay ; x++)
		{
			playerName=JOptionPane.showInputDialog("please enter player " + (x+1) + "'s name");
			names[x]=playerName;
		}
		for(int turns = 0 ; turns < 13; turns++)
		{
			for(playerNum = 0; playerNum < numPlay; playerNum++)
			{
				String rollString;
				for(int handSet =0 ; handSet<=4; handSet++)
				{
					saveddice[handSet]=die.roll();
				}
				for(int y=0; y<2; y++)
				{
					
					topBonus = scores[playerNum][7];
					rollString=showTotalScore(topBonus, playerNum);
					for(int x=0;x<numberDieSave.length();x++)
					{
						s1=Integer.parseInt(numberDieSave.substring(x,x+1));
						saveddice[x]=saveddice[s1-1];
					}
					delta=5-numberDieSave.length();
					for(int z=0; z<delta;z++)
					{
						saveddice[z+numberDieSave.length()]=die.roll();
					}
				}
				rollString=finalRollOfTurn(topBonus, playerNum);
				echo=Integer.parseInt(rollString);
				scorer(echo);
				
				
			}
		}
	}
	
	
    	public static String showTotalScore (int topBonus, int playerNum)
	
    	{
    		String rollString;
    		
		   rollString =names[playerNum] + "'s turn has begun. " + names[playerNum] + " you are on the clock." + "\n" +
				   	   "\n\t\t  CURRENT SCORES " + "           Current Total = " + total[playerNum] +    " for player -- " + names[playerNum] + " TOP HALF BONUS --  " + topBonus +
	                   "\n" + scorename[0] + "score is....." + scores[playerNum][0] + usedflag[playerNum][0] + "\n"+ scorename[1] + "score is....." + scores[playerNum][1] + usedflag[playerNum][1] +
	                   "\n" + scorename[2] + "score is....." + scores[playerNum][2] + usedflag[playerNum][2] + "\n"+ scorename[3] + "score is....." + scores[playerNum][3] + usedflag[playerNum][3] + 
	                   "\n" + scorename[4] + "score is....." + scores[playerNum][4] + usedflag[playerNum][4] + "\n"+ scorename[5] + "score is....." + scores[playerNum][5] + usedflag[playerNum][5] +
	                   "\n_______________________________________________________________________________________" +
	                   "\n" + scorename[9] + "score is....." + scores[playerNum][9] + usedflag[playerNum][9] + "\n"+ scorename[10] + "score is....." + scores[playerNum][10] + usedflag[playerNum][10]+ 
	                   "\n" + scorename[11] + "score is....." + scores[playerNum][11] + usedflag[playerNum][11] + "\n"+ scorename[12] + "score is....." + scores[playerNum][12] + usedflag[playerNum][12]+ 
	                   "\n" + scorename[13] + "score is....." + scores[playerNum][13] + usedflag[playerNum][13]+ "\n"+ scorename[14] + "score is....." + scores[playerNum][14] + usedflag[playerNum][14] + 
	                   "\n" + scorename[15] +  "score is....." + scores[playerNum][15] + usedflag[playerNum][15] + 
	                   "\n_______________________________________________________________________________________" +
	                   "\n" + "Die one -------" + saveddice[0] +
	                   "\n" + "Die two -------" + saveddice[1] +
	                   "\n" + "Die three -------" + saveddice[2] +
	                   "\n" + "Die four -------" + saveddice[3] +
	                   "\n" + "Die five -------" + saveddice[4] +
	                   "\n" + "Enter the die numbers you would like to save:";

	       numberDieSave=JOptionPane.showInputDialog(null,rollString);
	       angelOfSaving=Integer.parseInt(numberDieSave);
		   return(numberDieSave);                                                                                                                                         
		   
		}
    	public static String finalRollOfTurn (int topBonus, int playerNum)
    	
    	{
    		String rollString;
    		
		   rollString =names[playerNum] + "'s turn has begun. " + names[playerNum] + " you are on the clock." + "\n" +
				   	   "\n\t\t  CURRENT SCORES " + "           Current Total = " + total[playerNum] +    " for player -- " + names[playerNum] + " TOP HALF BONUS --  " + topBonus +
	                   "\n" +"1." + scorename[0] + "score is....." + scores[playerNum][0] + usedflag[playerNum][0] + "\n\t"+"2." + scorename[1] + "score is....." + scores[playerNum][1] + usedflag[playerNum][1] +
	                   "\n" +"3." + scorename[2] + "score is....." + scores[playerNum][2] + usedflag[playerNum][2] + "\n\t"+"4." + scorename[3] + "score is....." + scores[playerNum][3] + usedflag[playerNum][3] + 
	                   "\n" +"5." + scorename[4] + "score is....." + scores[playerNum][4] + usedflag[playerNum][4] + "\n\t"+"6." + scorename[5] + "score is....." + scores[playerNum][5] + usedflag[playerNum][5] +
	                   "\n_______________________________________________________________________________________" +
	                   "\n" +"7." + scorename[9] + "score is....." + scores[playerNum][9] + usedflag[playerNum][9] + "\n"+"8." + scorename[10] + "score is....." + scores[playerNum][10] + usedflag[playerNum][10]+ 
	                   "\n" +"9." + scorename[11] + "score is....." + scores[playerNum][11] + usedflag[playerNum][11] + "\n"+"10." + scorename[12] + "score is....." + scores[playerNum][12] + usedflag[playerNum][12]+ 
	                   "\n" +"11." + scorename[13] + "score is....." + scores[playerNum][13] + usedflag[playerNum][13]+ "\n"+"12." + scorename[14] + "score is....." + scores[playerNum][14] + usedflag[playerNum][14] + 
	                   "\n" +"13." + scorename[15] +  "score is....." + scores[playerNum][15] + usedflag[playerNum][15] + 
	                   "\n_______________________________________________________________________________________" +
	                   "\n" + "Die one -------" + saveddice[0] +
	                   "\n" + "Die two -------" + saveddice[1] +
	                   "\n" + "Die three -------" + saveddice[2] +
	                   "\n" + "Die four -------" + saveddice[3] +
	                   "\n" + "Die five -------" + saveddice[4] +
	                   "\n______________________________________________________________________________________" +
	                   "\n" + "Please select the number of the score you would like:";

	       numberDieSave=JOptionPane.showInputDialog(null,rollString);
	       angelOfSaving=Integer.parseInt(numberDieSave);
		   return(rollString);                                                                                                                                         
		   
		}
		public static void scorer (int pointser)
		{
			switch(pointser)
			{
				case 1:
					
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==1)
						{
							sum1=sum1+1;
						}
					}
					scores[playerNum][0]=sum1;
					sum1=0;
					usedflag[playerNum][0]="__________Used";
				break;
				case 2:
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==2)
						{
							sum1=sum1+2;
						}
					}
					scores[playerNum][1]=sum1;
					sum1=0;
					usedflag[playerNum][1]="__________Used";
				break;
				case 3: 
					
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==3)
						{
							sum1=sum1+3;
						}
					}
					scores[playerNum][2]=sum1;
					sum1=0;
					usedflag[playerNum][2]="__________Used";
				break;
				case 4: 
					
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==4)
						{
							sum1=sum1+4;
						}
					}
					scores[playerNum][3]=sum1;
					sum1=0;
					usedflag[playerNum][3]="__________Used";
				break;
				case 5: 
					
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==5)
						{
							sum1=sum1+5;
						}
					}
					scores[playerNum][4]=sum1;
					sum1=0;
					usedflag[playerNum][4]="__________Used";
				break;
				case 6:
					
					for(int v=0; v<saveddice.length;v++)
					{
						s1=saveddice[v];
						if(s1==6)
						{
							sum1=sum1+6;
						}
					}
					scores[playerNum][5]=sum1;
					sum1=0;
					usedflag[playerNum][5]="__________Used";
				break;
				case 9: 
					int check1 = saveddice[0];
					int check2 = saveddice[1];
					int check3 = saveddice[2];
					int check4 = saveddice[3];
					int check5 = saveddice[4];
					
					for(int x=0; x<5;x++)
					{
						if(check1==check2)
						{
							
						}
						rollTotal=rollTotal+saveddice[x];
					}
					scores[playerNum][10]=rollTotal;;
				break;
				case 11:
					for(int x=0; x<5;x++)
					{
						rollTotal=rollTotal+saveddice[x];
					}
					scores[playerNum][11]=rollTotal;;
				break;
				case 12: scores[playerNum][12]=25;
				break;
				case 13: scores[playerNum][13]=40;
				break;
				case 14: scores[playerNum][14]=50;
				 break;
				case 15:
				
				for (int x=0; x<5;x++)
				{
				  rollTotal= rollTotal + saveddice[x];
				}
				scores[playerNum][15] = rollTotal;;
				break;
				
				default: 
				JOptionPane.showMessageDialog(null," Error in selecting a choice");
				break;
			}
			rollTotal = 0;
		}
}