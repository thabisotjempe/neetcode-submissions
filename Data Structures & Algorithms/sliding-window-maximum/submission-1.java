class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];

        Stack<Integer> stack = new Stack<>();

        int l = 0;
        int r = 0;

        while (r < nums.length) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[r]) {
                stack.pop();
            }

            stack.push(r);

            if (!stack.isEmpty() && stack.firstElement() < l) {
                stack.remove(0);
            }

            if (r - l + 1 == k) {
                res[l] = nums[stack.firstElement()];
                l++;
            }

            r++;
        }

        return res;
    }
}
