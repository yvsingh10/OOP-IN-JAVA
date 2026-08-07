import java.util.Scanner;
class Calcuator{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int n1,n2,choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtracton");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.print("Enter you choice:");
        choice=sc.nextInt();
        System.out.print("Enter the first no:");
        n1=sc.nextInt();
        System.out.print("Enter the second no:");
        n2=sc.nextInt();
        
        switch(choice) {
            case 1:
                int result1 =n1+n2;
                System.out.print(result1);
                break;   
            case 2:
                int result2 =n1-n2;
                System.out.print(result2);
                break;  
            case 3:
                int result3 =n1*n2;
                System.out.print(result3);
                break;  
            case 4:
                if(n2==0){
                    System.out.print("Division is not possible due to value of n2.");
                }
                else{
                int result4 =n1/n2;
                System.out.println(result4);
                }
                break;
                
            
            default :
                System.out.println("Please enter the valid choice");
            sc.close();    
        }
        
        
        
    }
}
