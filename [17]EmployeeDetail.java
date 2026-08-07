class Employee{
    int id;
    String name;
    double salary;
    float age;
     void Set_data(int i,String n,double s,float a) {
         
         id=i;
         name=n;
         salary=s;
         age=a;
     }
     void display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Salary:"+salary);
        System.out.println("Employee Age:"+age);
        System.out.println("  ");
       
       
      
    }
    public static void main(String[]args){
        Employee ep1 = new Employee();
        Employee ep2 = new Employee();
        Employee ep3 = new Employee();
        Employee ep4 = new Employee();
        Employee ep5 = new Employee();
        
        ep1.Set_data(253,"Yash Vardhan Singh",500000,25);
        ep1.display();
        ep2.Set_data(289,"Vikrant Singh",558000,28.5f);
        ep2.display();
        ep3.Set_data(293,"Samarth Pratap Singh",320000,23);
        ep3.display();
        ep4.Set_data(222,"Swastik Uniyal",120000,29);
        ep4.display();
        ep5.Set_data(219,"Manish Pandey",480000,32.6f);
        ep5.display();
        
    }
}
