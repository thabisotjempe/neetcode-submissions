class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] result = new int[k];
        HashMap<Integer, Integer> freq = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());

        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

         for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = list.get(i);
            result[i] = entry.getKey();
         }
         return result;
    }
}
