class Solution {
    public boolean isPalindrome(String s) {
        // Approach 1:
        // StringBuilder newStr = new StringBuilder();
        // for (char c : s.toCharArray()) {
        //     if (Character.isLetterOrDigit(c)) {
        //         newStr.append(Character.toLowerCase(c));
        //     }
        // }
        // return newStr.toString().equals(newStr.reverse().toString());

        // Approach 2:
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}