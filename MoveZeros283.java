import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr.add(nums[i]);
            }
        }
        int l = nums.length-arr.size();
        int k = 0;
        //COPY FROM ARRAY LIST TO ARRAY
        for(k=0;k<arr.size();k++){
            nums[k] = arr.get(k);
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
        // return a;
    }
}