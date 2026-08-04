class Solution {
    public boolean isAnagram(String s, String t) {
        char[] palabraA = s.toCharArray();
        char[] palabraB = t.toCharArray();

        HashMap<Character, Integer> wordA = new HashMap<>();
        HashMap<Character, Integer> wordB = new HashMap<>();

        for (char letra : palabraA) {
            wordA.put(letra, wordA.getOrDefault(letra, 0) + 1);
        }
        for (char letra : palabraB) {
            wordB.put(letra, wordB.getOrDefault(letra, 0) + 1);
        }
        if (wordA.equals(wordB)) {
            return true;
        }
        return false;
    }
}
