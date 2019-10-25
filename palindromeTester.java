import java.util.Scanner;

public class palindromeTester{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter a Palindrome");
    String word = scan.nextLine();
    int wordLength = word.length();
    System.out.println("wordLength");



    if(word.charAt(0)==word.charAt(word.length()-1)){

      if(word.charAt(1)==word.charAt(word.length()-2)){

        if(word.charAt(2)==word.charAt(word.length()-3)){

          if(word.charAt(3)==word.charAt(word.length()-4)){
          System.out.println("You Have Correctly Entered A Palindrome");
          }
        }
      }
     }






















  }
}
