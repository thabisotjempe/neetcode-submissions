
class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (Integer num: nums) {
            if (numsMap.containsKey(num)) {
                duplicate = true;
            } else {
                numsMap.put(num, 1);
            }
        }
        return duplicate;
    }
}