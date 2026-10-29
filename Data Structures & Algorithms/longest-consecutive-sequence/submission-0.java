class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> seqs = new HashSet<>();

        for (int num : nums){
            seqs.add(num);
        }
        int longestStreak = 0;
        
        for (int num : nums) {
            if(!seqs.contains(num - 1)) {
                int curr = num;
                int currStreak = 1;

                while(seqs.contains(curr + 1)) {
                    curr++;
                    currStreak++;
                }

            longestStreak = Math.max(longestStreak, currStreak);

            }

        }
        return longestStreak;
        
    }
}
