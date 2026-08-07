
class Student{
    int roll_no;
    String name;
    static String college ="sharda";
    void Student1(int r,String n) {
         
         roll_no=r;
         name=n;
         
     }
     void display(){
        System.out.println(roll_no+"  "+name+"  "+college);
      
    }
    public static void main(String[]args){
        Student st = new Student();
        st.Student1(19,"yash");
        st.display();
       
    }
}
