class Solution {
    public String reverseVowels(String s) {
      int n = s.length();
      int i=0;
      int j=n-1;
      char[] word = s.toCharArray();
    //    char ch = word[i];
    //     char lt = word[j];
      while(i<j){
        if((word[i]=='a' || word[i] == 'e' || word[i]== 'i' || word[i] == 'o' || word[i]=='u'||
           word[i]=='A' || word[i] == 'E' || word[i]== 'I' || word[i]== 'O' || word[i]=='U') && 
           (word[j]=='a' || word[j] == 'e' || word[j]== 'i' || word[j] == 'o' || word[j]=='u'||
           word[j]=='A' || word[j] == 'E' || word[j]== 'I' || word[j]== 'O' || word[j]=='U')){
            char temp = word[i];
            word[i]=word[j];
            word[j] = temp;
            i++;
            j--;
          }
          else if(word[i]=='a' || word[i] == 'e' || word[i]== 'i' || word[i] == 'o' || word[i]=='u'|| word[i]=='A' || word[i] == 'E' || word[i]== 'I' || word[i]== 'O' || word[i]=='U'){
            j--;
          }
          else{
            i++;
          }
      }
      return new String(word);
    }
}