package Teleapps;

public class Rough {
	public static void main(String[] args) {
		String s = "This is java welcome to java";
		String str [] = s.split("'\\'");
//		String str [] = s.split("");
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}
}
