import java.util.Scanner;
class Array{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int n,target;
        int index= -1;
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
        System.out.println(" ");
        System.out.print("Enter the number to search:");
        target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                index= i;
                break;
            }
            
        }
        if (index == -1) {
            System.out.println("Element " + target + " is not present in the array.");
        } else {
            System.out.println("Element " + target + " found at index: " + index);
        }
            
    }
}

        
       
