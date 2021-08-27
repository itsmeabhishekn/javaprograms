import java.util.Scanner;
public class sports {
    Double sscore;
    public void sgrade(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the sports score : ");
        sscore = reader.nextDouble();
    }
}
class student extends sports{
    Double mark;
    public void smark(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the academic score : ");
        mark = reader.nextDouble();
    }
}
class result extends student{
    public static void main(String args[]){
        result r1=new result();
        result r3=new result();
        r1.sgrade();
        r1.smark();
        System.out.print("The sports score is "+r1.sscore+" \n");
        System.out.print("The academic score is "+r1.mark+" \n");
    }
}