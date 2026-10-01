class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
      int n = nums.length;
      for(int i =0;i<n;i++){
        if(nums[i]>9){
           String s = String.valueOf(nums[i]);
           int l  = s.length();
           int j=0;
           while(j<l){
           list.add(s.charAt(j)-'0');
           j++;
           }
        }
        else{
            list.add(nums[i]);
        }
      }
      int[] arr = new int[list.size()];
      for(int i=0;i<list.size();i++){
        arr[i] = list.get(i);
      }
      return arr;  
    }
}