public class ShapeMakerApp{
	public static void main(String[] args){
		Circle c1=new Circle(5.2);
		Shape s1=new Shape();
		c1.setName("Circle");
		c1.getName();
		c1.area();
		c1.setColour("Red");
		c1.getColour();

		s1.setName("Square");
		s1.getName();
		s1.setHeight(2.5);
		s1.setWidth(2.5);
		s1.area();
		s1.getColour();
	}
}