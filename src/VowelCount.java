import java.util.Scanner;
public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		int count=0;
		word.toUpperCase();
		for(int i=0;i<word.length();i++)
		 {
			 if((word.charAt(i)=='A')||(word.charAt(i)=='E')||(word.charAt(i)=='I')||(word.charAt(i)=='O')||(word.charAt(i)=='U'))
			 {
				 count++;
			 }
		 }
		   System.out.println(count);
	}

}
