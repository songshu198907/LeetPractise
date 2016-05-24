package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/24/16.
 */

class TrieNode {
    // Initialize your data structure here.
    public Character ch;
    public List<Character> childrenVal;
    public List<TrieNode> children;

    public TrieNode() {
        this('-');

    }

    public TrieNode(Character ch) {
        this.ch = ch;
        children = new ArrayList<>();
        childrenVal = new ArrayList<>();
    }

    public void insert(String str) {
        if (str.isEmpty()) {
            childrenVal.add('1');
            children.add(new TrieNode());
            return;
        }
        char ch = str.charAt(0);
        if (childrenVal.contains(ch)) {
            int pos = childrenVal.indexOf(ch);
            children.get(pos).insert(str.substring(1));
        } else {
            TrieNode nChild = new TrieNode(ch);
            childrenVal.add(ch);
            children.add(nChild);
            nChild.insert(str.substring(1));
        }
    }

    public boolean find(String str) {
        if (str.isEmpty()) {
            return childrenVal.contains('1');
        } else {
            if (childrenVal.contains(str.charAt(0))) {
                int pos = childrenVal.indexOf(str.charAt(0));
                return children.get(pos).find(str.substring(1));
            } else return false;
        }
    }

    public boolean startWith(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (childrenVal.contains(str.charAt(0))) {
            int pos = childrenVal.indexOf(str.charAt(0));
            return children.get(pos).startWith(str.substring(1));
        } else return false;
    }

}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        root.insert(word);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return root.find(word);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        return root.startWith(prefix);
    }
}
