public class Student {
    String name;
    int age;
    long mobile;
    Student(String s,int a,long m){
        this.name=s;
        this.age=a;
        this.mobile=m;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(mobile);
    }
    Student(Student st){
        this.name=st.name;
        this.age=st.age;
        this.mobile=st.mobile;
    }
    public static void main(String[] args) {
        Student s=new Student("Tom",23,87876);
        s.display();
        Student s1=new Student(s);
        s1.display();
    }
}
