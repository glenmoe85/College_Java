public class Numbers{
	//vars
	private int[] initalNumbers;
	private int[] finalNumbers=new int[3];

	//constructor
	public Numbers(){

	}
	//set
	public void setInitialNumbers(int[] initialNumbers){
		this.initalNumbers=initialNumbers;
	}
	//compute
	public void computeFinalNumbers(){
		for(int i=0;i<initalNumbers.length;i++){
			finalNumbers[i]=initalNumbers[i]*9;
		}
	}
	//get
	public int[] getFinalNumbers(){
		return finalNumbers;
	}
}