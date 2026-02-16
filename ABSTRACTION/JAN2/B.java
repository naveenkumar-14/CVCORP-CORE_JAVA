class B extends A{
	B(A a){
		m2(a);
	}
	static void m2(B b){
		b.m1("Hello");
	}
		public static void main(String[] args){
		A obj=new B(new A("Hi"));
	}
}