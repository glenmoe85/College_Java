public class Conditional{
	private int age;
	private String msg;
	public Conditional(){
			age=0;
			msg="";
	}
	public void setAge(int age){
			this.age=age;
	}
	public void computMsg(){
		if(age>=18 && age<30){
			msg="You are over 18";
		}
		else if(age>=30){
			msg="You are over 30";
		}
		else{
			msg="You are under 18";
		}
	}
	public String getmsg(){
		return msg;
	}

}
