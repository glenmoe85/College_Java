public class PasswordAnalyser{
	//vars
	private String password,msg;
	private int digitCount;
	private int specialChar;
	//constructor
	public PasswordAnalyser(){
		msg="Password is weak";
		digitCount=0;
		specialChar=0;
	}
	//set
	public void setPassword(String password){
		this.password=password;
	}
	//compute
	public void computeStrength(){
		if(password.length()>=10){
			for(int i=0; i<password.length();i++){
				if(password.charAt(i)=='0' || password.charAt(i)=='1' || password.charAt(i)=='2' || password.charAt(i)=='3'  || password.charAt(i)=='4' || password.charAt(i)=='5' || password.charAt(i)=='6' || password.charAt(i)=='7' || password.charAt(i)=='8' || password.charAt(i)=='9' ){
					digitCount++;
				}
			}
			if(digitCount>=2){
				for(int i=0; i<password.length();i++){
					if(password.charAt(i)=='&' || password.charAt(i)=='+' || password.charAt(i)=='@' || password.charAt(i)=='?' ){
						specialChar++;
					}
				}
			}
			if(specialChar>0){
				msg="password is good";
			}

		}

	}
	//get
	public String getMsg(){
		return msg;
	}
}