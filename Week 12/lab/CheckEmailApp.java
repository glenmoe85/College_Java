import javax.swing.JOptionPane;
public class CheckEmailApp{
	public static void main(String[] args){
		//vars
		String email=JOptionPane.showInputDialog(null,"Enter in your email address");
		String [] emailExt = new String[3];

		for(int i=0; i<emailExt.length;i++){
			emailExt[i]=JOptionPane.showInputDialog(null,"Enter in your 3 character email ext (eg com, gov, net");
		}
		String check;
		//declare obj
		CheckEmail e;
		e=new CheckEmail();

		//set
		e.setEmail(email, emailExt);
		//compute
		e.computeEmail();
		//get
		check=e.getEmailCheck();
		//output

		JOptionPane.showMessageDialog(null, check);
	}
}