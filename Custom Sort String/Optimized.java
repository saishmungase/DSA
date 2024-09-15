public class Optimized {
    public static String customSortString(String order, String s) {
        int[] freq = new int[26];
        
        // Clean Way To count Frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Add Character Based on each element of order string.
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                result.append(c);//Use append and avoiding iterator c
                freq[c - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                result.append((char) (i + 'a'));
                freq[i]--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        String solution = customSortString(order, s);
        System.out.println(solution);
        
        order = "bcafg";
        s = "abcd";
        solution = customSortString(order, s);
        System.out.println(solution);
    }
}