package algorithm.leet_61_75;

/**
 * Created by songheng on 4/1/16.
 */
public class SqrtX_69 {
    public int mySqrt(int x) {
        if(x == 0 ){
            return  0;
        }
        int prev , position = 0;
        prev = -1;
        while(position<x){
            if(prev < x && position*position >= x){
                break;
            }

            prev = position*position;
            position += 2;
        }
        if(position*position == x){
            return  position;
        }
        else {
            return  position -1;
        }

    }

    public int test2(int a ){
        int root = 0 ;
        int rem = 0 ;
        int divisor = 0;
        for(int i=0; i<16; i++){

            root <<= 1;
            rem = ((rem << 2) + (a >> 30));
            a <<= 2;
            divisor = (root<<1) + 1;
            if(divisor <= rem){
                rem -= divisor;
                root++;
            }
        }
        return root;
    }


}
