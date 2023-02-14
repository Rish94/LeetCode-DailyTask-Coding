public class LongestPalindromeStringMake {
    public static int longestPalindrome(String s) {
        int[] arr = new int[127];
        for(int i=0;i<s.length();i++){
            arr[(int)s.charAt(i)]++;
        }
        int ans = 0;
        boolean oddagyakenhe = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               ans = ans + arr[i];
            }else{
                if(oddagyakenhe==false){
                    ans = ans + arr[i];
                    oddagyakenhe = true;
                }else{
                    ans = ans + (arr[i]-1);
                }
            }
           
        }
        return ans;
        
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = longestPalindrome(s);
		System.out.println(ans);
		
		
	}
}


