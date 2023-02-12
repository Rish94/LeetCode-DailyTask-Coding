class Solution {
    public String reverseWords(String s) { 
        List<Integer> l = new ArrayList(); 
        int n = s.length(); 
        char c [] = new char [n]; 
        for (int i=0; i<n; i++) { 
             char ch = s.charAt(i); 
             if(ch==' ')l.add(i-1); 
             c[i]=ch; 
        } 
        int start=0; l.add(n-1); 
        for (int end : l) {  
             int i = end; 
             while(start<end){
                  char t = c[start]; 
                  c[start]=c[end]; 
                  c[end]=t;  start++; end--;
             }
             start = i+2; 
        }
        return new String(c); 
    }
}