import java.util.*;
public class Hallsrq2
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i ,j;
        for(i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(i=0;i<n-2;i++)
        {
            System.out.println("*");
            for(j=0;j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}