package practise;
//String create with new operator and without new
//Compare string using == when we create without new see same reference is there
//Compare string using new operator when new is present see different reference is there.
public class NewString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
