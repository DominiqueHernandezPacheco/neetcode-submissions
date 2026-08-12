class Solution {
    public boolean isPalindrome(String s) {
        
        char [] chars=s.toLowerCase().toCharArray();
        int i=0;
        int j=chars.length-1;

            while(i<j){

                if(!Character.isLetterOrDigit(chars[i])){
                    i++;
                    continue;
                }

                if(!Character.isLetterOrDigit(chars[j])){
                    j--;
                    continue;
                }

                if(chars[i]!=chars[j]){
                    return false;
                }
                i++;
                j--;
            }
        return true;
    }
}
