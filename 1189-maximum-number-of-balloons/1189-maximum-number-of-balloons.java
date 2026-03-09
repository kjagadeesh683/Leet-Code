class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> countText = new HashMap<>();

        for (char c : text.toCharArray()) {
            countText.put(c, countText.getOrDefault(c, 0) + 1);
        }

        return Math.min(
            Math.min(
                countText.getOrDefault('b', 0), 
                countText.getOrDefault('a', 0)
            ),
            Math.min(countText.getOrDefault('n', 0),
                Math.min(
                    countText.getOrDefault('l', 0)/ 2,
                    countText.getOrDefault('o', 0)/ 2
                )
            )
        );
    }
}