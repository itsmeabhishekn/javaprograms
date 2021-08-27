import java.util.Scanner;
public class SearchArray {
    public static void main(String  [] args) {
      int n,e,count=0, i;
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter the number of elements in the array:");
      n=reader.nextInt();
      int a[] = new int[n];
      System.out.println("Enter elements of array:");
      for(i=0;i<n;i++)
      {
          a[i]=reader.nextInt();
       }
      System.out.print("Enter the element to be search:");
      e=reader.nextInt();
      for(i=0;i<n;i++)
    {
       if(a[i]==e)
       {
         count=1;
         break;
        }
       }
       if(count==1)
        {
         System.out.print("Element found at position "+(i+1));
        }  
        else
       {
       System.out.print("Element not found .");
      }
    }
  }