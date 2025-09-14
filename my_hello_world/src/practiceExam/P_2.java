package practiceExam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_2 {
	void wordCount() {
		String str = "I love Java and I love coding";
		String[] words = str.split(" ");
		HashMap<String, Integer> myHash= new HashMap<>();
		for(String i : words) {
			if(myHash.containsKey(i)) {
				myHash.put(i, myHash.get(i)+1);
			}
			else {
				myHash.put(i, 1);
			}
		}
		
		System.out.println(myHash);
	}
	
	void studentMarks() {
		HashMap<String, Integer> myHash = new HashMap<>();
		myHash.put("Aman", 78);
		myHash.put("Kaushik", 87);
		myHash.put("Himanshu", 66);
		
		String highStud = "";
		int marks = 0;
		for(Map.Entry<String, Integer> m : myHash.entrySet()) {
			if(m.getValue()>marks) {
				marks=m.getValue();
				highStud = m.getKey();
			}
		}
		
		System.out.println(highStud + " "+ marks);
	}
	
	void charFrequency() {
		String str = "I love Java and I love coding";
		String[] words = str.split("");
		HashMap<Character, Integer> myHash = new HashMap<>();
		for(int i=0; i<words.length; i++) {
			if(myHash.containsKey(words[i].charAt(0))) {
				myHash.put(words[i].charAt(0), myHash.get(words[i].charAt(0))+1);
			}
			else {
				myHash.put(words[i].charAt(0), 1);
			}
		}
		
		System.out.println(myHash);
	}
	
	void keyChecker() {
		HashMap<String, Integer> myHash = new HashMap<>();
		myHash.put("Aman", 78);
		myHash.put("Kaushik", 87);
		myHash.put("Himanshu", 66);
		
		if(myHash.containsKey("Aman")) System.out.println(myHash.get("Aman"));
	}
	
	void swaapper() {
		HashMap<String, Integer> myHash = new HashMap<>();
		myHash.put("Aman", 78);
		myHash.put("Kaushik", 87);
		myHash.put("Himanshu", 66);
		HashMap<Integer, String> myNewhash = new HashMap<>();
		for(Map.Entry<String, Integer> m : myHash.entrySet()) {
			myNewhash.put(m.getValue(), m.getKey());
		}
		System.out.println(myNewhash);
	}
	
	String sorted(String name) {
		String returner = "";
		char temp;
		for(int i=0; i<name.length()-1; i++) {
			for(int j=1; j<name.length(); j++)
				if(name.charAt(i)>name.charAt(j)) {
				returner += name.charAt(i+1);
			}
		}
		return returner;
	}
	void anagram() {
		ArrayList<String> myArr = new ArrayList<>(Arrays.asList("eat","tea","tan","ate","nat","bat"));
		HashMap<String, ArrayList<String>> myHash = new HashMap<>();
		String key = "";
		
		for(int i=0; i<myArr.size()-1; i++) {
			
			myHash.put(key, myArr);
		}
		
	}
}
