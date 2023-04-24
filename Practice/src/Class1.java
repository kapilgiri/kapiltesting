import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class1 {
	public static void main(String[] args) {
		 String a1 = "ramagama"; 
		 findWordCount(a1);
		 removeDuplicates(a1);
		 removeDuplicates1(a1);
		
	}
	
	private static void findWordCount(String a1) {
		Map<Character, Integer> m1  = new HashMap<>();
		 int cnt = 0;
		 char c;
		 for (int i = 0; i < a1.length(); i++) {
				c = a1.charAt(i);
				cnt = 0;
				for (int j = 0; j < a1.length(); j++) {
					if(c == a1.charAt(j)) {
						cnt++;
					}
				}

				m1.put(c, cnt);
		}
		 System.out.println("m1>>>"+m1);
	}
	
	
	private static void getUniqueChars(String a1) {
		
		Set<Character> charSet = new HashSet<>();
		
		for (int i = 0; i < a1.length(); i++) {
			charSet.add(a1.charAt(i));
		}
		
		System.out.println(charSet);
	}
	
	private static void removeDuplicates(String a1) {
		
		String s = "";//ramagama
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a1.length(); i++) {
			char c = a1.charAt(i);
			int count = 0;
			for (int j = 0; j < a1.length(); j++) {
				char c1 = a1.charAt(j);
				if(c == c1) {
					count++;
				}
			}
			
			if(count == 1) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
	
	private static void removeDuplicates1(String a1) {
		
		//ramagama
		StringBuilder sb = new StringBuilder(); //"ramg".indexOf('a') = 1
		for (int i = 0; i < a1.length(); i++) {
			char c = a1.charAt(i);
			if(sb.toString().indexOf(c) < 0) {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
	}

}
