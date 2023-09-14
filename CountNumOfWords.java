package STRING;

public class CountNumOfWords { 
	public static int countWords(String str) { 
		int count=1; 
		for(int i=0;i<str.length();i++) { 
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') { 
				count++;
			}
		} 
		return count;
	} 
	public static void main(String[] args) {
		String s="It works on my machine"; 
		System.out.println(countWords(s));
	}
       
}
