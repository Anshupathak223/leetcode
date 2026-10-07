class Solution {
    public String reverseOnlyLetters(String s) {
      int n = s.length();
      int i=0;
      int j = n-1;
      char[] arr = s.toCharArray();
      while(i<j){
        if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        else if(Character.isLetter(arr[i])){
            j--;
        }
        else{
            i++;
        }
      }  
      return new String(arr);
    }
}