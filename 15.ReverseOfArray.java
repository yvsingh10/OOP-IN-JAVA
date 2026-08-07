
import java.util.Scanner;
class Student
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }       
        System.out.println(" ");
        System.out.print("Reversed array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}   
