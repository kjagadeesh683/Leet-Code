class Solution {
    public boolean isAnagram(String s, String t) {

        // Approach 1:
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // Map<Character, Integer> map = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }
        // for (char c : t.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) - 1);
        // }
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() != 0) {
        //         return false;
        //     }
        // }
        // return true;

        //Approach 2:
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}