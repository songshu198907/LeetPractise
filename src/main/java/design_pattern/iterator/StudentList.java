package design_pattern.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songheng on 9/14/16.
 */
public class StudentList {
    private List<Student> students;

    public StudentList(List<Student> list) {
        students = list;
    }

    public Iterator getIterator() {
        return new StudentIt();
    }

    private class StudentIt implements Iterator {
        private int cur1;

        public StudentIt() {
            Collections.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
            cur1 = 0;
        }

        @Override
        public boolean hasNext() {
            return cur1 < students.size();
        }

        @Override
        public Object next() {
            return students.get(cur1++);
        }


    }
}
