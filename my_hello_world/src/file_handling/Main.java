package file_handling;

public class Main {
public static String longestCommonPrefix(String[] strs) {
        
        for(int i=0; i< strs.length; i++){
                for(char c : strs[i].toCharArray()){
                    if(c == 'e') {
                    	System.out.println(23);
                    }
                }
        }
        return "er";
    }
public static void main(String[] args) {
	String[] str = {"12","er"};
	longestCommonPrefix(str);
}
}
