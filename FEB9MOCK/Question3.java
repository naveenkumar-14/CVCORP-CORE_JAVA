class Question3{
	int a;
	int b;
	Question3(int a,int b){
	this(b);
	this.a=a;
		
	}
	Question3(int b){
		this.b=b;
	}
	Question3(){
	
	}
	public int calculate(int a,int b){
	return a+b;
	}
	public void displayA(){
		System.out.println(this.a);
	}
	
}