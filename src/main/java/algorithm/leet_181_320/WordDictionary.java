package algorithm.leet_181_320;

/**
 * Created by songheng on 5/25/16.
 */
public class WordDictionary {
    private TreeNode root;

    public WordDictionary() {
        root = new TreeNode();
    }

    public void addWord(String word) {
        root.insert(word, 0);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return root.search(word, 0);
    }

    // Adds a word into the data structure.
    class TreeNode {
        boolean hasword;
        TreeNode[] children;

        public TreeNode() {
            children = new TreeNode[26];
            hasword = false;
        }

        void insert(String s, int index) {
            if (index == s.length()) {
                hasword = true;
                return;
            }
            char ch = s.charAt(index);
            int pos = ch - 'a';
            if (children[pos] == null)
                children[pos] = new TreeNode();
            children[pos].insert(s, index + 1);

        }

        boolean search(String s, int index) {
            if (index == s.length()) {
                return hasword;
            }
            char ch = s.charAt(index);
            boolean res = false;
            if (ch == '.') {
                for (int i = 0; i < 26; i++) {
                    if (children[i] != null) {
                        res |= children[i].search(s, index + 1);
                    }
                    if (res) {
                        break;
                    }
                }

            } else {
                if (children[ch - 'a'] == null) {
                    res = false;
                } else {
                    res = children[ch - 'a'].search(s, index + 1);
                }

            }
            return res;
        }
    }

}
