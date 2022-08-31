public class ConditionalApp{
	public static void main(String[] args){
		int age=32;
		String msg;
		Conditional c;
		c=new Conditional();
		c.setAge(age);
		c.computMsg();
		msg=c.getmsg();
		System.out.println(msg);
	}
}