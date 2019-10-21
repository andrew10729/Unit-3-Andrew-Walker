import java.util.Scanner;
import java.util.Random;

public class rps{
  public static void main(String[]args){
int count = 0;

while(count >=0){
  Scanner Scan = new Scanner(System.in);
  System.out.println("Please Enter Your Move");
  String input = Scan.nextLine();
  int inputNumber = input.length();
String rock = "rock";
String paper = "paper";



  if(inputNumber == 4)
  System.out.println("Your Move: Rock");
  if(inputNumber == 5)
  System.out.println("Your Move: Paper");
  if(inputNumber == 8)
  System.out.println("Your Move: Scissors");
Random rand = new Random();
  int computerNumber = rand.nextInt(3)+1;
  System.out.println(computerNumber);
if(computerNumber == 1)
System.out.println("Computer Move: Rock");
if(computerNumber == 2)
System.out.println("Computer Move: Papers");
if(computerNumber == 3)
System.out.println("Computer Move: Scissors ");

if(inputNumber == 4 && computerNumber == 3){
System.out.println("You Win");
}
else if(inputNumber == 4 && computerNumber == 1){
  System.out.println("Draw");
}else{
System.out.println("You Lose");

  System.out.println("Do you Want To Play Again? Yes or No");
  String again = Scan.nextLine();
  int yesNo = again.length();
  if(yesNo == 3)
  System.out.println("Yes");
  count = count + 1;
  if(yesNo == 2)
  System.out.println("No");
count = count-1000;
}
}



























  }

}
