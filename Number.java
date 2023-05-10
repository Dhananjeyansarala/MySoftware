package Methods;

public class Number {
	public static void main(String[] args) {
		Number a=new Number();
		int vals=Integer.parseInt(args[0]);
		System.out.println(a.findOddEven(vals));
	}

	public int findOddEven(int n) {
			if(n%2==0) {
				return (n*n);
			}
			else {
				return (n*n*n);
			}
		}
	}


