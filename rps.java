import java.util.Scanner;
import java.util.Random;

public class rps{
  public static void main(String[]args){
    //initializing gloabl variables
    double games = 0;
    double win = 0;
    for(int count = 0; count>=0; count++ ) {
      //Scanners to ask user for input
      Scanner Scan = new Scanner(System.in);
      System.out.println("Please Enter Your Move");
      System.out.println("");
      String input = Scan.nextLine();
      int inputNumber = input.length();
      games = games + 1;
      String rock = "rock";
      String paper = "paper";

      //assigning input to the checking system
      if(inputNumber == 4)
        System.out.println("Your Move: Rock");
      if(inputNumber == 5)
        System.out.println("Your Move: Paper");
      if(inputNumber == 8)
        System.out.println("Your Move: Scissors");

      Random rand = new Random();
      int computerNumber = rand.nextInt(3)+1;

      if(computerNumber == 1)
        System.out.println("Computer Move: Rock");
      if(computerNumber == 2)
        System.out.println("Computer Move: Paper");
      if(computerNumber == 3)
        System.out.println("Computer Move: Scissors ");

      //comparing input move with the computer move
      if(inputNumber == 4 && computerNumber == 3 || inputNumber == 5 && computerNumber == 1 || inputNumber 8 && computerNumber == 2){
        System.out.println("You Win!!");
        win = win + 1;
      }
      else if(inputNumber == 4 && computerNumber == 1 || inputNumber == 5 && computerNumber == 2 || inputNumber == 8 && computerNumber == 3){
        System.out.println("Draw!");
      }
      else {
        //play again sequence
        System.out.println("You Lose :(");
        System.out.println("Do you Want To Play Again? Yes or No");
        String again = Scan.nextLine();
        int yesNo = again.length();
        if(yesNo == 3){
          count = count + 1;
        }
        else{
          //endgame sequence
          System.out.println("No");
          count = count-1000;
          System.out.println("Thanks For Playing!!");
          System.out.println("Games Played:"+ games);
          System.out.println("Games Won: "+ win);
          double winPercent = win/games;
          System.out.println(winPercent*100+"%");
        }
      }
    }
  }
}
