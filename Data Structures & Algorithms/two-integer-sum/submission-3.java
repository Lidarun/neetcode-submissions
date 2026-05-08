class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> differs = new HashMap<>();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (differs.containsKey(diff)) {
                Integer i1 = differs.get(diff);
                result[0] = i1;
                result[1] = i;
            } else {
                differs.put(nums[i], i);
            }
        }

        return result;
    }
}
