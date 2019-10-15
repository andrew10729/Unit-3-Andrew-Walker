import java.util.Scanner;

public class multiples{
  public static void main(String[]args){
    Scanner Scan = new Scanner(System.in);
    System.out.println("Please Enter Your Multiple");
    int multiple = Scan.nextInt();
    System.out.println("Please Enter A Limit");
    int limit = Scan.nextInt();
int cap = limit/multiple;
    for (int times = 1; times <= cap; times++){
    int mult = multiple*times;
    if(times > 5 || 10) {
    System.out.println("");
    }
  System.out.print(mult+" ");
  }












  }
}
