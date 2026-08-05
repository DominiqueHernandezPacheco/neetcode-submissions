class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] numRes=new int[2];
        int search;
        int index=0;
        HashMap <Integer, Integer> numeros=new HashMap<>();

        for (int num:nums){
            search=target-num;
            if(numeros.containsKey(search)){
                numRes[0]=numeros.get(search);
            numeros.put(num, index);
                numRes[1]=numeros.get(num);
            } else{
                numeros.put(num,index);
                index++;
            }
            
        }

        return numRes;
    } 
    
}