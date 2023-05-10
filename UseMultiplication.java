package Methods;

public class UseMultiplication {
	public static void main(String[] args) {
		Multiplication a=new Multiplication();
		a.num1=10;
		a.num2=5;
		System.out.println(a.mul1());
		System.out.println(a.mul2(20,10));
		a.mul3();
		a.mul4(10,20);
	}

}
