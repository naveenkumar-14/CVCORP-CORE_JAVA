public class ThisAtVariableandMethod {
    int a;
    String b="Hi";
    ThisAtVariableandMethod(int a,String b){
        this.a=a;
        this.b=b;
        this.m1(this.a,this.b);
    }
    void m1(int a,String s){
        System.out.println(a+" "+s);
    }
    
    public static void main(String[] args) {
        ThisAtVariableandMethod t=new ThisAtVariableandMethod(5, "Hello");
        
    }
}
