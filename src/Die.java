/********************************************************************
  Die.java       Author: Lewis/Loftus/Cocking

  Represents one die (singular of dice) with faces showing values
  between 1 and the number of faces on the die.
********************************************************************/

public class Die
{
/*---Data fields that each Die object keeps track of---*/
   private final int MIN_FACES = 4;//Die must have at least 4 sides/faces

   private int numFaces;   // number of sides on the die
   private int faceValue;  // current value showing on the die

   /*-----------------------------------------------------
     Default Constructor: Defaults to a six-sided die. 
     Initial face value is 1.
   --------------------------------------------------------*/
   public Die ()
   {
      numFaces = 6;
      faceValue = 1;
   }

   /*------------------------------------------------------
    1-Arg Constructor: Sets the size of the die. 
    Defaults to a size of    //  six if the parameter is 
    invalid (less than 4).  Initial face value is 1. 
   --------------------------------------------------------*/
   public Die (int faces)
   {
      if (faces < MIN_FACES)
         numFaces = 6;
      else
         numFaces = faces;
   
      faceValue = 1;
   }

   /*---------------------------------------------------------
     Method: roll
     Precondition: N/A
     Postcondition: Rolls the die and sets faceValue accordingly
   ------------------------------------------------------------*/
   public void roll ()
   {
      //sets faceValue to an int between 1 - numFaces (both inclusive)
      faceValue = (int)(Math.random() * numFaces + 1);
   }

   /*---------------------------------------------------------
    Accessor method: getFaceValue
     Precondition: N/A
     Postcondition: Returns the current die facevalue.
   ----------------------------------------------------------*/
   public int getFaceValue ()
   {
      return faceValue;
   }
   
   /*-------------------------------------------------------
     Modifier method: updateNumFaces
     Precondition: newNumFaces arg must be less than 4
     Postcondition: Updates the number of faces.
   ---------------------------------------------------------*/
   public void updateNumfaces(int newNumFaces)
   {
      if(newNumFaces<MIN_FACES)
         numFaces = newNumFaces;
   }
}
