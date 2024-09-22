import java.util.Scanner;
class check
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER:");
    int n=input.nextInt();

     int num=0;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            num=1;
         System.out.println("Composite number");
         
        }
    }
    if(num==0)
    {
          System.out.println("Prime number");
    }
        
}}
