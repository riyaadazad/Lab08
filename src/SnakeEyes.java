//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

public class SnakeEyes
{
   //-----------------------------------------------------------------
   //  Creates two die objects, then rolls both dice a set number of
   //  times, counting the number of snake eyes that occur.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int ROLLS = 500;
      int snakeEyes = 0, num1, num2;
   
      Die die1 = new Die();    // creates a six-sided die
      Die die2 = new Die(20);  // creates a twenty-sided die
   
     //"rolls" each die 500 times
     //gets value of die after roll stores values as num1 & num2
      for (int roll = 1; roll <= ROLLS; roll++)
      {
         die1.roll();
         die2.roll();
         num1 = die1.getFaceValue();
         num2 = die2.getFaceValue();
      
         if (num1 == 1 && num2 == 1)  // check for snake eyes
            snakeEyes++;
      }
   
      System.out.println ("Number of rolls: " + ROLLS);
      System.out.println ("Number of snake eyes: " + snakeEyes);
      System.out.println ("Ratio: " + (double)snakeEyes/ROLLS);
   }
}
