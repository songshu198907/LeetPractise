package algorithm;

/**
 * Created by songheng on 3/17/16.
 */
public class IntegertoRoman_12 {

    public String intToRoman(int num) {
       String[][] digit ={{"0","I","II","III","IV","V","VI","VII","VIII","IX"},{"0","X","XX","XXX","XL","L","LX"
               ,"LXX","LXXX","XC"},{"0","C","CC","CCC","CD","D",
               "DC","DCC","DCCC","CM"},{"0","M","MM","MMM"}};
        StringBuilder sb = new StringBuilder();
        int thousand = num / 1000 ;
        num -= thousand*1000;
        int hundred  = num/100;
        num -= hundred*100;
        int tens = num / 10 ;
        num -= tens *10 ;
        if( thousand > 0){
            sb.append(digit[3][thousand]);

        }

        if( hundred > 0){
            sb.append(digit[2][hundred]);

        }
        if( tens > 0){
            sb.append(digit[1][tens]);

        }
        if( num > 0){
            sb.append(digit[0][num]);

        }
        return  sb.toString();

    }
}
