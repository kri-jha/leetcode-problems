import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> l = new ArrayList<>(map.keySet());
        
        // FIX 1: Added parentheses around (a, b)
        l.sort((a, b) -> map.get(b) - map.get(a));

        // FIX 2: Capitalized the 'B' in StringBuilder
        StringBuilder sb = new StringBuilder();
        
        for (char c : l) {
            int count = map.get(c);
            
            // FIX 3: Changed 'icount' to 'i < count'
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}