public class LeapYear{
	//declare vars
	private int year;
	private String msg;
	//constructor
	public LeapYear(){
		year=0;
		msg="";
	}
	//set
	public void setYear(int year){
		this.year=year;
	}
	//compute
	public void computeIsLeapYear(){
		if((year % 4) == 0){
			if((year % 100)==0){
				if((year % 400)==0){
					msg=year+" is a Leap Year";
				}
				else{
					msg=year+" is not a Leap Year";
				}
			}
			else{
				msg=year+" is not a Leap Year";
			}
		}
		else{
			msg=year+" is not a Leap Year";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}