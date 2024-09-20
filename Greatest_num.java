import java.util.Scanner;
class Greatest
{ public static void main(String[] args)
{
    Scanner input=new Scanner(System.in);
    System.out.println("ENTER FIRST NUMBER:");
    int num1=input.nextInt();

     System.out.println("ENTER SECOND NUMBER:");
    int num2=input.nextInt();
     System.out.println("ENTER THIRD NUMBER:");
    int num3=input.nextInt();
    if(num1>num2 && num1>num3)
    {
        System.out.println("Greatest number:"+num1);
    }
    else if(num2>num1 && num2>num3)
    {
        System.out.println("Greatest number:"+num2);
    }
    else 
    {
        System.out.println("Greatest number:"+num3);
    }
}}


