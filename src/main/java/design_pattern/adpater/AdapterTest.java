package design_pattern.adpater;

/**
 * Created by shu on 6/21/2016.
 */
public class AdapterTest {
    public static void main(String[] args) {
//        Wrapper adapter = new Wrapper(new Source());
//       adapter.method1();
//        adapter.method2();
        Sourceable sub1 = new SourceSub1();
        Sourceable sub2 = new SourceSub2();
        sub1.method1();
        sub2.method2();


    }
}
