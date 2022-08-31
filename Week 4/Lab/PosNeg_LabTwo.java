public class PosNeg_LabTwo{
	private int num;
	private String msg;
	public PosNeg_LabTwo(){
			num=0;
			msg="";
	}
	public void setNum(int num){
			this.num=num;
	}
	public void computeMsg(){
		if(num>=0){
			msg="This is a positive number";
		}
		else if(num<0){
			msg="This is a negative number";
		}
		else{
			msg="Input not a number, try again";
		}
	}
	public String getMsg(){
		return msg;
	}

}
