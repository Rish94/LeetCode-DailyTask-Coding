class Solution {
    public int firstUniqChar(String s) {
        int r = Integer.MAX_VALUE;
        for(char id='a';id<='z';id++){
            if(s.indexOf(id)!=-1 && s.indexOf(id)==s.lastIndexOf(id)){
                r = Math.min(r,s.indexOf(id));
            }

        }
        return r==Integer.MAX_VALUE?-1:r;
    }
}