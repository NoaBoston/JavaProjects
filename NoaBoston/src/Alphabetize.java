import javax.swing.JOptionPane;
import java.util.*;

public class Alphabetize 
{
	public static void main(String[] args) 
	{		
		int optionsInt = Integer.parseInt(JOptionPane.showInputDialog("How many words would you like to alphabetize?"));
		
		int[] alphaInts = new int[optionsInt];
		
		String[] alphaChoices = new String[optionsInt];
		String[] alphaChars = new String[optionsInt];
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		for (int i = 0; i < optionsInt; i++)
		{
			alphaChoices[i] = JOptionPane.showInputDialog("Enter your words");
		}
		
		for (int i = 0; i < alphaChoices.length; i++)
		{
			alphaChars[i] = alphaChoices[i].substring(0, 1);
		}
		
		for (int i = 0; i < alphaChars.length; i++)
		{
			for (int o = 0; o < alphabet.length; o++)
			{
				if (alphaChars[i].equalsIgnoreCase(alphabet[o]))
				{
					alphaInts[i] = o;
				}
			}
		}
		
		for (int i = 0; i < alphaInts.length; i++)
		{
			for (int o = i + 1; o < alphaInts.length; o++)
			{
				if (alphaInts[i] > alphaInts[o])
				{
					int holder = alphaInts[i];
					alphaInts[i] = alphaInts[o];
					alphaInts[o] = holder;
					
					String holderString = alphaChoices[i];
					alphaChoices[i] = alphaChoices[o];
					alphaChoices[o] = holderString;
				}
			}
		}
		
		for (int i = 0; i < alphaChars.length; i++)
		{
			System.out.print(alphaChoices[i] + " ");
		}
	}

}
