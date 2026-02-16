class Gmail{
private String username;
private String email;
private String password;
private long mobile;
Gmail(String u,String e,String p,long  m){
	this.username=u;
	this.email=e;
	this.password=p;
	this.mobile=m;
}
public void setusername(String u){
	this.username=u;
}
public void setemail(String e){
	this.email=e;
}
public void setpassword(String p){
	this.password=p;
}
public void setmobile(long m){
	this.mobile=m;
}
public String getemail(){
	return this.email;
}
public long getmobile(){
	return this.mobile;
}
}