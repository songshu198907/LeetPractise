package algorithm.leet_61_75;

import java.util.Stack;

/**
 * Created by songheng on 4/2/16.
 */
public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        String[] chars = path.split("/");
        Stack stack = new Stack();
        for (String ch : chars) {
            if (ch.equals(".")) {
                continue;
            } else if (ch.equals("..")) {
                if(!stack.isEmpty())
                stack.pop();
            } else if ("".equals(ch.trim())) {
                continue;
            } else {
                stack.push(ch.trim());
            }

        }
        System.out.println(stack.toString());
        String res = "";

        while (!stack.isEmpty()) {
            String ele = (String) stack.pop();
            if (!"".equals(ele)) {
                res = "/" + ele + res;

            }

        }
        if("".equals(res)){
            res = "/";
        }
        return res;

    }
}
