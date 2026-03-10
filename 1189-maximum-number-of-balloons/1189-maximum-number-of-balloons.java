class Solution {
    public int maxNumberOfBalloons(String text) {
        // Approach 1:
        // Map<Character, Integer> countText = new HashMap<>();

        // for (char c : text.toCharArray()) {
        //     countText.put(c, countText.getOrDefault(c, 0) + 1);
        // }

        // return Math.min(
        //     Math.min(
        //         countText.getOrDefault('b', 0), 
        //         countText.getOrDefault('a', 0)
        //     ),
        //     Math.min(countText.getOrDefault('n', 0),
        //         Math.min(
        //             countText.getOrDefault('l', 0)/ 2,
        //             countText.getOrDefault('o', 0)/ 2
        //         )
        //     )
        // );

        // Approach 2:
        Map<Character, Integer> countText = new HashMap<>();
        for (char c : text.toCharArray()) {
            countText.put(c, countText.getOrDefault(c, 0) + 1);
        }
        
        Map<Character, Integer> balloon = new HashMap<>();
        for (char c : "balloon".toCharArray()) {
            balloon.put(c, balloon.getOrDefault(c, 0) + 1);
        }

        int res = text.length();
        for (char c : balloon.keySet()) {
            res = Math.min(res, countText.getOrDefault(c, 0)/ balloon.get(c));
        }
        return res;
    }
}