
public class StringVowel {

	public static void main(String[] args) {
			 String word="Hello Good Morning ";
			 int count=0;
			 
			 for(int i=0;i<word.length();i++)
			 {
				 if((word.charAt(i)=='A')||(word.charAt(i)=='E')||(word.charAt(i)=='I')||(word.charAt(i)=='O')||(word.charAt(i)=='U')||(word.charAt(i)=='a')||(word.charAt(i)=='e')||(word.charAt(i)=='i')||(word.charAt(i)=='o')||(word.charAt(i)=='u'))
				 {
					 count++;
				 }
			 }
			   System.out.println(count);
				}

			}

	