class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap <Integer, Integer> duplicate= new HashMap<>();

        for (int num:nums){
            if(!duplicate.containsKey(num)){
                duplicate.put(num,1);
            }else{
                duplicate.replace(num,duplicate.get(num)+1);
                return true;
            }
            
        }
        return false;
    }
}