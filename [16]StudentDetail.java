
class Student{
    int roll_no;
    String name;
    float age;
     void Set_data(int r,String n,float a) {
         
         roll_no=r;
         name=n;
         age=a;
     }
     void display(){
        System.out.println("The roll number is:"+roll_no);
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
    public static void main(String[]args){
        Student st = new Student();
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st.Set_data(15,"abc",23.5f);
        st.display();
        st1.Set_data(19,"yash",20);
        st1.display();
        st2.Set_data(56,"vikrant",27.8f);
        st2.display();
        st3.Set_data(11,"manish",22.3f);
        st3.display();
    }
}
