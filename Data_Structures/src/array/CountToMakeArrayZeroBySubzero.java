package array;

import java.util.Arrays;

public class CountToMakeArrayZeroBySubzero {
	    boolean allZero(int[] nums){
	        int sum=0;
	        for(int i : nums){
	            sum+=i;
	        }
	        if(sum==0) return true;
	        return false;
	    }

	    void turnZero(int[] nums, int s, int e, int num){
	        for(int i=s; i<=e; i++){
	            if(nums[i]==num) nums[i] = 0;
	        }
	    }

	    int lowest(int[] nums){
	        int val=Integer.MAX_VALUE;
	        for(int i:nums){
	            if(val>=i && i!=0) val = i;
	        }
	        return val;
	    }
	    public int minOperations(int[] nums) {
	        int count=0;
	        int min=1;
	        boolean found=false;
	        while(!allZero(nums)){
	            System.out.println(Arrays.toString(nums));
	            int start_idx =0, end_idx = 0;
	            boolean starter = false;
	            for(int i=0; i<nums.length; i++){
	                if(nums[i]==min && !starter){
	                    start_idx = i;
	                    found=true;
	                    starter=true;
	                }
	                if(nums[i]==min || nums[i]==0){
	                    end_idx = i;
	                    if(nums[start_idx]==min)found=true;
	                    if(nums[i]==0 && starter) break;
	                }
	            }
	            turnZero(nums, start_idx, end_idx, min);
	            if(found)count++;
	            if(lowest(nums)>min){
	                min=lowest(nums);
	            }
	        }
	        return count;
	    }
}
