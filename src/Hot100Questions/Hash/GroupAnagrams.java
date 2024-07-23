package Hot100Questions.Hash;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GroupAnagrams {
    /**
     * LeetCode 49 - Group Anagrams
     * Groups anagrams from an array of strings.
     * <p>
     * This method takes an array of strings and groups them based on whether they are anagrams of each other.
     * Two strings are considered anagrams if they have the same characters but in a different order.
     * <p>
     * Time complexity: O(n * k) where n is the number of strings and k is the maximum length of a string in the input array.
     * Space complexity: O(n * k) where n is the number of strings and k is the maximum length of a string in the input array.
     * <p>
     * Time: O(n * k) | Space: O(n * k)
     **/
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] count = new char[26];
            for (char c : s.toCharArray()) {
                count[c - 'a'] += 1;
            }
            String key = String.valueOf(count);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
            // map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
