import java.util.Scanner;
class fibonnacci
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER:");
    int n=input.nextInt();
    int a=0,b=1,c=0;
    int i=2;
    while(i<=n)
    {
        c=a+b;
        a=b;
        b=c;
        i++;
    }
    {
         System.out.println(c);
    }
}}
            