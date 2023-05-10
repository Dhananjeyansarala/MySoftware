package Methods;

public class UseSubtraction {
	public static void main(String[] args) {
		Subtraction a=new Subtraction();
		a.num1=10;
		a.num2=5;
		System.out.println(a.sub1());
		System.out.println(a.sub2(100,50));
		a.sub3();
		a.sub4(100,30);
	}

}
