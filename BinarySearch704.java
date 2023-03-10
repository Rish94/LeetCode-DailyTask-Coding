class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while(low<high){
            int mid = (high-low)/2+low;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = high -1;
            }
        }
        return -1;
    }
}

