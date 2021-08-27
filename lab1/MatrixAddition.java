import java.util.Scanner;
class MatrixAddition{
public static void main(String args[]){
int row,col,i,j;
Scanner reader=new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=reader.nextInt();
System.out.println("Enter the number of columns:");
col=reader.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int sum[][]=new int[row][col];
System.out.println("Enter the elements of the first matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat1[i][j]=reader.nextInt();
}
System.out.println("Enter the elements of the second matrix:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat2[i][j]=reader.nextInt();
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
sum[i][j]=mat1[i][j]+mat2[i][j];
System.out.println("Sum of matrices:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.print(sum[i][j]+"\t");
System.out.println();
}
}
}