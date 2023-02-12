import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a = 0;
       int b = 0;
       int indx = 0;
       int[] ans = new int[m+n];
        while(a<m && b<n){

            if(nums1[a]<=nums2[b]){
                ans[indx] = nums1[a];
                a++;
                indx++;
            }else{
                ans[indx] = nums2[b];
                b++;
                indx++;
            }
        }
        while(a<m){
            ans[indx] = nums1[a];
                a++;
                indx++;
        }

        while(b<n){
            ans[indx] = nums2[b];
                b++;
                indx++;
        }
        for(int i=0;i<ans.length;i++){
            nums1[i] = ans[i];
        }
    }
}