import java.util.Scanner;

    public class LargeArray 
    {
        public static void main(String[] args) 
        {
            int n, temp;
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the limit of array:");
            n = reader.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array elements:");
            for(int i = 0; i < n; i++)
            {
                arr[i] = reader.nextInt();
            }
            temp = arr[0];
            for(int i = 0; i < n; i++)
            {
                if(temp < arr[i])
                {
                    temp = arr[i];
                }
            }
            System.out.println("Largest number in the array:"+temp);
        }
    }
