
import java.util.Scanner;
import java.lang.Math;
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner reader =new Scanner(System.in);
      System.out.print("Enter a number:");
      int num = reader.nextInt();
      double y=Math.sqrt(num);
      System.out.println("Square root of " + num + "=" +y);
    }
    
}
