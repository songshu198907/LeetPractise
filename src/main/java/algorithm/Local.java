package algorithm;

import java.util.*;

/**
 * Created by songheng on 3/28/16.
 */
public class Local {
    public static void main(String[] args) {

        String str = "[\"zip\"],[\"eta\"],[\"tux\"],[\"lap\"],[\"map\"],[\"irk\"],[\"job\"],[\"yuk\"],[\"cut\"],[\"hug\"],[\"run\"],[\"chi\"],[\"hep\"],[\"ell\"],[\"oho\"],[\"ton\"],[\"tan\"],[\"nod\"],[\"lox\"],[\"had\"],[\"lot\"],[\"fit\"],[\"hot\"],[\"fat\"],[\"kim\"],[\"fin\"],[\"net\"],[\"rut\"],[\"ran\"],[\"kit\"],[\"rca\"],[\"iva\"],[\"fag\"],[\"jam\"],[\"coy\",\"coy\"],[\"non\"],[\"liz\"],[\"hui\"],[\"put\"],[\"add\"],[\"lei\"],[\"sue\"],[\"lad\"],[\"she\"],[\"mes\"],[\"our\"],[\"pen\"],[\"vic\"],[\"aol\"],[\"bud\"],[\"ken\"],[\"nap\"]";
        String str2 = "[\"run\"],[\"oho\"],[\"nap\"],[\"put\"],[\"job\"],[\"bud\"],[\"irk\"],[\"jam\"],[\"had\"],[\"tan\"],[\"hep\"],[\"chi\"],[\"coy\",\"coy\"],[\"pen\"],[\"non\"],[\"hug\"],[\"map\"],[\"eta\"],[\"net\"],[\"kim\"],[\"zip\"],[\"iva\"],[\"vic\"],[\"lot\"],[\"she\"],[\"liz\"],[\"fit\"],[\"tux\"],[\"ran\"],[\"hui\"],[\"rut\"],[\"rca\"],[\"lap\"],[\"cut\"],[\"fag\"],[\"ken\"],[\"kit\"],[\"our\"],[\"add\"],[\"lad\"],[\"yuk\"],[\"mes\"],[\"lox\"],[\"hot\"],[\"aol\"],[\"fat\"],[\"nod\"],[\"ton\"],[\"ell\",\"fin\"],[\"lei\"],[\"sue\"]";
        str = str.replaceAll("\"","");
        str2 = str2.replaceAll("\"","");
        String[] tmp1 = str.split(",\\[");
        String[] tmp2 =str2.split(",\\[");
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for(String strs :tmp1){
            set1.add(strs.replaceAll("\\[","").replaceAll("]",""));
        }
        for(String strs :tmp2){
            set2.add(strs.replaceAll("\\[","").replaceAll("]",""));
        }
        System.out.println(set1);
        System.out.println( set1.equals(set2));
        for(String strs : set1){
            if(!set2.contains(strs)){
                System.out.println(strs);
            }
        }
        System.out.println("===============");
        for(String strs : set2){
            if(!set1.contains(strs)){
                System.out.println(strs);
            }
        }


    }
}
