package algorithm.leet_370_end;

import java.util.Stack;

/**
 * Created by shu on 2016/9/27.
 */
public class Longest_Absolute_File_Path_388 {
    public Longest_Absolute_File_Path_388() {
    }

    public int lengthLongestPath(String input) {
        boolean isFile = false;
        if (input == null || input.isEmpty()) return 0;
        int max = -1;
        String[] tmp = input.split("\n");
        Stack<Integer> length = new Stack<>();
        Stack<Integer> spaces = new Stack<>();
        for (String str : tmp) {
            if (!isFile && str.contains("."))
                isFile = true;
            int space = countSpace(str);
            str = str.replaceAll("\\t", "");
            if (space == 0) {
                int len = str.length();
                spaces.push(0);
                length.push(len);
                max = Math.max(max, len);
            } else {
                while (!spaces.isEmpty() && spaces.peek() >= space) {
                    spaces.pop();
                    length.pop();
                }
                int len = length.peek() + 1 + str.length();
                spaces.push(space);
                length.push(len);
                max = Math.max(len, max);
            }
        }

        return isFile ? max : 0;
    }

    private int countSpace(String str) {
        int num = 0;
        while (str.charAt(num) == 32 || str.charAt(num) == '\t') {
            num++;
        }
        return num;
    }
}
