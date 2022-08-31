public class Shape{
	private Double width;
	private Double height;
	private String colour;
	private Double area;
	private String name;

	public Shape(){
		colour="Yellow";

	}
	public void setName(String name){
			this.name=name;
	}
	public void getName(){
			System.out.println(name);
	}

	public void setHeight(Double height){
		this.height=height;
	}
	public void setWidth(Double width){
		this.width=width;
	}
	public void setColour(String colour){
			this.colour=colour;
	}
	public void getColour(){
		System.out.println("Colour of shape is: "+colour);
	}
	public void area(){
		area=width*height;
		System.out.println("Shape area is:" +area);
	}
}