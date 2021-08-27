import java.util.Scanner;
import java.lang.Math;
public class Reverse {
    public static void main(String  args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter a number:");
      int num=reader.nextInt();
      int rev=0;
      while(num!=0)
      {
          int r=num%10;
          rev=rev*10+r;
          num=num/10;
      }
      System.out.println("Reverse of the number:" +rev);
    }
}
