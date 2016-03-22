package algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songheng on 3/17/16.
 */
public class ContainerWithMostWater_11 {
    public int maxArea(int[] height) {
        int max = -1;

       for ( int i = 0 , j = height.length-1;i<j;){
           boolean pos = height[i]>height[j];
           int tmpArea ;
           if(pos){
               tmpArea = height[j] * (j-i);

           }
           else{
               tmpArea = height[i] * (j-i);
           }
           if(tmpArea>max){
               max = tmpArea;
           }
           if(pos){
               j--;
           }
           else {
               i++;
           }
       }
        return max;
    };
}
