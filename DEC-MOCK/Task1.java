class Task1{
	boolean m1(int a){
		return a==2;
	}
	boolean m2(Task1 t,int a){
	return t.m1(a);
	}
	boolean m3(Task1 t,int a){
	 return t.m2(t,a);
	}
	public static void main(String[] args){
		Task1 t1=new Task1();
		System.out.println(t1.m3(t1,2));
	}
}