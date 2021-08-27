package arithmetic;

interface arthop{
    public void add(int x,int y);
    public void sub(int x,int y);
    public void div(int x,int y);
    public void multi();
}
public class arthmtc {
    public void add(int x,int y){
        System.out.println("ADDITION      : "+(x+y));
    }
    public void sub(int x,int y){
        System.out.println("SUBTRACTION   : "+(x-y));
    }
    public void div(int x,int y){
        System.out.println("DIVISION      : "+(x/y));
    }
    public void multi(int x,int y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}