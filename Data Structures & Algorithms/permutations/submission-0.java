class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        backtrack(nums, new ArrayList<>());

        return res;
    }

    public void backtrack(int[] nums, List<Integer> cur) {

        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (cur.contains(nums[i])) {
                continue;
            }

            cur.add(nums[i]);

            backtrack(nums, cur);

            cur.remove(cur.size() - 1);
        }
    }
}