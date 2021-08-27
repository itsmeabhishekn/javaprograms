import java.util.Scanner;

public class Emplyeet
{
  int Empid;
  String Name;
  float Salary;
  String Address;
 
  public Employeet(){
   Empid=0; Name=" "; Salary=0; Address=" ";
   }
public void input()
{
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the employee number: ");
  Empid=sc.nextInt();
  System.out.print("enter the name: ");
  Name=sc.next();
  System.out.print("enter the employee salary: ");
  Salary=sc.nextFloat();
  System.out.print("enter the Address: ");
  Address=sc.next();
}

}  
class Teacher extends Employee
{
  String Department;
  String Subject;
 
 public Teacher(){
  Department=""; Subject="";
  }
public void data()
{
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the department and subject: ");
  Department=sc.next();
  Subject=sc.next();
}

public void output()
{
  System.out.println("employee id=" +Empid);
  System.out.println("employee name=" +Name);
  System.out.println("employee salary=" +Salary);
  System.out.println("employee address=" +Address);
  System.out.println("teacher department=" +Department);
  System.out.println("subject taught=" +Subject);
}
public static void main(String args[])
{
  int n;
  Scanner sc=new Scanner(System.in);
  System.out.print("enter the number of employees: ");
  n=sc.nextInt();
  Teacher t[]=new Teacher[n];
 
  for(int i=0; i<n; i++)
{
   t[i]=new Teacher();
   t[i].input();
   t[i].data();
   System.out.print("\n");
}
System.out.println("employee details: ");
for(int i=0; i<n; i++)
{
   t[i].output();
   System.out.print("\n");
}
}
}
