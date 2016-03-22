package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by songheng on 3/18/16.
 */
public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if(s==null || s.length() ==0 ) {
            return true;
        }
        boolean pass = true;
        Map<Character , Integer > map = new HashMap<>();
        map.put('(' ,1);
        map.put(')' ,-1);
        map.put('{' ,2);
        map.put('}' ,-2);
        map.put('[' ,3);
        map.put(']' ,-3);
        Stack<Character> stack = new Stack<>();
        int expected = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                int value = map.get(s.charAt(i));
                if(value > 0 ){
                    stack.push(s.charAt(i));
                    expected = 0 - value;
                }
                else{
                    if(stack.isEmpty()){
                        pass = false;
                        break;
                    }
                    if( expected == value){
                        stack.pop();
                        expected = stack.isEmpty()? 0 : 0 - map.get(stack.peek());
                    }
                    else{
                        pass = false;
                        break;
                    }
                }

            }
        }
        if(!stack.isEmpty()){
            pass = false;
        }

        return pass;


    }
}
