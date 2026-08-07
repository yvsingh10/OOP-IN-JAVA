import java.util.Scanner;
class Student
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          System.out.println("Array elemnets are");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ "  ");
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[0]<arr[i])
            {
                largest=arr[i];
            }
            else
            {
                largest=arr[0];
            }
        }
        
        for(int i=1;i<n;i++)
        {
            if(arr[0]>arr[i])
            {
                smallest=arr[i];
            }
            else
            {
                smallest=arr[0];
            }
        }
        
        System.out.println("largest number is " +largest);
        System.out.println("smallest number is " +smallest);
    }
}
