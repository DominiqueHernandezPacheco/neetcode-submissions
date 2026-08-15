class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for (int k=0; k<nums.length;k++) {
            int i = 0;
            int j = nums.length - 1;
            while (i < j) {
                if (i == k) {
                    i++;
                    continue;
                }

                if (j == k) {
                    j--;
                    continue;
                }

                if (nums[k] + nums[i] + nums[j] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[k]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);

                    Collections.sort(temp);

                    if (triplets.contains(temp)) {
                        i++;
                        j--;
                        continue;
                    } else {
                        i++;
                        j--;
                        triplets.add(temp);
                    }

                } else {
                    if (nums[k] + nums[i] + nums[j] > 0) {
                        j--;
                        continue;
                    }

                    if (nums[k] + nums[i] + nums[j] < 0) {
                        i++;
                        continue;
                    }
                }
            }
        }
        return triplets;
    }
}
