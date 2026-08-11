class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> numsCons = new HashSet<>();
        int maximo=0;

        for (int num : nums) {
            numsCons.add(num);
        }

        for(int num:numsCons){
            int longitud=1;
            if(!numsCons.contains(num -1)){
                while(numsCons.contains(num + longitud)){
                    longitud++;
                }

                if(longitud > maximo){
                    maximo=longitud;
                }
            }
        }
        return maximo;
    }
}
