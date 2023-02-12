/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1;
            int last = n;
            int ans = 0;
            while(start<=last){
                int mid = start + ((last-start)/2);
                if(isBadVersion(mid)==true){
                    ans = mid;
                    last = mid - 1;
                }else{
                    start = mid +1;
                }
            }
           return ans; 
        }
    }