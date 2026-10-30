class Solution {
    public boolean isPalindrome(String str) {
        
        StringBuilder newStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        String s = newStr.toString();

        int left = 0;
        int right = s.length() - 1;

        while (left < s.length() && right >= 0) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
