package algorithm;

/**
 * Created by songheng on 3/14/16.
 */
public class ZigZag_Conversion_6 {
    public String convert(String s, int numRows) {
        String result = "";
        if (s==null|| s.length()==0 || numRows ==1){
            return  s;
        }
        String[] tmp = s.split("");
        StringBuilder[] sb = new StringBuilder[numRows];
        for ( int start =0 ; start < numRows ; start++){
            sb[start] = new StringBuilder();
        }
        if( numRows == 2){
            for (int i =0 ; i<tmp.length;i++){
                int a = i%2;
                sb[a].append(tmp[i]);
            }
            return sb[0].toString()+sb[1].toString();
        }
        boolean flag = true;
        int row = 0 ;

        for ( int i = 0 ; i < tmp.length;i++ ){
             if(flag){
                 sb[row].append(tmp[i]);
                 row ++;
                 if(row == numRows){
                     flag = !flag;
                     row = numRows-2;

                 }
             }
            else {
                 sb[row].append(tmp[i]);
                 row--;
                 if(row<=0){
                     row = 0 ;
                     flag = ! flag;
                 }
             }

        }
        for(int cur = 0 ; cur < numRows ; cur++){
            result += sb[cur].toString();
        }

        return  result;

    };

    public String convert_better(String s, int nRows) {
        if(s == null || s.length()==0 || nRows <=0)
            return "";
        if(nRows == 1)
            return s;

        StringBuilder res = new StringBuilder();
        int size = 2*nRows-2;
        for(int i=0;i<nRows;i++){
            for(int j=i;j<s.length();j+=size){
                res.append(s.charAt(j));
                if(i != 0 && i != nRows - 1){//except the first row and the last row
                    int temp = j+size-2*i;
                    if(temp<s.length())
                        res.append(s.charAt(temp));
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        ZigZag_Conversion_6 zig = new ZigZag_Conversion_6();
        String res = zig.convert("ABCDEFGHIJK",4);
        System.out.println(res);
    }
}
