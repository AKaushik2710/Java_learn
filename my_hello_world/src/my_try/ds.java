package my_try;
import java.util.Arrays;
public class ds {
	    public static int[] sortIT(int [] nums){
            int temp=0;
	        for(int i =0; i<nums.length-1; i++){
	            for(int j=i+1; j<nums.length; j++){
	                if(nums[i]>nums[j]){
	                    temp=nums[j];
	                    nums[j] = nums[i];
	                    nums[i] = temp;
	                }
	            }
	        }
	        return nums;
	    }
	    public static double func(int[] nums1, int[] nums2) {
	        int[] merged = new int[nums1.length+nums2.length];
	        for(int i=0; i<nums1.length; i++){
	            merged[i] = nums1[i];
	        }
	        for(int i=0; i<nums2.length; i++){
	            merged[i+nums1.length] = nums2[i];
	        }

	        int[] sorted = sortIT(merged);
	        int sum=0;
	        for(int i=0; i<sorted.length; i++){
	            sum+=sorted[i];
	        }

	        int answer = sum / sorted.length;
	        System.out.println(sum);
	        System.out.println(Arrays.toString(sorted));
	        System.out.println(Arrays.toString(merged));
	        System.out.println(Arrays.toString(nums1));
	        System.out.println(Arrays.toString(nums2));
	        return answer;
	    }
	    public static void main(String args[]) {
	    	int[] num1 = {1,3};
	    	int [] num2 = {2};
	    	System.out.print(func(num1, num2));
	    }
	    }
