class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secondmax= -1;
        
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(Character.isDigit(ch)){
            int digit = ch-'0';
            if(digit> max){
                secondmax = max;
                max = digit;
            }
            else if(secondmax<digit&& digit!=max){
              secondmax= digit;
            }
    
        }
       } 
       return secondmax;
    }
}