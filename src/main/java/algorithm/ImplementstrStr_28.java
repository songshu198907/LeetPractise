package algorithm;

import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec;

/**
 * Created by songheng on 3/22/16.
 */
public class ImplementstrStr_28 {
    public int strStr(String haystack, String needle) {

        char[] needles = needle.toCharArray();
        int head = -1;

        if (haystack == null
                ||
                haystack.length() < needle.length()
                ) {
            return head;
        }
        if(needle.length() ==0){
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needles[0]) {
                head = i;
                int step = 1;
                while (step < needles.length && i+step< haystack.length()) {
                    if (haystack.charAt(i + step) != needles[step]) {
                        head = -1;
                        step = 1;
                        break;

                    } else {
                        step++;
                    }
                }
                if (step == needles.length) {
                    break;
                }else {
                    head = -1 ;
                    step = 1;

                }

            }
        }
        return head;
    }
    public int strStrErfenfa(String haystack, String needle) {
        if(haystack == null || haystack.length()<needle.length()){
            return  -1;
        }
        if(needle.length() == 0) {
            return  0;
        }
        return  help(haystack,needle);

    };
    public int help( String origin , String seed ){
        if(origin.length() < seed.length()) {
            return -1 ;
        }
        else {

            int left = 0 ;
            int right = origin.length();
            int center = (left + right ) / 2 ;
            int leftRes = help(origin.substring(0,center),seed);
            int rightRes = help(origin.substring(center+1,right),seed);
            int mergeRes = findMerge(origin,center,seed);
            int min  = origin.length();

            if(leftRes >0 && leftRes < min){
                min = leftRes;
            } if(rightRes >0 && left < rightRes){
                min = rightRes;
            } if(mergeRes >0 && mergeRes < min){
                min = mergeRes;
            }
            if(min == origin.length()){
                min = -1;
            }
            return  min;

        }

    }
    private int findMerge(String origin , int center ,String goal){
            if(origin.length() < goal.length()){
                return -1;
            }
            char before = origin.charAt(center);
            char after = origin.charAt(center+1);
            int head = -1;
            for(int i = 0 ; i < goal.length()-1 ; i++){
                if(goal.charAt(i) == before && goal.charAt(i+1)== after){
                    int step = 1;
                    while(i-step >= 0 && center - step >=0){
                        if(origin.charAt(center - step) == goal.charAt(i-step)){
                            step++;
                        }
                        else {
                            break;
                        }
                    }
                    if ( --step == i ){
                        int step2 = 1;
                        int base = i+1;
                        while(base + step2 <goal.length()&& (center +1 +step2) < origin.length()){
                            if(origin.charAt(center+1+step2) == goal.charAt(base+step2)){
                                step2++;
                            }
                            else {
                                break;
                            }
                        }
                        if(--step2 + step == goal.length()){
                           head = center - step;
                        }
                    }


                }
            }
        return head;



    };

}
