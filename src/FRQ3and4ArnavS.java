public class FRQ3and4ArnavS {
/*
Unit 3 Question 1
    a.) Write a code segment that prints "attending" if RSVP is true & prints "not attending" otherwise.
Write the code segment below.

  if(RSVP)
  {
    System.out.println("Attending");
  }
  else
  {
    System.out.println("Not Attending");

  }
  b.) Write a code segment that prints the food item associated with "Selection". For example, if "Selection" is 3, the
code segment should print "pasta".
Write the code segment below. Your code segment should meet all specifications and conform to the example.

if (selection == 1){

System.out.println("Beef");

} else if (selection == 2){

System.out.println("Chicken");

} else if (selection == 3) {

System.out.println("Pasta");

} else {

System.out.println("Fish");


}

c.)
 Write a code segment that will store a dinner selection in option1 based on the values of RSVP and Selection.
The intended behavior of the code segment is described below.
If RSVP is true, the code segment should store in option1 a string indicating the person's attendance & food choice.
For example, if RSVP is true & Selection is 1, the following string should be stored in option1.
"Thanks for attending. You will be served beef."
If RSVP is false, the following string should be stored in option1, regardless of the value of Selection.
"Sorry you can't make it."
Write the code segment below. Your code segment should meet all specifications and conform to the examples

case 1:

if(rsvp){

option1 = "Thanks for attending. You will be served beef.";

} else{

option1 = "Sorry you can't make it";
}
break;

case 2:

if(rsvp){

option1 = "Thanks for attending. You will be served chicken.";
}
else{

option1 = "Sorry you can't make it";
 break;

case 3:

if(rsvp){

option1 = "Thanks for attending. You will be served pasta.";

} else{

option1 = "Sorry you can't make it";

}
break;
default:
if(rsvp){

option1 = "Thanks for attending. You will be served fish.";

} else{

option1 = "Sorry you can't make it";
}
break;
}

Write a code segment that will print true if the strings option1 & option2 contain the same values & will print
false otherwise.
Write the code segment below.

d.)
if (option1 == option2){

System.out.println("True");

} else {

System.out.println("False");

}

Unit 3 Question 2

Write the method drawSquare below

public class Draw
{
 public void drawLine(int x1, int y1, int x2, int y2)
{

public void drawSquare  (int x, int y, int Len)
{
if (Len > y && y <= (10 - x))
{
 Len = y;
}
else if (Len > (10 - x) && (10 - x) <= y)
{
Len = 10 - x;
}
drawLine (x, y, x + Len, y);

drawLine (x, y, x, y - Len);

drawLine(x, y - Len, x + Len, y - Len);

drawLine (x + Len, y, x + Len, y - Len);

System.out.println("The area is:" + Len * Len);

System.out.println("The perimeter is:" + Len * 4);
    }



}

Unit 4 FRQ Answers:


Unit 4 Question 1:

Complete the method below. Your implementation should conform to the example above.
public static void longestStreak (String str)

public static void longestStreak(String str){

int maxCharacterCount = 0;
char longestSubString = str.charAt(0);

for(int i=0; i<str.length(); i++){

int currentMaxCharacterCount = 1;

for(int j=i+1; j<str.length(); j++){

if(str.charAt(i) != str.charAt(j)){
      break;
}

else {
currentMaxCharacterCount++;
}

}

if (currentMaxCharacterCount > maxCharacterCount) {

maxCharacterCount = currentMaxCharacterCount;

longestSubString = str.charAt(i);

}

}
System.out.println(longestSubString + " "+ maxCharacterCount);

   }

}

Unit 4 Question 2:

Complete method getPlayer2Move below by assigning the correct value to result to be returned.

/*
 */
/*
public int getPlayer2Move(int round)
 */ {
  /*int result = 0;

  /*If round is divided by 3
  if(round%3 == 0) {
      result= 3;
  }

  //if round is not divided by 3 and is divided by 2

  else if(round%3 != 0 && round%2 == 0) {

      result = 2;
  }

  else {
      result = 1;
  }
  return result;
}

(2)

public void playGame()

{

  /*Process that will make an instance of initialization of player 1 coins

  int player1Coins = startingCoins;

    /*Process that will make an instance of initialization of player 2 coins

  int player2Coins = startingCoins;


  for ( int round = 1 ; round <= maxRounds ; round++) {

      /*if the player 1 or player 2 coins are less than 3

      if(player1Coins < 3 || player2Coins < 3) {

          break;
      }
      /*Player 1 coin spendings

      int player1Spends = getPlayer1Move();

         /*Player 2 coin spendings

      int player2Spends = getPlayer2Move(round);

      /*After round 1, player 1 only has a certain amount of coins left

      player1Coins -= player1Spends;

      /* After round 1, player 2 will have some coins left.

      player2Coins -= player2Spends;



      if ( player1Spends == player2Spends) {

          player2Coins += 1;

          continue;

      }
      /*positive difference between the number of coins spent by the two players
      int difference = Math.abs(player1Spends - player2Spends) ;
      /*Difference of 1
      if( difference == 1) {
          player2Coins += 1;
          continue;
      }

 */
      /*If there is a difference between the 2 players of 2 coins

      if(difference == 2) {
          player1Coins += 2;
          continue;
      }
  }
  /* This is the end part of the game

  /*If player 1 has the same amount of coins as player 2, this is a tie game

  if(player1Coins == player2Coins) {

      System.out.println("tie game");
  }
  /*If player 1 has more coins than player 2, player 1 wins

  else if(player1Coins > player2Coins) {

      System.out.println("player 1 wins");

       }

  /*If player 2 has more coins than player 1, player 2 wins

  else if(player1Coins < player2Coins) {
      System.out.println("player 2 wins");}
}

 */

}/*



}/*