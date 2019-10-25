import java.util.Scanner;
public class minThree{
  public static void main(String[]args){
      Scanner Scan = new Scanner(System.in);
      System.out.println("Please Enter Three Integers");
      int inputOne = Scan.nextInt();
      int  inputTwo = Scan.nextInt();
      int inputThree = Scan.nextInt();

      if(inputOne<=inputTwo){
        if(inputOne<=inputThree){
        System.out.println(inputOne);
        }
      }
      else if(inputTwo<=inputThree){
      System.out.println(inputTwo);
      }
      else{
        System.out.println(inputThree);
      }









  }

}
