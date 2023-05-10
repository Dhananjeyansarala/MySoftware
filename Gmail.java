package Methods;

public class Gmail {
	public void getLogin(String mailName,String mailPassword) {
		if(mailName.equalsIgnoreCase("support@onesofts.in")&&mailPassword.equals("onesoftTECHNOLOGY123")) {
			System.out.println("Login Succcess");
		}
		else {
			System.out.println("Login Failed");
		}
	}
	public static void main(String[] args) {
		Gmail a=new Gmail();
		String num1=args[0];
		String num2=args[1];
		a.getLogin(num1,num2);
	}

}
