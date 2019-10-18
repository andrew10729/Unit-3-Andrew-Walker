import java.util.Scanner;
import java.util.Random;

public class rps{
  public static void main(String[]args){
  Scanner Scan = new Scanner(System.in);
  System.out.println("Please Enter Your Move");
  String input = Scan.nextLine();
  int inputNumber = input.length();
  if(inputNumber == 4)
  System.out.println("Your Move: Rock");
  if(inputNumber == 5)
  System.out.println("Your Move: Paper");
  if(inputNumber == 8)
  System.out.println("Your Move: Scissors");
Random rand = new Random();
  int computerNumber = rand.nextInt(5)+4;
  System.out.println(computerNumber);
  if(computerNumber = 6){
    else if(computerNumber = 7){
    int computerNumber = rand.nextInt(5)+4;
System.out.println(computerNumber);
}
  }

















  }

}
