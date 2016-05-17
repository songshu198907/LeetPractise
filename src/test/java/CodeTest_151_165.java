import algorithm.leet_151_165.*;
import org.junit.Test;

/**
 * Created by songheng on 5/17/16.
 */
public class CodeTest_151_165 {
    @Test
    public void test152() {
        Maximum_Product_Subarray_152 max = new Maximum_Product_Subarray_152();
        max.maxProduct(new int[]{2, 1, 0, 3, -3, -2, 0, -2, 4});
    }

    @Test
    public void test155() {
        MinStack stack = new MinStack();
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }

    @Test
    public void test162() {
        Find_Peak_Element_162 find = new Find_Peak_Element_162();
        System.out.println(find.findPeakElement(new int[]{1, 2}));
        System.out.println(find.findPeakElement(new int[]{1}));
        System.out.println(find.findPeakElement(new int[]{1, 2, 3, 1}));
    }


    @Test
    public void test164() {
        Maximum_Gap_164 gap = new Maximum_Gap_164();
        System.out.println(gap.maximumGap(new int[]{1, 3, 4, 0, 2, 6, 8, 9, 11, 13}));
    }

    @Test
    public void test165() {
        Compare_Version_Numbers_165 compare = new Compare_Version_Numbers_165();
        System.out.println(compare.compareVersion("1.10", "1.1"));
        System.out.println(compare.compareVersion("1.1", "1.1"));
        System.out.println(compare.compareVersion("0.9", "1.1"));
        System.out.println(compare.compareVersion("1.0", "1"));
        System.out.println(compare.compareVersion("1.4.0.0.0.0", "1.4"));
    }
}
