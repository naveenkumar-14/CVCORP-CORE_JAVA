public class Demo {
    static int a;
    int b;
    Demo(String s){

    }
    Demo(int a,char c){

    }
    Demo(String a,int b,char c){

    }
    public static void main(String[] args) {
        Demo d1=new Demo("Hello");
        Demo d2= new Demo(6, 'h');
        Demo d3=new Demo("Hello", 2, 'd');
    }
}
