import java.util.Scanner;
class Array{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array:");
        n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements:");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            
    }
}

        
       
