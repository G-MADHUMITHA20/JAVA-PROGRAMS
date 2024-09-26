import java.util.Scanner;
class number
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER OF ROWS:");
    int n=input.nextInt();
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<i;j++)
        {
            System.out.print("*");
        }
 
         System.out.println();
    
    
    } 
     
}}
    
