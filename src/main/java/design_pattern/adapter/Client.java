package design_pattern.adapter;

/**
 * Created by songheng on 9/6/16.
 */
public class Client {
    public static void main(String[] args) {
//        ScoreOperation operation ;
//        operation = (ScoreOperation) XMLUtil.getBean();
//        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};
//        int result[] ;
//        int score;
//        System.out.println("After sorting: ");
//        result = operation.sort(scores);
//        System.out.println(Arrays.toString(result));
//
//        System.out.println("Search for 90:");
//        score = operation.search(result, 90);
//        if(score == -1){
//            System.out.println("Score 90 not found !");
//        }else {
//            System.out.println("Found score 90 ");
//        }
//        System.out.println("Search for score 92");
//        score = operation.search(result, 92);
//        if(score == -1){
//            System.out.println("Not found score 92");
//        }else {
//            System.out.println("Found score 92");
//
//        }
        IDAO dao = new DBAdapter();
        dao.save("buzhisuocuo");
    }
}
