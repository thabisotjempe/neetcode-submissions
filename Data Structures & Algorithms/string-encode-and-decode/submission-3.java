class Solution {

    public String encode(List<String> strs) {

        String s = "";

        for (String word: strs) {
            s += word.length() + "#" + word; 
        }
        return s;

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int l = 0, r = 0;
        while (r < str.length()) {
            
            while (str.charAt(r) != '#') {
                r++;
            }
            int length = Integer.parseInt(str.substring(l, r));
            l = r + 1;
            r = l + length;
            res.add(str.substring(l, r));
            l = r;
        }
        return res;
    }
}
