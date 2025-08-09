// Last updated: 8/9/2025, 1:29:30 PM
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] st = sentence.split(" ");
        for (int i = 0; i < st.length; i++) {
            if (st[i].startsWith(searchWord)) {
                return (i + 1);
            }
        }
        return -1;
    }
}