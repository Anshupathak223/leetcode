class Solution {
    public int findLHS(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      int i=0;
      int j=0;
      int maxlen=0;
      while(j<n){
        if(nums[j]-nums[i]==1){
            maxlen = Math.max(maxlen,j-i+1);
               j++;
        }
        else if(nums[j]-nums[i]<1){
            j++;
        }
        else{
            i++;
        }
      }
     
   
      return maxlen;
    }
}