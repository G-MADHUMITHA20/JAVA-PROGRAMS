import java.util.Scanner;
class Array
{ public static void main(String[] args)
{
    int x[]=new int[5];
    Scanner num=new Scanner(System.in);
    System.out.println("Enter 5 elements:");
    for(int i=0;i<x.length;i++)
    {
        x[i]=num.nextInt();

    }
    System.out.println("The elements are:");
    for(int i=0;i<x.length;i++)
    {
        System.out.print(x[i]+" ");
    }
    for(int i=0;i<x.length;i++)
    {
        for(int j=i+1;j<x.length;j++)
        {
            if(x[i]<x[j])
            {
                int t=x[i];
                x[i]=x[j];
                x[j]=t;
            }
        }
    }
    System.out.println("The sorted elements are:");
    for(int i=0;i<x.length;i++)
    {
        System.out.print(x[i]+" ");
    }
}
}