package lab_exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FourteenOct {
	    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
	        int count = 1;
	        int finalCount=0;
	        HashSet<Integer> hash = new HashSet<>();
	        int startIndex=nums.size()+1;
	        if(k==1 && nums.size()>=2) return true;
	        for(int j=0; j<nums.size(); j++) {
	        	if(hash.contains(j)) continue;
	        	startIndex=j;
	        	System.out.println("Outer loop count "+count);
	        	for(int i=j; i<nums.size()-1; i++){
	        		
	        		System.out.println("Count right now "+count);
	        		System.out.println("Final Count right now "+ finalCount);
		            if(nums.get(i)<nums.get(i+1)){
		                count++;
		            }
		            else{
		                if(count>=k){
		                    finalCount++;
		                    count=1;
		                    hash.add(startIndex);
		                    hash.add(i);
		                }
		                startIndex=i+1;
		                count=1;
		            }
		            System.out.println("Inner count v "+count + " for "+nums.get(i)+" "+nums.get(i+1));
		            if(count>=k){
		            	System.out.println("Count value "+count);
	                    finalCount++;
	                    
	                    count=1;
	                    hash.add(startIndex);
	                    System.out.println(" Running inside "+startIndex + " "+i);
	                    hash.add(i+1);
	                    break;
	                }
		        }
//	        	if(count>=k)finalCount++;
	        	count=1;
	        }
	        if(count>=k)finalCount++;
	        System.out.println(finalCount);
	        return finalCount>=2;
	    }
	    public static void main(String[] args) {
			List<Integer> l = new ArrayList<>();
//			l.add(1);
//			l.add(2);
//			l.add(3);
//			l.add(4);
//			l.add(5);
//			l.add(6);
//			l.add(4);
//			l.add(5);
//			l.add(6);
//			l.add(7);
//			l.add(-3);
//			l.add(-18);
//			l.add(8);
//			l.add(-16);
//			l.add(-15);
//			l.add(3);
//			l.add(16);
//			l.add(0);
			l.add(13);
			l.add(4);
			l.add(-7);
			l.add(-6);
			System.out.print(hasIncreasingSubarrays(l, 2));
		}
}
