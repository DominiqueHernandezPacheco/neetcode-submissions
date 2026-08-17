class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int [] sumNums= new int[2];

        while (i < j) {
            if (numbers[i] + numbers[j] != target) {
                if (numbers[i] + numbers[j] < target) {
                    i++;
                    continue;
                }

                if (numbers[i] + numbers[j] > target) {
                    j--;
                    continue;
                }
            } else{
                sumNums[0]=i+1;
                sumNums[1]=j+1;
                break;
            }
        }
        return sumNums;
    }
}
