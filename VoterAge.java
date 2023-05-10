 package Methods;

public class VoterAge {
	public String findEligibilityForVote(int[] age) {
		for(int i=0;i<age.length;i++) {
			if(age[i]>18) {
				return "ELIGIBLE";
			}
			else if(age[i]<18) {
				
				return "NOT ELIGIBLE";
			}
		}
		return "ELIGIBLE";
	}
	public static void main(String[] args) {
		VoterAge a=new VoterAge();
		int [] age= {Integer.parseInt(args[0])};
		System.out.println(a.findEligibilityForVote(age));
	
	}
}

