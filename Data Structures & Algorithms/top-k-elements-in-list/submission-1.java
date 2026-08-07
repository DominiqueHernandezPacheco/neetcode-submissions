class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numeros = new HashMap<>();
        int[] frequent=new int [k];

        for (int num : nums) {
            numeros.put(num, numeros.getOrDefault(num, 0) + 1);
        }

        List < Map.Entry<Integer, Integer>> numsOrder = new ArrayList<>(numeros.entrySet());

        numsOrder.sort((a,b)->b.getValue()-a.getValue());

         for(int i=0;i<k;i++){
            frequent[i]=numsOrder.get(i).getKey();
         }
         return frequent;  
    }

}
