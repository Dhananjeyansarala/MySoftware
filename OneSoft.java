package Methods;

public class OneSoft {
	public String lmsTest(boolean isLmsCompletedUptoTopic) {
			if(isLmsCompletedUptoTopic==true) {
				return "Next Topic Class";
		}
			else {
				return "Today Also LmsTest";
			}
	}
	public static void main(String[] args) {
				OneSoft a=new OneSoft();
				boolean  vals=Boolean.parseBoolean(args[0]);
				System.out.println(a.lmsTest(vals));
				
			}
	}


