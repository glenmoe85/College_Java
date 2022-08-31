public class SimpleAdditionUserInput{
	//declare vars
	private int x;
	private int y;
	private int ans;

	public SimpleAdditionUserInput(){
		x=0;
		y=0;
		ans=0;
	}
	//set
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void computeAns(){
		ans=x+y;
	}
	public int getAns(){
		return ans;
	}
}