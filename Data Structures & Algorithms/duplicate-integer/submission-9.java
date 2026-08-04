class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> numbers=new HashMap<>();

        for(int num:nums){
            if (numbers.containsKey(num)){
             
            return true;
        }else{
            numbers.put(num,1);
             }

        }
        return false;
    }
} 