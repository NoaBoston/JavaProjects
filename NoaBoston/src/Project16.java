
public class Project16 {

	public static void main(String[] args) 
	{
		//Prints my name, never takes the form of a variable
		whichMethod(false, "printing");
		
		printing();
		
		whichMethod(true, "printing");
		
		//Adds 10 to a number 
		int inputAdding = 20;
		
		whichMethod(false, "adding");
		
		adding(inputAdding);
		
		whichMethod(true, "adding");
		
		//Multiplies the two input integers
		int input1 = 10, input2 = 5;
		
		whichMethod(false, "multiplying");
		
		multiplying1(input1, input2);
		
		whichMethod(true, "multiplying");
		
		//Multiplies the two input integers and returns them
		int inputM1 = 8, inputM2 = 10, printer;
		
		whichMethod(false, "second multiplier");
		
		printer = multiplying2(inputM1, inputM2);
		System.out.print(printer);
		
		whichMethod(true, "second multiplier");
		
		//Print the values of an array in a row using a loop
		int[] inputArray = {10, 15, 20, 25, 30};
		
		whichMethod(false, "first array");
		
		arrays1(inputArray);
		
		whichMethod(true, "first array");
		
		//Adds 100 to even numbers, and multiplies odd numbers by ten
		int[] printArray = new int[5];
		
		whichMethod(false, "second array");
		
		//This method uses the array from above as inputs and prints using the previous method
		printArray = arrays2(inputArray);
		arrays1(printArray);
		
		whichMethod(true, "second array");
		
		//Reverse and prints the string used as an input
		String inputString = "one two three four five six";
		
		whichMethod(false, "backwards");
		
		backward(inputString);
		
		whichMethod(true, "backwards");
		
	}
	
	public static void printing()
	{
		System.out.println("Noah");
	}
	
	public static void adding(int addingInput) 
	{
		addingInput = addingInput + 10;
		System.out.println(addingInput);
	}
	
	public static void multiplying1(int multIn1, int multIn2)
	{
		System.out.println(multIn1 * multIn2);
	}
	
	public static int multiplying2(int multIn1, int multIn2)
	{
		System.out.println(multIn1 * multIn2);
		return multIn1 * multIn2;
	}
	
	public static void arrays1(int[] inputArray)
	{
		for (int i = 0; i < inputArray.length; i++)
		{
			System.out.print(inputArray[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] arrays2(int[] inputArray)
	{
		for (int i = 0; i < inputArray.length; i++)
		{
			if (inputArray[i] % 2 == 0)
			{
				inputArray[i] = inputArray[i] + 100;
			} else
			{
				inputArray[i] = inputArray[i] * 10;
			}
		}
		return inputArray;
	}
	
	public static void backward(String backwardString)
	{
		for (int i = backwardString.length() - 1; i >= 0; i--)
		{
			System.out.print(backwardString.charAt(i));
		}
		System.out.println();
	}
	
	public static void whichMethod(boolean done, String inputMethod)
	{
		if (done == false)
		{
			System.out.println("Callling " + inputMethod + " method");
		} else 
		{
			System.out.println("Returned from " + inputMethod + " method");
			System.out.println();
		}
	}

}
