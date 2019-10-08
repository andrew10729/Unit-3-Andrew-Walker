import java.util.Scanner;
import java.text.DecimalFormat;
public class winPercentage {
  public static void main(String[]args){
    Scanner Scan = new Scanner(System.in);

    System.out.println("Enter the number of games played");
    double games = Scan.nextInt();
    System.out.println("Enter how many games you won");
    double won = Scan.nextInt();
    double percent = won/games*100;
  if(games<won){
    System.out.println("Error: ReCheck Your Inputs");
  }
  else {
    System.out.println("Your win percentage is:"+percent+"%");
  }
  while(games<won){
    System.out.println("Correctly Enter Number of Games Played");
    double games = Scan.nextInt();

  }

















  }
}
