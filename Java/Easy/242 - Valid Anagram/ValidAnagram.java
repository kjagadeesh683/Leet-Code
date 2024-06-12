public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i : freq) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}

// brute force approach 
// Time complexity: O(n*logn)

// if(s.length() != t.length()) {
//     return false;
// }

// char[] sChars = s.toCharArray();
// char[] tChars = t.toCharArray();

// Arrays.sort(sChars);
// Arrays.sort(tChars);

// return new String(sChars).equals(new String(tChars));
