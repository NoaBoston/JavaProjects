//********************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values     // I editing this massively
//  between 1 and 6.
//********************************************************************

/* this could be a method that receives an array of all dice to roll (with the dice amount array)
 *
 * Then it would roll based on the first array and put the result in the array, 
 *
 *
 * 1. Send the two arrays to a method
 * 2. Loop thru the array five times (true/false array)
 *		if true, roll die&, where & is the number and update array
 *      else nothing
 * 3. End method
 *
 *
 *
 *
 *
*/

public class Die
{
   protected final int MAX = 6;  // maximum face value

   
   private int faceValue;  // current value showing on the die
   
  
   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
       
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue (int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = Integer.toString(faceValue);

      return result;
   }
}