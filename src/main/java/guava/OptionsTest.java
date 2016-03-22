package guava;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/**
 * Created by songheng on 3/18/16.
 */
public class OptionsTest {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(23);
        System.out.println(possible.isPresent());
        System.out.println(possible.get());

        System.out.println(possible.asSet());


//        Optional<Integer> possible2= Optional.absent();
//        System.out.println(possible2.isPresent());
//        System.out.println(possible2.get());
//
//        System.out.println(possible2.asSet());
        Optional pos = Optional.fromNullable(null);
        System.out.println(pos.isPresent());
        System.out.println(pos.orNull());
        int a = 1 ,b = 10 ;

        Preconditions.checkArgument(a >= b , "expect a>=b , but %s < %s" , a,b);


    }
}
