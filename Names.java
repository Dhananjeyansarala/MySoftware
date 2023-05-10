package Methods;

public class Names {
	public int sstartcount(String[] n) {
		int count=0;
		for(int i=0;i<n.length;i++) {
			if(n[i].startsWith("s")) {
				count++;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String [] values= {"siva","sasi","raju"};
		Names nam=new Names();
		System.out.println(nam.sstartcount(values));
	}

}
