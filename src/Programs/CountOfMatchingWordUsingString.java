package Programs;

public class CountOfMatchingWordUsingString {
	public static void main(String[] args) {

		String s1 = "hiii how are you ,hiii welcome to teleapps,hiii had your breakfast,hiii thanks visiting";
		String s2 = "hiii";

		String s3[] = s1.toLowerCase().split(s2);
		System.out.println("your word is :" + s2 + " " + "\nyour word count is:" + " " + (s3.length - 1));

		}
}
