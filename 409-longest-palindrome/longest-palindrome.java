class Solution {
    public int longestPalindrome(String s) {
    HashMap<Character, Integer> countMap = new HashMap<>();
    for (char c : s.toCharArray()) {
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
    }
    
    int length = 0;
    boolean oddCountFound = false;
    
    for (int count : countMap.values()) {
        if (count % 2 == 0) {
            length += count;
        } else {
            length += count - 1;
            oddCountFound = true;
        }
    }
    
    if (oddCountFound) {
        length += 1;
    }
    
    return length;
    }
}