import java.util.Scanner;
public class Circle
{
double r;
public double circ(){
return 2*3.14*r;
}
public double area(){
return 3.14*r*r;
}
    public static void main(String[] args)
    {
    Scanner reader= new Scanner(System.in) ;
    System.out.print("Enter the radius:");  
       Circle aCircle=new Circle();
       aCircle.r=reader.nextInt();
       double area=aCircle.area();
       double circu=aCircle.circ();
       System.out.println("Area of circle :"+area);
       System.out.println("Circumference  of circle :"+circu);
       
    }
   
}