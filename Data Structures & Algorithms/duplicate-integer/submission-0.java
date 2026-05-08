class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            seen.add(i);
        }

        return seen.size() != nums.length;
    }
}