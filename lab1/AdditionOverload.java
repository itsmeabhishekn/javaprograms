import java.util.Scanner;
class AdditionOverload
{
  void addition(int x , int y)
  {
     int sum=x+y;
     System.out.println("The sum of two number is :"+sum);
  }
  void addition(int x,int y, int z)
  {
     int sum=x+y+z;
     System.out.println("The sum of three numbers is :"+sum);
  }
  void addition(double x,double y)
  {
     double sum=x+y;
     System.out.println("The sum of two numbers is :"+sum);
  }
}
class Overloadfun
{
  public static void main(String args[])
  {
     int x,y,z,c,d;
     double a,b;
     Scanner sc= new Scanner(System.in);
     AdditionOverload ad = new AdditionOverload();
     System.out.print("Enter the 2 numbers: ");
     x=sc.nextInt();
     y=sc.nextInt();
     System.out.print("Enter the 3 numbers: ");
     c=sc.nextInt();
     d=sc.nextInt();
     z=sc.nextInt();
     System.out.print("Enter the 2 float numbers: ");
     a=sc.nextDouble();
     b=sc.nextDouble();
     ad.addition(x,y);
     ad.addition(x,y,z);
     ad.addition(a,b);

  }
}
