
class Student{
    int roll_no;
    String name;
    static String college ="sharda";
    Student(int r,String n) {
         
         roll_no=r;
         name=n;
         
     }
     void display(){
        System.out.println(roll_no+"  "+name+"  "+college);
      
    }
    public static void main(String[]args){
        Student st = new Student(23,"abc");
        Student st1= new Student(19,"yash");
        Student st2= new Student(26,"manish");

        st.display();
        st1.display();
        st2.display();

       
    }
}
