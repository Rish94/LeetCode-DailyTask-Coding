class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
         int ind_s = 0, ind_t = 0;
        while(ind_s < s.length() && ind_t < t.length())
        {
            if(s.charAt(ind_s) == t.charAt(ind_t)) 
            {
                ind_s++;
            }
            
            ind_t++;
        }
        return ind_s == s.length();
    }
    }