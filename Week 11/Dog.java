public class Dog{
	//vars
	private String name;
	private String breed;
	//constructor
	public Dog(String breed){
		this.breed=breed;
		name="Stray";
	}
	//nethods
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void bark(){
		System.out.println("Woof!");
	}
}
