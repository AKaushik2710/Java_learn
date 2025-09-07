package trial;
import java.util.Arrays;
class Solution {
//    public static int removeDuplicates(int[] nums) {
//        int[] tempArr = new int[nums.length];
//        int uniqueElements=0;
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums.length; j++){
//                if(tempArr[j] == nums[i]){
//                    break;
//                }
//                else{
//                    tempArr[uniqueElements] = nums[i];
//                    uniqueElements++;
//                    break;
//                }
//            }
//        }
////        nums = Arrays.copyOf(tempArr, uniqueElements);
//        for(int i=0; i<uniqueElements; i++) {
//        	nums[i] = 
//        }
//        return uniqueElements;
//    }
	public static int removeDuplicates(int[] nums) {
//        int[] tempArr = new int[nums.length];
//        int uniqueElements=0;
//        boolean found = false;
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums.length; j++){
//                if(tempArr[j] == nums[i]){
//                    found = true;
//                    break;
//                }
//            }
//            if(!found){
//                tempArr[uniqueElements] = nums[i];
//                    uniqueElements++;
//            }
//            found = false;
//        }
//        nums = Arrays.copyOf(tempArr, uniqueElements);
//        return uniqueElements;
		int n=nums.length;
        int j=0;
        int count=0;
        for(int i=0; i<n; i++){
            if(nums[j] != nums[i] ){
                nums[++j] = nums[i];
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,1,2};
		System.out.println(removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}
}
