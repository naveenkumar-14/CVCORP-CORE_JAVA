class B implements A{public void print(String s){
System.out.print(s);
}
public static void main(String[] args){
A obj=new B();
obj.print("Hello");
}
}