import javax.swing.JOptionPane;

public class Sudoku 
{
	public static void main(String[] args) 
	{		
		int c1;
		int c2;
		String holder;
		
		boolean finished = false;
		
		int[][] scoreBoard = new int[9][9];
		
		boolean[][][] optionNumbers = new boolean[9][9][9];
		
		for (int a = 0; a < 9; a++)
			for (int b = 0; b < 9; b++)
				for (int c = 0; c < 9; c++)
					optionNumbers[a][b][c] = true;
		
		for (int i = 0; i < 9; i++)
			for (int a = 0; a < 9; a++)
			{
				c1 = i + 1;
				c2 = a + 1;
				holder = JOptionPane.showInputDialog("Enter Coordinate ( " + c1 + ", " + c2 + ")");
				scoreBoard[i][a] = Integer.parseInt(holder);
			}
		
		for (int i = 0; i < 9; i++)
		{
			for (int a = 0; a < 9; a++)
				System.out.print("\t" + scoreBoard[i][a]);
			System.out.println();
		}
		System.out.println();
		
		for (int e = 0; e < 10; e++)
		{
			for (int i = 0; i < 9; i++)
			{
				for (int a = 0; a < 9; a++)
				{
					for (int b = 0; b < 9; b++)
					{
						optionNumbers[b] = checking( i, a, scoreBoard, b, optionNumbers[b]);
					}
					
					if (optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 1;
					}
					if (!optionNumbers[0][i][a] && optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 2;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 3;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 4;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 5;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 6;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && optionNumbers[6][i][a] && !optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 7;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && optionNumbers[7][i][a] && !optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 8;
					}
					if (!optionNumbers[0][i][a] && !optionNumbers[1][i][a] && !optionNumbers[2][i][a] && !optionNumbers[3][i][a] && !optionNumbers[4][i][a] && !optionNumbers[5][i][a] && !optionNumbers[6][i][a] && !optionNumbers[7][i][a] && optionNumbers[8][i][a])
					{
						scoreBoard[i][a] = 9;
					}
					
					finished = true;
					
					//for (int c = 0; c < 9; c++)
					//	for (int d = 0; d < 9; d++)
					//		if (scoreBoard[i][a] == 0)
					//		{
					//			finished = false;
					//		}
				}
			}
		}
		
		for (int i = 0; i < 9; i++)
		{
			for (int a = 0; a < 9; a++)
				System.out.print("\t" + scoreBoard[i][a]);
			System.out.println();
		}
	}
	public static boolean[][] checking(int i, int a, int[][] scoreBoard, int checkNumber, boolean[][] optionNumbers)
	{
		boolean[][] returnNumber = optionNumbers;
				
		if (scoreBoard[i][a] == 0)
		{
			for (int b = 0; b < 9; b++)
			{
				if (scoreBoard[i][b] == checkNumber)
				{
					returnNumber[i][a] = false;
				}
			}
			
			for (int c = 0; c < 9; c++)
			{
				if (scoreBoard[c][a] == checkNumber)
				{
					returnNumber[i][a] = false;
				}
			}
		}
		return returnNumber;
	}
}
