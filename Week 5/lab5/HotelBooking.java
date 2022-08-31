public class HotelBooking{
	//declare vars
	private int age,numOfNights;
	private double cost, priceOfRoom;
	private String msg;
	//constructor
	public HotelBooking(){
		age=0;
		numOfNights=0;
		priceOfRoom=90.00;
		cost=0.0;
		msg="";
	}
	//set
	public void setAge(int age){
		this.age=age;
	}
	public void setNumOfNights(int numOfNights){
		this.numOfNights=numOfNights;
	}
	//compute
	public void computeCostOfStay(){
		if(age>=18){
			cost=priceOfRoom*numOfNights;
			msg="Your room has been booked for "+numOfNights+" nights for the price of "+cost;
		}
		else{
			if(age<18){
				msg="You can not book a room as you are under 18";
			}
			else{
				System.out.println("Invalid entry for booking, Please book try again");
			}
		}
	}
	//get
	public String getRoomCost(){
		return msg;
	}
}