import java.util.Scanner;
class number
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER OF ROWS:");
    int n=input.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j<n;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<i*2;k++)
        {
             System.out.print("*");
        }
 
         System.out.println();
    
    
    } 
     
}}