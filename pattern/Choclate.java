package pattern;

public class Choclate {

	public static void main(String[] args) {
		int n_cho = 9;
		int wrapper = 0;
		
		for(int i=1; i<=n_cho; i++) {
			   wrapper++;
			   if(wrapper%3 == 0) {
				   wrapper++;
			   }
			}
			System.out.println(wrapper);
	}

}
