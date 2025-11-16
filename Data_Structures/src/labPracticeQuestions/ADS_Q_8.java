package labPracticeQuestions;
import java.util.*;
public class ADS_Q_8 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String stream = sc.nextLine();

	        int[] freq = new int[256];
	        Queue<Character> q = new LinkedList<>();

	        for (char ch : stream.toCharArray()) {

	            freq[ch]++;
	            q.add(ch);

	            // Remove repeated characters from queue front
	            while (!q.isEmpty() && freq[q.peek()] > 1) {
	                q.poll();
	            }

	            // Output result
	            if (q.isEmpty())
	                System.out.print("-1 ");
	            else
	                System.out.print(q.peek() + " ");
	        }
	    }

}
