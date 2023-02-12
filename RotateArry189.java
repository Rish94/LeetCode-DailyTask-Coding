class Solution {
    public void rotate(int[] nums, int k) {
   
       
       int c=0;
    int b[]=new int[nums.length];
    k=nums.length-(k%nums.length);
    for(int i=k;i<nums.length;i++)
    {
    	b[c]=nums[i];
    	c++;
    }
    for(int j=0;j<k;j++)
    {
    	b[c]=nums[j];
    	c++;
    }
  for(int i=0;i<b.length;i++)
  {
     nums[i]=b[i];
      }
    }
}



        