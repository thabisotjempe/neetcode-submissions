class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);

        String sortedS1 = new String(s1Arr);

        System.out.println("to check -- " + sortedS1);

        int k = s1.length();
        int n = s2.length();

        for (int i = 0; i <= n - k; i++) {
            int left = i;
            int right = i + k - 1;

            String s1InS2 = s2.substring(left, right + 1);

            char[] s1ins2Arr = s1InS2.toCharArray();
            Arrays.sort(s1ins2Arr);

            String sortedS1ins2 = new String(s1ins2Arr);

            System.out.println("checked -- " + sortedS1ins2);

            if (sortedS1.equals(sortedS1ins2)) {
                return true;
            }
        }
        return false;
    }
}
