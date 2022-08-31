public class SimpleYearBorn{
	//vars
	private int age;
	private int currentYr;
	private int yearBorn;
	//set
	public void setAge(int age){
			this.age=age;
	}
	public void setCurrentYr(int currentYr){
		this.currentYr=currentYr;
	}
	//compute
	public void computeYearBorn(){
			yearBorn=currentYr-age;
	}
	//get
		public int getYearBorn(){
			return yearBorn;
	}
}