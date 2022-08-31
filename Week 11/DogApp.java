public class DogApp{
	public static void main(String[] args){
		Dog dog1=new Dog("Labrador");
		Dog dog2=new Dog("Great Dane");
		//output
		System.out.println(dog1.getName());
		dog1.bark();

		//give 2nd dog name
		dog2.setName("Lassie");
		System.out.println(dog2.getName());
		dog2.bark();
	}
}