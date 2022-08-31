public class CheckEmail{
	//vars
	private String emailAdd;
	private String [] emailExt;
	private String emailValid;

	//constructor
	public CheckEmail(){

	}
	//set
	public void setEmail(String emailAdd, String[] emailExt){
		this.emailAdd=emailAdd;
		this.emailExt=emailExt;
	}
	//compute
	public void computeEmail(){
		//check email
		if (emailAdd.contains("@")){
			emailValid="This email is valid it contains @ symbol";
			for(int i=0; i<emailExt.length; i++){
				if(emailAdd.endsWith("."+emailExt[i])){
					emailValid="This email is valid it contains @ symbol and email ext given";
					break;
				}
				else{
					emailValid="This email isnt valid: it has @ symbol but doesnt have email ext given";
				}
			}
		}
		else
		{
			emailValid="This email isnt valid: doesnt contain @ symbol";
		}
	}
	//get
	public String getEmailCheck(){
		return emailValid;
	}
}