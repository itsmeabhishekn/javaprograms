
import java.util.Scanner;

public class Ternary {
  public static void main(String[] args) {
    
    Scanner reader=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=reader.nextInt();
    String result = (num > 0) ? "Positive Number" : (num<0) ? "Negative Number":"Zero";
    System.out.println(result);
  }
}