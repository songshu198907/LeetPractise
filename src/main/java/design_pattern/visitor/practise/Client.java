package design_pattern.visitor.practise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songheng on 9/19/16.
 */
public class Client {
    public static void main(String[] args) {
        List<Staff> list = new ArrayList<>();
        list.add(new Student("郭靖", 1, 55));
        list.add(new Student("黄蓉", 3, 99));
        list.add(new Teacher("洪七公", 3, 91));
        list.add(new Teacher("黄老邪", 11, 80));
        AwardCheck check;

        check = new TechAward();
        for (Staff staff : list) {
            staff.accept(check);
        }
        check = new AcademicAward();
        for (Staff staff : list) {
            staff.accept(check);
        }
    }
}
