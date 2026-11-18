class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();
        int n = s2.length();

        if (k > n) return false;

        int[] count = new int[26];

        for (int i = 0; i < k; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        if (Arrays.equals(count, new int[26])) {
            return true;
        }

        for (int i = k; i < n; i++) {

            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - k) - 'a']++;

            if (Arrays.equals(count, new int[26])) {
                return true;
            }
        }

        return false;
    }
}