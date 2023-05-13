package Anagram;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()) {
            return false;
        }
        int[] letters = new int[26];
        for(int i = 0; i < a.length(); i++) {
            letters[a.charAt(i) - 'a']++;
            letters[b.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
