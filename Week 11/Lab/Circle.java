public class Circle extends Shape{
	private double radius;
	private double area;

	public Circle(Double radius){
		this.radius=radius;
	}

	public Double getradius(){
			return radius;
	}
	@Override
	public void area(){
		area=(radius*radius)*3.14;
		System.out.println("Area is: "+area);
		//return area;

	}
}