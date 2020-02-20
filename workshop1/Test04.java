package workshop1;

public class Test04 {
	
	public static void main(String[] args) {
		char ch = 'z';
		boolean b;
		if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
			b = true;
		else
			b = false;
		System.out.println(b);
	}
}
