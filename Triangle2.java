import java.util.Scanner;
class number
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER OF ROWS:");
    int n=input.nextInt();
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
 
         System.out.println();
    
    
    } 
     
}}