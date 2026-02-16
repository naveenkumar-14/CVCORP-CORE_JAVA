public class Sample {
    static String s;
    static{
        s="Hello";
    }
    {
        System.out.println(s);
    }
    static String m1(String a){
        return s;
    }
    void m2(char c){
        System.out.print(m1(s).charAt(0));
    }
    Sample(String s,int a,char b){

    }
    public static void main(String[] args) {
        Sample s=new Sample("s", 0, 'c');
        s.m2('v');
    }
}
