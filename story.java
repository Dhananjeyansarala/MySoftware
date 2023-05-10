package Methods;

import java.util.Optional;

public class story {
	public static void main(String[] args) {
		String a=null;
		Optional <String> check=Optional.ofNullable(a);
		if(check.isEmpty()) {//if null given it return string is empty
			//if name given it will return string is present
			//isEmpty =if value is present it will return present otherwise is empty.
			System.out.println("String is present");
		}
		else {
			System.out.println("String is empty");
		}
	}

}
