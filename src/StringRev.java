
public class StringRev {
	
	public static void main(String[] args) {
		String word="hello good morning";
		String rev="";
		int len=word.length()-1;
		for(int i=len;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);		
	}
}
