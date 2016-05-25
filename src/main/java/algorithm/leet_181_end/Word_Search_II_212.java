package algorithm.leet_181_end;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 5/25/16.
 */
public class Word_Search_II_212 {
    private TreeNode root;

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        root = new TreeNode();
        if (words.length == 0 || board.length == 0)
            return res;
        int rowLen = board.length;
        int coLen = board[0].length;

        for (String word : words) {
            helper(board, res, rowLen, coLen, word);
        }
        return res;
    }

    private void helper(char[][] board, List<String> list, int rowLen, int coLen, String word) {
        int[][] support = new int[rowLen][coLen];
        TreeNode node = root.search(word, 0, support);
        if (node.level == word.length() - 1) {
            list.add(word);
        } else {
            search(support, board, node.row, node.col, word, node.level, node);
        }
    }

    private boolean search(int[][] support, char[][] board, int i, int j, String word, int index, TreeNode node) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }
        if (index == word.length()) {
            return true;
        }
        if (board[i][j] != word.charAt(index) || support[i][j] == 1)
            return false;
        support[i][j] = 1;
        boolean res;
        res = search(support, board, i + 1, j, word, index + 1)
                || search(support, board, i - 1, j, word, index + 1)
                || search(support, board, i, j + 1, word, index + 1)
                || search(support, board, i, j - 1, word, index + 1);
        support[i][j] = 0;
        return res;


    }

    class TreeNode {
        int level;
        int row, col;
        TreeNode[] children;

        public TreeNode() {
            this(-1, -1, -1);
        }

        public TreeNode(int level, int col, int row) {
            this.level = level;
            this.col = col;
            this.row = row;
            children = new TreeNode[26];
        }

        private TreeNode search(String s, int index, int[][] support) {
            if (index == s.length())
                return this;
            char ch = s.charAt(index);
            if (children[ch - 'a'] == null)
                return this;
            else {
                support[row][col] = 1;
                return children[ch - 'a'].search(s, index + 1, support);
            }
        }
    }
}
