class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        String[] arrS = s.split("");
        String[] arrT = t.split("");
        Arrays.sort(arrT);
        Arrays.sort(arrS);

        if (Arrays.equals(arrT, arrS)) return true;
        return false;
    }
}
