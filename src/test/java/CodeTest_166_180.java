import algorithm.leet_166_180.*;
import org.junit.Test;

/**
 * Created by songheng on 5/18/16.
 */
public class CodeTest_166_180 {
    @Test
    public void test166() {
        Fraction_to_Recurring_Decimal_166 fra = new Fraction_to_Recurring_Decimal_166();
//        System.out.println(fra.fractionToDecimal(1, 5));
//        System.out.println(fra.fractionToDecimal(1, 6));
//        System.out.println(fra.fractionToDecimal(1, 9));
//        System.out.println(fra.fractionToDecimal(1, 7));
//        System.out.println(fra.fractionToDecimal(1, 99));
        System.out.println(fra.fractionToDecimal(1, 90));

//        System.out.println(fra.fractionToDecimal(Integer.MIN_VALUE, -1));
    }

    @Test
    public void test168() {
        Excel_Sheet_Column_Title_168 excel = new Excel_Sheet_Column_Title_168();
        System.out.println(excel.convertToTitle(1));
        System.out.println(excel.convertToTitle(52));
        System.out.println(excel.convertToTitle(Integer.MAX_VALUE));
    }

    @Test
    public void test172() {
        FactorialTrailingZeroes_172 fact = new FactorialTrailingZeroes_172();
        System.out.println(fact.trailingZeroes(10));
    }

    @Test
    public void test174() {
        Dungeon_Game_174 dungon = new Dungeon_Game_174();
        System.out.println(dungon.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
        System.out.println(dungon.calculateMinimumHP(new int[][]{{2, -3}}));
        System.out.println(dungon.calculateMinimumHP(new int[][]{{-2, 5}}));

    }

    @Test
    public void test179() {
        Largest_Number_179 larger = new Largest_Number_179();
//        System.out.println(larger.largestNumber(new int[]{32,32311}));
//        System.out.println(larger.largestNumber(new int[]{32,32341}));
        System.out.println(larger.largestNumber(new int[]{121, 12}));
        System.out.println(larger.largestNumber(new int[]{12, 121}));
//        System.out.println(larger.largestNumber(new int[]{1,1,1}));
//        System.out.println(larger.largestNumber(new int[]{0}));
    }
}
