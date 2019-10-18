import java.util.Scanner;

public class multiples{
  public static void main(String[]args){
    Scanner Scan = new Scanner(System.in);
    System.out.println("Please Enter Your Multiple");
    int multiple = Scan.nextInt();
    System.out.println("Please Enter A Limit");
    int limit = Scan.nextInt();

    if(multiple<=0){
    System.out.println("Error, Enter a Real Number Next Time");
  }
  if(multiple>limit)
  System.out.println("The multiple you inputted is bigger than you're maximum, Try Again");

int cap = limit/multiple;
    for (int times = 0; times <= cap;){
    int mult = multiple*times;
    if(times%5 == 0) {
    System.out.println("");
    }
  System.out.print(mult+" ");
times = times +1;
  }













  }
}
